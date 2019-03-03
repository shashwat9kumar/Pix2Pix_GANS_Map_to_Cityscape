//overloading the script index operator of array

#include<iostream>

using namespace std;

class test
{
public:

    int *arr;
public:
    test()
    {
        arr=new int[5];
    }
    void fillArr()
    {
        for(int i=0;i<5;i++)
            arr[i]=i;
    }
    int operator[](int a)
    {
        if(a>-1 && a<5)
        {
             return 1;
        }
        else
        {
            return 0;
        }
    }

};
int main()
{
    test t;
    t.fillArr();
    int a=t.arr[2];
    if(a==1)
        cout<<"VALID INDEX"<<endl;
    else
        cout<<"INVALID INDEX"<<endl;
    return 0;
}
