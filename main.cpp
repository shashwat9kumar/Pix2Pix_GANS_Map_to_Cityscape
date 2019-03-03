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
    hello o1();
    hello o2(5);
    hello o3(3,8);
    return 0;
}
*/
