#include<iostream>

using namespace std;

class hello
{
    int a,b;
public:
    hello(int x=0,int y=0)
    {
        a=x;
        b=y;
    }
public:
    void show()
    {
        cout<<a<<"\t"<<b<<endl;
    }
};

/*int main()
{
    hello obj1();
    hello obj2(1);
    hello obj3(1,2);
    return 0;
}
*/
