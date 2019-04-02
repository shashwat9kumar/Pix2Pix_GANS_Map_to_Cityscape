#include<iostream>
#include<conio.h>
#include<string.h>
using namespace std;

class calc
{
	int add(int a,int b)
	{
		return a+b;
	}

	int sub(int a,int b)
	{
                return a-b;
	}

	int mul(int a,int b)
	{
                return a*b;
	}

	int div(int a,int b)
	{
                return a/b;
	}
};

int main()
{
	cout<<add(7,3)<<endl;
	cout<<sub(7,3)<<endl;
	cout<<mul(7,3)<<endl;
	cout<<div(7,3)<<endl;
	return 0;
}



