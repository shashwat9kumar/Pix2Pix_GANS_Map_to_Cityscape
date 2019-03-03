//overloading binary + operator

#include<iostream>

using namespace std;

class test
{
    int a,b;
public:
    test()
    {
        a=0;
        b=0;
    }
    test(int x,int y)
    {
        a=x;
        b=y;
    }
    void display()
    {
        cout<<a<<"\t"<<b<<endl;
    }
    test operator+(test &t)
    {
        test temp;
        temp.a=a+t.a;
        temp.b=b+t.b;
        return temp;
    }
};

int main()
{
    test t1(6,7);
    test t2(1,2);
    test t3;
    t3=t1+t2;
    t3.display();
    return 0;
}

