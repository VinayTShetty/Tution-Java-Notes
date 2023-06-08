Variables are 3 Types in Java

1)Instance Variables
2)static variables
3)Local variables.



Rules for Declaring Variables.

1)Variables name should be unique for each declaration.
2)Repetion of the variable name is not allowed in java.
3)Object Creaation is also considered as a variable declaration.
4)Variable Declaration name and Method declaration name can be same no issue.
  Reason is Variable calling by compiler
  			&
  Method calling by compiler will be different.


Cases:- 
*******
1)Variables name should be unique for each declaration.

class Test
{
	static int x=100;
	int y=100;
	int xy=500;
}

2)Repetion of the variable name is not allowed in java.

class Test 
{

	int x=100;
	int y=100;
	int x=500;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

Test.java:6: error: variable x is already defined in class Test
        int x=500;
            ^
1 error

3)Object Creaation is also considered as a variable declaration.

	class Test 
{
	int x=100;
	static int y=500;
	Test t=new Test(); // Object Creation with variable t
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

4)Variable Declaration name and Method declaration name can be same no issue.
  Reason is Variable calling by compiler
  			&
  Method calling by compiler will be different.

class Test 
{
	int x=100;
	public static void main(String[] args) 
	{
		System.out.println("Varaible Declaration and Method Declaration same name");
	}

	public static void x(){
	}
}
