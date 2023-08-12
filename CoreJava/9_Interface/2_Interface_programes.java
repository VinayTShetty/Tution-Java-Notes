How to Write an interface.

Example 1:-
*********

interface Test
{
	int x=10;
	void m1();
	void m2();
	void m3();
}
------------------------------------------------------------------------------------------------------------
Write an interface with default modifier applicable.

Example 2:-
*********

 abstract interface Test                                      
{
	public static final int x=10;
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
}
------------------------------------------------------------------------------------------------------------
The Relation ship between class and interface.

Example 3:- Using class for Is-a relation-ship/inheritance.
*********
class Parent{void m1(){}}
class Child extends Parent{}

Example 4:- Using class and abstract class for Is-a relation-ship/inheritance.
*********
abstract class Parent{
	abstract void m1();
	abstract void m2(){}
}

class Child extends Parent
{
}

Example 5:- Using class and abstract class for Is-a relation-ship/inheritance.
*********
interface Parent
{
	void m1();
	void m2();
	void m3();
}

class Child implements Parent
{
	public void m1(){System.out.println("m1");}
	public void m2(){System.out.println("m2");}
	public void m3(){System.out.println("m3");}
}

Note:- while overriding we should use public modifier as we cannot reduce the visibility of the modifier.

Example:-6 Using interface and interface for Is-a realtionship/inheritance.
********* 
interface Parent
{
	void m1();
	void m2();
	void m3();
}

interface Child extends Parent
{

}
------------------------------------------------------------------------------------------------------------
Write an example for interface and the java class implementing the interface.

Example:-7
*******
interface Bank{
	void accountOpen();
}

class HDFC implements Bank{
	public void accountOpen() {
		System.out.println("HDFC_PROTOCOL");
	}
}

class SBI implements Bank{
	public void accountOpen() {
		System.out.println("SBI_PROTOCOL");
	}
}

class Test{
	
	public static void main(String[] args) {
		HDFC hdfc=new HDFC();
		hdfc.accountOpen();
		
		SBI sbi=new SBI();
		sbi.accountOpen();
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
HDFC_PROTOCOL
SBI_PROTOCOL

Assignement:-
1 Create Object like Parent reference and Child Object and execute overriding methods lofic.
2 Create Parent Object and Check the Output and provide reason for Output
------------------------------------------------------------------------------------------------------------
interface class Bank when ever we are using in corresponding class/Child class(i.e HDFC class).
we should provide implementation for the interface.
Or else we will get CE.

Example 8:-
*********

interface Bank{
	void accountOpen();
}

class HDFC implements Bank{
	
}

D:\JavaCode>javac Test.java
Test.java:5: error: HDFC is not abstract and does not override abstract method accountOpen() in Bank
class HDFC implements Bank{
^
1 error
------------------------------------------------------------------------------------------------------------
We cannot create Object for abstract class.
interface is by default abstract ,so object creation is not possible.

Example 9:-
*********

interface Bank{
	void accountOpen();
}

class Test{	
	public static void main(String[] args) {
		Bank b=new Bank();
	}
}

D:\JavaCode>javac Test.java
Test.java:7: error: Bank is abstract; cannot be instantiated
                Bank b=new Bank();
                       ^
1 error
------------------------------------------------------------------------------------------------------------
 Mulitple inheritance is not supported in java.

But in interface we can use mulitple inheritance.
Because there is no implementation of the class.Only Declaration
image:- mulitple_inheritance

Example 10:- interface extending multiple/single interface 
*********
interface A {
	void m1();
}

interface B{
	void m2();
}

interface C extends A,B{
	void m1();
}

Example 12:- class implementing mulitple interface
*********
interface A{void m1();}
interface B{void m1();}

class Test implements A,B{
	public void m1() {
		System.out.println("m1-method");
	}
}

Assignemnt:-
1)write a programe where interface A extends another interface B
2)Wrtie a programe where class A extends another class B
3)Wrtie a programe where class A extends another abstract class B and provide implementation
4)Write a programe where class A extends mulitple class B,C,D es and Validate the output.
5)Wrtie a programe where class A extends abstract class and validate the output.
------------------------------------------------------------------------------------------------------------
Example 13:-default method in interface
**********
Technical Reason for implementation of Default method in interface:-
1.	Backward Compatibility: One of the primary reasons for introducing default methods 
	is to ensure backward compatibility. In earlier versions of Java, 
	if you needed to add a new method to an existing interface, 
	all classes that implemented that interface would break unless you provided implementations for the new method in each of those classes. 
	This created a significant problem when trying to evolve interfaces in existing codebases. 
	Default methods allow you to add new methods to an interface without forcing implementing classes to immediately provide implementations.
	Existing classes that implement the interface can still work without modification

interface Bank{
	void account_open();
	void check_address_proof();
	void auth_biometric();
	void physical_identity();
	default void commonLogic() {
		System.out.println("Picture of the Person");
	}
}

class SBI implements Bank{
	public void account_open() {
		System.out.println("Account Open Book/Ledger");
	}
	public void check_address_proof() {
		System.out.println("Address Proof using Ration Card");	
	}
	public void auth_biometric() {
		System.out.println("BioMetric Using physical Finger");
		
	}
	public void physical_identity() {
		System.out.println("Physical Identity going in personal to Bank");
	}
}

class HDFC implements Bank{
	public void account_open() {
		System.out.println("Account Open online");
	}
	public void check_address_proof() {
		System.out.println("Address Proof Using satellite");	
	}
	public void auth_biometric() {
		System.out.println("BioMetric using adhar");
		
	}
	public void physical_identity() {
		System.out.println("Physical Identity sending CC representative");
	}
}

class MainApplication
{
 public static void main(String[] args) {
	System.out.println("SBI");
	SBI sbi=new SBI();
	sbi.account_open();
	sbi.check_address_proof();
	sbi.auth_biometric();
	sbi.physical_identity();
	sbi.commonLogic();
 
	System.out.println("HDFC");
	HDFC hdfc=new HDFC();
	hdfc.account_open();
	hdfc.check_address_proof();
	hdfc.auth_biometric();
	hdfc.physical_identity();
	hdfc.commonLogic();
}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java MainApplication
SBI
Account Open Book/Ledger
Address Proof using Ration Card
BioMetric Using physical Finger
Physical Identity going in personal to Bank
Picture of the Person
HDFC
Account Open online
Address Proof Using satellite
BioMetric using adhar
Physical Identity sending CC representative
Picture of the Person

Assignment:-
1)Create a example where interface A with 10 methods.
	without default method implementation.
	Implement that interface A in 5 class es B,C,D,E,F
	Try to add one method in interface A, i.e 11 th method.
	See what ambiguity will be happening ?
	Resolve the ambiguity by implementing the 11 th method in 5 class es.

2)In the same example 11 try to execute the logic using Parent reference Child class Object.
	Hint:- Parent is Bank
			Child is SBI/HDFC.
	     Bank b=new SBI();
	     Bank b=new HDFC();
		 
***VVIP
3)Create a interface A with 5 methods.
	create default method void() A.
	Implement the interface A in Test and Exam class.
	Overide default void() method of interface A in Test and Exam class.
	and see the output.
------------------------------------------------------------------------------------------------------------
Example 14:-final variables value cannot be changed.
**********
interface variables are by default public static final 

interface A{
	int x=10;
}
class Test implements A{
	public static void main(String[] args) {
		x=11;
		System.out.println(x);
	}
}
D:\JavaCode>javac Test.java
Test.java:7: error: cannot assign a value to final variable x
                x=11;
                ^
1 error

Assignemnt:- 
1)Create a example where the interface A having variable x.
	implement interface A in the class Test.
	Create a instance method m1() in class Test.
	Acess the interface varaible x in instance method m1() of class Test.
	call the instance method m1() in Test main method class.
------------------------------------------------------------------------------------------------------------
Example 15:- Nested interface is valid in java.  
***********
Writing a interface inside an interface is valid.

// Outer interface
interface Vehicle {
    void start();

    // Nested interface
    interface Engine {
        void ignite();
    }
}

// Implementing class for the outer interface and nested interface
class Car implements Vehicle, Vehicle.Engine {
    public void start() {
        System.out.println("Car is starting.");
    }
    public void ignite() {
        System.out.println("Engine is ignited.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.ignite();
    }
}
------------------------------------------------------------------------------------------------------------
Example 16:- Marker/tagged interface
***********
A tagged interface, also known as a marker interface, 
is an interface in Java that doesn't' declare any methods or fields but serves as a "tag" 
	or
marker to indicate something about the classes that implement it
ex:-  Serializable, Cloneable, Remote

// A tagged interface (marker interface)
interface Printable {
    // Empty interface - serves as a marker
}

// Classes that implement the Printable interface are marked as printable
class Document implements Printable {
    public void print() {
        System.out.println("Print");
    }
}

class Image implements Printable {
    public void display() {
        System.out.println("Draw");
    }
}

class Test{
	public static void main(String[] args) {
		Document doc=new Document();
		doc.print();
		
		Image img=new Image();
		img.display();
	}
}
------------------------------------------------------------------------------------------------------------
Example 17:-We can write static method in the interface.
*******
interface Bank{
	void account_open();
	void check_address_proof();
	void auth_biometric();
	void physical_identity();

	static void commonLogic() {
		System.out.println("Picture of the Person");
	}
}

class SBI implements Bank{
	public void account_open() {
		System.out.println("Account Open Book/Ledger");
	}
	public void check_address_proof() {
		System.out.println("Address Proof using Ration Card");	
	}
	public void auth_biometric() {
		System.out.println("BioMetric Using physical Finger");
		
	}
	public void physical_identity() {
		System.out.println("Physical Identity going in personal to Bank");
	}
}

class HDFC implements Bank{
	public void account_open() {
		System.out.println("Account Open online");
	}
	public void check_address_proof() {
		System.out.println("Address Proof Using satellite");	
	}
	public void auth_biometric() {
		System.out.println("BioMetric using adhar");
		
	}
	public void physical_identity() {
		System.out.println("Physical Identity sending CC representative");
	}
}

class MainApplication
{
 public static void main(String[] args) {
	System.out.println("SBI");
	SBI sbi=new SBI();
	sbi.account_open();
	sbi.check_address_proof();
	sbi.auth_biometric();
	sbi.physical_identity();
	Bank.commonLogic();
 
	System.out.println("HDFC");
	HDFC hdfc=new HDFC();
	hdfc.account_open();
	hdfc.check_address_proof();
	hdfc.auth_biometric();
	hdfc.physical_identity();
	Bank.commonLogic();
}
}
------------------------------------------------------------------------------------------------------------
Difference between default void() and static method() in interface.

Default Methods:-
****************
Default methods provide a default implementation that can be optionally overridden by implementing classes. They allow for adding new methods to interfaces while maintaining backward compatibility.

Static Methods:-
****************
Static methods are associated with the interface itself and can be invoked using the interface name. They are typically used for utility functions or methods that don't require instance-specific data.
------------------------------------------------------------------------------------------------------------
Assignment:-
1)Create a Table with difference between interface and Abstract class.
		    	And list down all
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
Hint

Example 13:- Assignment 3 
**********
interface Bank{
	void account_open();
	void check_address_proof();
	void auth_biometric();
	void physical_identity();

	default void commonLogic() {
		System.out.println("Picture of the Person");
	}
}

class SBI implements Bank{
	public void account_open() {
		System.out.println("Account Open Book/Ledger");
	}
	public void check_address_proof() {
		System.out.println("Address Proof using Ration Card");	
	}
	public void auth_biometric() {
		System.out.println("BioMetric Using physical Finger");
		
	}
	public void physical_identity() {
		System.out.println("Physical Identity going in personal to Bank");
	}
	
	public void commonLogic () {
		System.out.println("Bribe Money can be given to account");
	}
}

class Test
{
 public static void main(String[] args) {
	System.out.println("SBI");
	Bank b=new SBI();
	b.account_open();
	b.check_address_proof();
	b.auth_biometric();
	b.physical_identity();
	b.commonLogic();
}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
SBI
Account Open Book/Ledger
Address Proof using Ration Card
BioMetric Using physical Finger
Physical Identity going in personal to Bank
Bribe Money can be given to account