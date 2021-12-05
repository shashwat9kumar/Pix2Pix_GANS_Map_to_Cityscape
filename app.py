import streamlit as st
from PIL import Image
import numpy as np
import tensorflow as tf
import wget


def load_image(img):
    im = Image.open(img)
    im = im.resize((256,256))
    image = np.array(im)
    return image

def getImage(image):
    prediction_image = tf.expand_dims(image, axis=0)
    prediction_image = tf.cast(prediction_image, dtype=tf.float32)
    prediction_image = (prediction_image / 127.5) -1
    return prediction_image


url = "https://deploymentbucketformlmodel.s3.ap-south-1.amazonaws.com/generator.h5"
filename = wget.download(url)
model = tf.keras.models.load_model(filename)


st.title("Pix2Pix Map to Aerial Image Generator")
filepath = st.file_uploader(label = "Upload an image", type=['jpg', 'png'])

if filepath:
    img = load_image(filepath)


    col1, mid, col2 = st.columns([3,1,3])
    col1.header("Original Image")
    col1.image(img)


    # st.header("Original Image")
    # st.image(img)

    predic_image = getImage(img)

    generated_image = model.predict(predic_image)
    generated_image = tf.cast(generated_image, dtype = tf.float32)
    generated_image = tf.squeeze(generated_image, axis=0)
    generated_image = (generated_image+1)/2.0
    generated_image = np.array(generated_image)

    arrow = Image.open("arrow.png")
    arrow = np.array(arrow)
    mid.header(" ")

    mid.header(" ")
    

    mid.text(" ")

    mid.image(arrow)

    col2.header("Modified Image")
    col2.image(generated_image)
    # st.header("Generated Image")
    # st.image(generated_image)


else:
    st.info("Upload an image")
