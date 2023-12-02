Introduction
************
Declaring a class inside another class is called inner class.
We should go for inner class concept , in scenario like when the inner class is used only in one time , not frequent.

Anonymous Inner Classes:
***********************
Java supports anonymous inner classes, which are useful for creating instances of classes on the fly,
often used in scenarios like event handling. This can lead to more concise code.







Inner class 
************

Syntax for Inner class Object.

<Outerclass>.<Innerclass> <referenceVariable> =<OuterClass variable>.new <Innerclass>();

class Test
{
	int x=10;

	void m1(){
		System.out.println("Test m1 method");
	}
	class UnitTest
	{
		int y=10;
		void m2(){
		System.out.println("UnitTest m2 method");
		}
	}
}

class  Demo
{
	public static void main(String[] args) 
	{
		Test t=new Test();
		t.m1();

		
		Test.UnitTest ut1=t.new UnitTest();
		ut1.m2();
		

	}
}


D:\JavaCode>java Demo
Test m1 method
UnitTest m2 method
**************************************************************************************************

Without Annonymous inner class implementation 
*********************************************

class Parent
{
	void m1(){
		System.out.println("Parent Implementation");
	}
}

class Child extends Parent
{
	void m1(){
		System.out.println("Child Implementation");
	}
}


class  Test
{
	public static void main(String[] args) 
	{
		Parent p=new Child();
		p.m1();
	}
}

---------------------------------------------------------------------------------------------
with Annonumous Inner class Implementation
******************************************
class Parent
{
	void m1(){
		System.out.println("Parent Implementation");
	}
}


class  Test
{
	public static void main(String[] args) 
	{
		Parent p=new Parent(){
			void m1(){
			System.out.println("New  Implementation");
	}
		};
		p.m1();
	}
}

**************************************************************************************************
Using Interface Logic in annonymous Inner class.

Without Annonymous Inner class.
******************************
abstract class A{
	abstract void m1();
}

class B extends A
{
	void m1(){
		System.out.println("Implement m1");
	}
}

class  Test
{
	public static void main(String[] args) 
	{
		A a =new B();
		a.m1();
	}
}


With Annonymous Inner class.
****************************
abstract class A
{
	abstract void m1();
}
class  Test
{
	public static void main(String[] args) 
	{
		A a =new A(){
		
		void m1(){
		System.out.println("Implement m1 new Logic");
		}			
	};
		a.m1();
	}
}


**************************************************************************************************
For Interface with annonymous Inner class implementation.

interface  A
{
	void m1();
}
class  Test
{
	public static void main(String[] args) 
	{
		A a =new A(){
		 public void m1(){
		System.out.println("Implement m1 new Logic for Interface");
		}			
	};
		a.m1();
	}
}

**************************************************************************************************
**************************************************************************************************
**************************************************************************************************
**************************************************************************************************
