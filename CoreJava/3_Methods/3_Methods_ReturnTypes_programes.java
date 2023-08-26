
Example 1

Return type is void.

class Test
{
	int x=10;
	void m1(){
		System.out.println("return type concept is not implemented");
	}
	public static void main(String[] args) {
		System.out.println("Helloww");
	}
}

*********************************************************************************************

return type int

class Test
{
	int m1(){
		System.out.println("return type concept is not implemented");
		return 10;
	}
	public static void main(String[] args) {
		System.out.println("Helloww");
	}
}
*************************************************************************************************
Syntax error:-
Method is expecting a return type of int type.
But i am not return ing anything so getting an error.

class Test
{
	int m1(){
		System.out.println("return type concept");
	}
	public static void main(String[] args) {
		System.out.println("Helloww");
	}
}

D:\JavaCode>javac Test.java
Test.java:5: error: missing return statement
        }
        ^
1 error
*************************************************************************************************
Method is expecting a return type of int so we are providing a return type value of 10.

class Test
{
	int m1(){
		System.out.println("return type concept");
		return 10;
	}
	public static void main(String[] args) {
		System.out.println("Heslloww");
	}
}

*************************************************************************************************
Directly we can provide values for the return types.
We can provide variables values also for return types.

class Test
{
	int m1(){
		System.out.println("return type concept");
		return 10;
	}
	public static void main(String[] args) {
		System.out.println("Hellow");
	}
}


*************************************************************************************************
Using the return type to get some value.

class Test
{
	int m1(){
		System.out.println("return type concept");
		return 10;
	}
	public static void main(String[] args) {
		System.out.println("Main Method Starts");
		Test t=new Test();
		int x=t.m1();
		System.out.println(x);
	}
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Main Method Starts
return type concept
10

Assignemt:- use the same Case for boolean,And use if else loop for executing
1)If once
2)else once.
*************************************************************************************************
Using Return type to get the value.
Using that value doing some computation.

class Test
{
	int m1(){
		System.out.println("return type concept");
		return 10;
	}
	public static void main(String[] args) {
		System.out.println("Main Method Starts");
		Test t=new Test();
		int x=t.m1();
		System.out.println(x+500);
	}
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Main Method Starts
return type <concept></concept>
510

*************************************************************************************************
Using TypeCasting.
i.e Narrowing.

FYI:- Using lower value dataType for higher return data types.
*************************************************************************************************
Type Casting Examples missed.
Definition also not Covered.
*************************************************************************************************
*************************************************************************************************
*************************************************************************************************
*************************************************************************************************
*************************************************************************************************
*************************************************************************************************
*************************************************************************************************
*************************************************************************************************
*************************************************************************************************
*************************************************************************************************
*************************************************************************************************
*************************************************************************************************
*************************************************************************************************