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
	cout<<add(2,3)<<endl;
	cout<<sub(2,3)<<endl;
	cout<<mul(2,3)<<endl;
	cout<<div(2,3)<<endl;
	return 0;
}



