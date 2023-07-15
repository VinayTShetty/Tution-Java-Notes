Object creation is  In-valid for abstract class.

abstract class Test
{
	abstract public void m1();

	public static void main(String[] args) 
	{
		Test t=new Test();
		System.out.println("Abstract Concept");
	}
}


D:\JavaCode>javac Test.java
Test.java:7: error: Test is abstract; cannot be instantiated
                Test t=new Test();
                       ^
1 error
**************************************************************************************************************
If a class contains atleas one abstract methods then the class is declared as abstract.

Error Code
----------
class Test
{
	abstract public void m1();

	public static void main(String[] args) 
	{
		System.out.println("Abstract Concept");
	}
}


D:\JavaCode>javac Test.java
Test.java:1: error: Test is not abstract and does not override abstract method m1() in Test
class Test
^
1 error

This erro code can be resolved by making the class as abstract.
----------------------------------------------------------------
abstract class Test
{
	abstract public void m1();

	public static void main(String[] args) 
	{
		System.out.println("Abstract Concept");
	}
}

**************************************************************************************************************
An abstract class can have all the method s as concrete methods and still can be declared as abstract. 
		Just to avoid Object Creation.

abstract class Test
{
	 public void m1(){
		System.out.println("Instance method m1");
	 } 
	 public static  void m2(){
		System.out.println("Static method m1");
	 }

	public static void main(String[] args) 
	{
		System.out.println("Abstract Concept");
	}
}


**************************************************************************************************************
abstract class can have main method also.

abstract class Test
{
	 int x=10;
	public static void main(String[] args) 
	{
		System.out.println("Main Method Abstract class");
	}
}

**************************************************************************************************************
Abstract modifier is applicable for methods and classes but not for variables.

abstract class Test
{
	abstract int x=10;
	public static void main(String[] args) 
	{
		System.out.println("Abstract Concept");
	}
}

D:\JavaCode>javac Test.java
Test.java:3: error: modifier abstract not allowed here
        abstract int x=10;
**************************************************************************************************************
abstract method implementation should be provided in child class es.

abstract class Parent
{
	abstract void m1();

}

class Child extends Parent
{

	void m1(){
		System.out.println("M1 method");
	}

		public static void main(String[] args) 
	{
		Child c =new Child();
		c.m1();
		System.out.println("Main Method Abstract class");
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Child
M1 method
Main Method Abstract class

**************************************************************************************************************
abstract class can have non-abstract method(Normal/Concerete Method s) and abstract methods both.

abstract class Test
{

	abstract void m1();

	abstract int m2();

	void m3(){
		System.out.println("M1 instance method");
	}

	static void m4(){
	   System.out.println("M2 static method");
	}

	public static void main(String[] args) 
	{
		System.out.println("Test Main Method");
	}

}
**************************************************************************************************************
abstract class can have constrctor also.
 Note:- 
 Interview Question:- If the class is abstract we cannot create a Object for that class.
                      If we cannot create Object for the abstract class , How can we execute the constructor of the abstract class.
						 Solution:- We can execute abstract class constructor by the following steps
						            1)Implement the abstract methods in the child class.(i.e extends keyword )
									2)Create the Object for implemented child class,
									In this manner we can execute abstract class constructor.


abstract class Parent
{
	Parent(){
		System.out.println("Parent Constrcutor");
	}
	abstract void m1();

}

class Child extends Parent
{
	Child(){
		System.out.println("Child Constrcutor");
	}

	void m1(){
		System.out.println("Child M1 method");
	}

		public static void main(String[] args) 
	{
		Child c =new Child();
		c.m1();
		System.out.println("Main Method Child class");
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Child
Parent Constrcutor
Child Constrcutor
Child M1 method
Main Method Child class

**************************************************************************************************************
abstract and static key word are invalid(illegal combination of modifiers).
   Reason :- We provide abstract keyword to the method to provide implementation/Override the parent class method in child class.
             But static methods we cannot override.(It will come under Method Hiding).
			 Therefore we cannot use both static and abstract together.



abstract class Parent
{
	abstract static void m1();
}

class Child extends Parent
{
	static void m1(){
		System.out.println("Child static method");
	}
		public static void main(String[] args) 
	{
		System.out.println("Main Method Child class");
	}
}



D:\JavaCode>javac Test.java
Test.java:3: error: illegal combination of modifiers: abstract and static
        abstract static void m1();
                             ^
1 error

**************************************************************************************************************
