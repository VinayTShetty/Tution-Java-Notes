Constructor Keywords
********************	

this.
super.


Main Purpose
************
this. --->is used to refer current class variable/ methods.
super.--->is used to refer parent class  variable/methods.

this. -->is maily used to assign some values to the  variables during constructor execution.

where its used
**************
this. and super. are always used in instance area.
We cannot use it in static area.

Programe
********
this. is used to refer current class variables.

class Test 
{
	int x=10;
	static int y=20;

		public static void main(String[] args) 
	{
			Test t=new Test();
			t.m1();
    		System.out.println("Main Method");
	}

	public void m1(){
		System.out.println(this.x);
		System.out.println(this.y);
	}	
}

D:\JavaCode>java Test
10
20
Main Method

****************************************************************************************
super is used to refer parent class variable.

class Exam
{
	int a=100;
	static int b=200;
}

class Test extends Exam
{
	int x=10;
	static int y=20;

		public static void main(String[] args) 
	{
			Test t=new Test();
			t.m1();
		System.out.println("Main Method");
	}

	public void m1(){
		// Current class variables
		System.out.println(this.x);
		System.out.println(this.y);

		//Parent class variables
		System.out.println(super.a);
		System.out.println(super.b);
	}
	
}

D:\JavaCode>java Test
10
20
100
200
Main Method
****************************************************************************************
this. is used to refere curren class Methods(Instance and Static)

this. is used to refer current class instance methods
--------------------------------------------------
class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		Test t=new Test();
		t.m1();
	}
	void m1(){
		System.out.println("Instance Method m1");		
		this.m2();
	}
	 void m2(){
		System.out.println("Instance Method m2");		
	}
}

D:\JavaCode>java Test
Main Method
Instance Method m1
Instance Method m2

this. is used to refer current class static method
--------------------------------------------------
class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		Test t=new Test();
		t.m1();
	}
	void m1(){
		System.out.println("Instance Method m1");		
		this.m2();
	}
	static void m2(){
		System.out.println("Static Method m2");		
	}
}

D:\JavaCode>java Test
Main Method
Instance Method m1
Static Method m2
****************************************************************************************
Note:- Please use Parent class method names and Child class method names differen to avoid OverRiding concepts

class Exam
{
	static void m1(){
		System.out.println("Parent class static m1-method");
	}

	void m2(){
		System.out.println("Parent class instance m2-method");
	}
}

class Test extends Exam
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		Test t=new Test();
		t.m3();
	}
	void m3(){
		System.out.println("Child class Instance Method m1");		
		super.m1();
		super.m2();
	}
}

:\JavaCode>java Test
Main Method
Child class Instance Method m1
Parent class static m1-method
Parent class instance m2-method
****************************************************************************************
this. is used to assign some values to the instance variable during Constructor execution.

Example 1   :- Assigining a single value.
*********

class Test
{
	int x;

	Test(int a){		
		this.x=a;
	}
	 public static void main(String[] args) 
	{
		 Test t=new Test(100);
		System.out.println("Main Method");		
		System.out.println(t.x);		
	}	
}

D:\JavaCode>java Test
Main Method
100

Example 2  :- Assiginig mulitple value.
********

class Test
{
	int x;
	static int y;

	Test(int a,int b){		
		this.x=a;
		this.y=b;
	}
	 public static void main(String[] args) 
	{
		 Test t=new Test(100,500);
		System.out.println("Main Method");		
		System.out.println(t.x);		
		System.out.println(y);		
	}	
}

D:\JavaCode>java Test
Main Method
100
500


Example 3:-this. is used to assign value to instance variable. 
*******    In this case the local variable name is same as instance variable


class Test
{
	int x;
	static int y;

	Test(int x,int y){		
		this.x=x;
		this.y=y;
	}
	 public static void main(String[] args) 
	{
		 Test t=new Test(800,600);
		System.out.println("Main Method");		
		System.out.println(t.x);		
		System.out.println(y);		
	}	
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Main Method
800
600

****************************************************************************************
this. key word we cannot use it in static Area.

class Test extends Exam
{
	int x=10;
	static int y=20;
		public static void main(String[] args) 
	{
		System.out.println("Main Method");
	}
	
	static void m1(){
		System.out.println(this.x);
	}
}

D:\JavaCode>javac Test.java
Test.java:11: error: non-static variable this cannot be referenced from a static context
                System.out.println(this.x);