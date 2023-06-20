Constructor
***********

Object creation syntax
**********************
class Test
{

}

Test t = new Test ();

Test ---> class Name
t ---> userdefiend Reference variables
= ---> assignment operator
new ---> keyword used to create object
Test () ---> constructor
; ---> statement terminator

When we create new instance (Object) of a class using new keyword, 
constructor for that class is Executed.

Rules for Declaring Constructor
*******************************
1)Constructor name class name should be same.
2)Constructor should be declared inside the class.Outside the Method Block/Loop.
3)Nesting of Constructor is not allwed.
4)Only Modifer applicable for constructor is 'public','private','protected'
5)OverLoading of the Constructor is valid.
6)OverLoading of the Constructor with the same method signature is not allowed.
7)There is no return type concept applicable for the constructor.
8)If we are not writing any constructor for a class,then compiler will create on Default constructor with empty implementation.

Syntax for creating a Constructor
*********************************
<ModifierName><class Name>(){
	
}

class Test
{
	public Test(){
		
	}
}

Note:-
ModifierName-->Modifier Name is optional.

valid:-
******
class Test
{
	Test(){
		
	}
}


There are two types of constructors
***********************************
1) Default Constructor (provided by compiler).
2) User defined Constructor (provided by user) or parameterized constructor

Default Constructor:-
*******************
1) Inside the class if we are not declaring at least one constructor then compiler generates zero 
argument constructors with empty implementation at the time of compilation.
2)The compiler generated constructor is called default constructor. 
3)Inside the class default constructor is invisible.
4)Default Constructor are zero-argument constructor.
  But all Zero-argument constructor are not default constructor.

User defined Constructor:-
**************************
1)The constructors which are declared by user are called user defined constructor.
2)Inside the class if we are declaring at least one constructor (either 0-arg or parameterized) 
  then compiler won’t generate default constructor.
3)Inside the class if we are not declaring at least one constructor (either 0-arg or parameterized)
  then compiler will generate default constructor.

Advantages of constructors
**************************
1) Constructors are used to write block of java code that code will be executed during object creation.
2) Constructors are used to initialize  variables during object creation.


How to Create a Parameterized Constructor
*****************************************
class Test
{
	Test(int x){
		System.out.println(x);
	}

	public static void main(String[] args) {
		Test t=new Test(10);
	}
}

Test Cases:
***********
1)Executing Parameterized Constructor.

class Test
{
	Test(int x){
		System.out.println("userDefiend Constructor 0 -arg");
		System.out.println(x);
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		Test t=new Test(10);
	}
}

Main Method
userDefiend Constructor 0 -arg
10
------------------------------------------------------------------------------------
2) Overloading of the Constructor is allowed in java.

class Test
{
	Test(){
		System.out.println("userDefiend Constructor 0 -arg");
	}
	Test(int x){
		System.out.println("userDefiend Constructor 1 -arg");
		System.out.println(x);
	}
	Test(int x,int xx){
		System.out.println("userDefiend Constructor 2 -arg");
		System.out.println(x);
		System.out.println(xx);
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		Test t=new Test();
		Test t1=new Test(10);
		Test t2=new Test(30,20);
	}
}

D:\JavaCode>java Test
Main Method
userDefiend Constructor 0 -arg
userDefiend Constructor 1 -arg
10
userDefiend Constructor 2 -arg
30
20
------------------------------------------------------------------------------------
3) OverLoading of the Constructor with the same signature is not allowed.

class Test
{
	Test(int x){
		System.out.println(x);
	}

	Test(int x){
		System.out.println(x);
	}

	public static void main(String[] args) {
		Test t=new Test(10);
	}
}

Test.java:7: error: constructor Test(int) is already defined in class Test
        Test(int x){
        ^
1 error
------------------------------------------------------------------------------------