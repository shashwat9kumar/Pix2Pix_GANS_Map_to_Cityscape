#include<iostream>

using namespace std;

class area
{
    int s1,s2;
public:
    area()
    {
        cout<<"Enter the two sides"<<endl;
        cin>>s1>>s2;
    }

private:
    int calculate(int a)
    {
        return(a*a);
    }

    int calculate(int a,int b)
    {
        return (a*b);
    }

    float calculate(const int *a,const int *b)
    {
        return (float)(0.5*(*a)*(*b));
    }

public:
    void choice()
    {
        cout<<"The area of square is "<<calculate(s1)<<endl;
        cout<<"The area of rectangle is "<<calculate(s1,s2)<<endl;
        cout<<"The area of square is "<<calculate(&s1,&s2)<<endl;
    }
};
/*int main()
{
    area t1;
    t1.choice();
    return 0;
}*/
