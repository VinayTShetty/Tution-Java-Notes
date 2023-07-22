In OverRiding Please note,
The Object creation is using syntax like

Parentref <user_defined name>= new ChildClassObject();

*****************************************************************************************************************
Example 1:- Overridden method signature & overriding method signatures must be same
*********
class Parent
{
	void marry(){  //OverRidden Method
		System.out.println("Arrange Marriage");
	}
}


class Child extends Parent
{
	void marry(){  //Over Riding Method
		System.out.println("Love Marrriage");
	}
}
------------------------------------------------------------------------------------------------------------------
Example 2:-The return type must be same for overriden and OverRiding Method at primitive Level.
*********

class Parent
{
	int sslc_marks(){
		System.out.println("Distinction/ExcellentPerformance");
		return 95;
	}
}


class Child extends Parent
{
	int sslc_marks(){
		System.out.println("PassMarks/LowPerformance");
		return 35;
	}

	public static void main(String[] args){
		Parent c =new Child();
		c.sslc_marks();
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Child
PassMarks/LowPerformance


Example:-3 Over Riden and OverRiding return Types both are different for primitive data Types. 
**********

class Parent
{
	double sslc_marks(){
		System.out.println("Distinction/ExcellentPerformance/School Toppper");
		return 95;
	}
}


class Child extends Parent
{
	int sslc_marks(){
		System.out.println("PassMarks/LowPerformance/Poor Studying");
		return 35;
	}

	public static void main(String[] args){
		Parent c =new Child();
		c.sslc_marks();
	}
}

D:\JavaCode>javac Test.java
Test.java:12: error: sslc_marks() in Child cannot override sslc_marks() in Parent
        int sslc_marks(){
            ^
  return type int is not compatible with double
1 error
-------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------
Basic Examples for return types.
********************************

Example 4 :- return the same class Type.  
*********

class Bank{}
class SBI extends Bank{}
class MyBank
{
	Bank makeDepositRules(){
		//here we need to return a Bank Object
		Bank b=new Bank();
		return b;
	}

	public static void main(String[] args){
		System.out.println("Test class");
	}
}


D:\JavaCode>javac Test.java

D:\JavaCode>java MyBank
Test class

Example 5 :- return the child class Type is valid for parent level class. 
*********
class Bank{}
class SBI extends Bank{}
class Test
{
	Bank makeDepositRules(){
		//here we need to return a Bank Object , But its valid to return the Child class level also.
		SBI s=new SBI();
		return s;
	}

	public static void main(String[] args){
		System.out.println("Test class 123");
	}
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Test class 123

-------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------
Example 6  :- KeepSame
**********
While overriding it is possible to KeepSame/Change return type by using co-variant return types concept.
This is applicable only for class-level.

class Animal{}
class Dog extends Animal{}

class Parent{
	Animal m1(){
		System.out.println("Animal return Type m1");
		Animal a =new Animal();
		return a;
	}
}
class Child extends Parent{
	Animal m1(){
		System.out.println("Animal return Type m1-Child");
		Animal a =new Animal();
		return a;
	}
	public static void main(String[] args){
		Parent p =new Child();
		p.m1();
	}
}
D:\JavaCode>javac Test.java
D:\JavaCode>java Child
Animal return Type m1-Child
-----------------------
Example 6.1:-Change
***********
While overriding it is possible to KeepSame/Change return type by using co-variant return types concept.
This is applicable only for class-level.

class Animal{}
class Dog extends Animal{}

class Parent{
	Animal m1(){
		System.out.println("return type Animal");
		Animal a =new Animal();
		return a;
	}
}
class Child extends Parent{
	Dog m1(){
		System.out.println("return type Dog");
		Dog d =new Dog();
		return d;
	}
	public static void main(String[] args){
		Parent p =new Child();
		p.m1();
	}
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Child
return type Dog
-------------------------------------------------------------------------------------------------------------------
Example 7:-If an overridden method is final it is not possible to override that method in child class.

class Parent{
	final void education(){
		System.out.println("Degree");
	}
}
class Child extends Parent{
	final void education(){
		System.out.println("School Drop Out");
	}
	public static void main(String[] args){
		Parent p =new Child();
		p.education();
	}
}

D:\JavaCode>javac Test.java
Test.java:7: error: education() in Child cannot override education() in Parent
        final void education(){
                   ^
  overridden method is final
1 error

Note:- Additional information
	final applied to a class prevents it from inheritance.
	final applied to method prevents it from Overriding.
-------------------------------------------------------------------------------------------------------------------
Example 8:- static methods we cannot override.
	        So we are getting Degree as Output.
			

class Parent{
	static void education(){
		System.out.println("Degree");
	}
}
class Child extends Parent{
	static void education(){
		System.out.println("School Drop Out");
	}
	public static void main(String[] args){
		Parent p =new Child();
		p.education();
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Child
Degree
-------------------------------------------------------------------------------------------------------------------
Example 9:- Private method we can t overRide.

class Parent{
	private void education(){
		System.out.println("Degree");
	}
}
class Child extends Parent{
	private void education(){
		System.out.println("School Drop Out");
	}
	public static void main(String[] args){
		Parent p =new Child();
		p.education();
	}
}

D:\JavaCode>javac Test.java
Test.java:12: error: education() has private access in Parent
                p.education();
                 ^
1 error
-------------------------------------------------------------------------------------------------------------------
Example 10:- In both the cases Overriding is possible
			 Abstract to Non-Abstract
						&
		    Non-abstract to abstract 

Example 10.1:- abstract to Non-abstract

	abstract class Parent {
	abstract void higherEducation();
}

class Child extends Parent{
	void higherEducation(){
		System.out.println("Reputed University");
	}
	public static void main(String[] args){
		Parent p=new Child();
		p.higherEducation();
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Child
Reputed University

Example 10.2:-Non-abstract to abstract 

this approach is helpful to stop availability of Parent method implementation to
the next level child classes

	class Parent {
	void property(){
		System.out.println("Money+Land+Gold");
	}
}

abstract class Child extends Parent{
	abstract void higherEducation();
	public static void main(String[] args){
	}
}

-------------------------------------------------------------------------------------------------------------------
Example 11:- Related to Modifier

class Parent {
	public void m1(){System.out.println("Parent-m1");}
	protected void m2(){System.out.println("Parent-m2");}
	void m3(){System.out.println("Parent-m3");} // If we are not applying any modifier,then default modifier is applicable	
}

class Child extends Parent{
	public void m1(){System.out.println("Child-m1");}
	public void m2(){System.out.println("Child-m2");}
	protected void m3(){System.out.println("Child-m3");}
	public static void main(String[] args){
		Parent p=new Child();
		p.m1();p.m2();p.m3();
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Child
Child-m1
Child-m2
Child-m3
-------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------