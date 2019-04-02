#include<iostream>
using namespace std;

class calculator
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
	cout<<add(4,5)<<endl;
	cout<<sub(4,5)<<endl;
	cout<<mul(4,5)<<endl;
	cout<<div(4,5)<<endl;
	return 0;
}



