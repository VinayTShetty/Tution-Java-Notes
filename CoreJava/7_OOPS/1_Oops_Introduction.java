Java OOPS Concept.
*****************
In object oriented programming languages everything represented in the form of object.

Object is real world entity that has state & behavior.
Examples:- such as pen,chair,table,house….etc.

Every object contains three characteristics,
-----------------------------------------------
1) State : well defined condition of an item (instance variable/fields/properties)
2) Behavior : effects on an item (methods/behavior)
3) identity : identification number of an item(hash code)

The main building blocks of oops are
--------------------------------------
1. Inheritance
2. Polymorphism
3. Abstraction
4. Encapsulation….etc



1. Inheritance:-
----------------
1. The process of acquiring properties (variables) & methods (behaviors) from one class to another class is called inheritance.

2. We are achieving inheritance concept by using extends keyword. 
	Inheritance is also known as 'is-a' relationship.
	
3. extends keyword is providing relationship between two classes..

4. The main objective of inheritance is code extensibility whenever we are extending the class automatically
code is reused.

5. In inheritance one class providing properties & another class is acquiring the properties.

6. In inheritance parent class is giving properties & Child is acquiring properties from Parent.

7 .In inheritance we can extend only one class at a time.

Application code before inheritance
***********************************
DisAdvantages:-
***************
Duplication of the Code.
Code length is increased.

class A {
void m1() {}
void m2() {}
}

class B {
void m1() {}
void m2() {}
void m3() {}
void m4() {}	
}

class C {
void m1() {}
void m2() {}
void m3() {}
void m4() {}	
void m5() {}	
void m6() {}	
}

Application code after inheritance

Advantages
**********
a. Eliminated duplication.
b. Length of the code is decreased.
c. Reusing properties in child classes.

class A {
void m1() {}
void m2() {}
}

class B extends A {
void m3() {}
void m4() {}	
}

class C extends B {	
void m5() {}	
void m6() {}	
}

Main Reason for Inheritance:-
Note: - To reduce length of the code and redundancy of the code & to improve re-usability of code java 
introduced inheritance concept.


Object Creation in inhertaince(Is-RelationShip(keyword))
********************************************************

Object creation of parent & child classes:-

1)In java it is possible to create objects for both parent and child classes,
	If we are creating object for parent class it is possible to access only parent specific methods.
	A a=new A();

2)if we are creating object for child class it is possible to access both parent & child specific methods.
	B b=new B(); 
	b.m1();
	b.m2();
	b.m3(); 
	b.m4();
	C c=new C(); 
	c.m1();
	c.m2();
	c.m3(); 
	c.m4(); 
	c.m5(); 
	c.m6();


Object class
************
class A   // Directly
{ }
class B extends A  // Indirectly 
{ }
class C extends B // Indirectly
{ }

In above example A class is direct child class of object
	B,C classes are indirect child classes of object.
	In java every class is child of object either directly(A) or indirectly(B,C).

The root class of all java classes is Object class.

Types of inheritance :-
***********************
There are five types of inheritance in java,
1. Single inheritance
2. Multilevel inheritance
3. Hierarchical inheritance
4. Multiple inheritance
5. Hybrid Inheritance


1. Single inheritance

One class has only one direct super class is called single inheritance.
In the absence of any other explicit super class, every class is implicitly a subclass of Object class.

Class B extends A ===>class B acquiring properties of A class.

Example:-

class Parent
{ }
class Child extends Parent
{ }

2. Multilevel inheritance

One Sub class is extending Parent class then that sub class will become Parent class of next extended 
class this flow is called multilevel inheritance.

class A{}
Class B extends A{} ===> class B acquiring properties of A class
Class C extends B{} ===> class C acquiring properties of B class
[indirectly class C using properties of A & B classes]

Example:-

class A {
	void m1() {
		System.out.println("m1 method");
	}
}

class B extends A {
	void m2() {
		System.out.println("m2 method");
	}
}

class C extends B {
	void m3() {
		System.out.println("m3 method");
	}

	public static void main(String[] args) {
		A a = new A();
		a.m1();

		B b = new B();
		b.m1();
		b.m2();
		
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
	}
}


3. Hierarchical inheritance
 
 More than one sub class is extending single Parent is called hierarchical inheritance.
class A{}
Class B extends A{} ===> class B acquiring properties of A class
Class C extends A{} ===> class C acquiring properties of A class
Class D extends A{} ===> class D acquiring properties of A class

Example:-

class A{ }
class B extends A{ }
class C extends A{ }

4. Multiple inheritance

One sub class is extending more than one super class is called Multiple inheritance 
	java not supporting multiple inheritance because it is creating ambiguity problems (confusion state) .

Java not supporting multiple inheritances hence in java one class able to extends only one class at a time but it is not possible to extends more than one class.

Class A extends B ===>valid
Class A extends B ,C


Example:- 

class Parent1 {
	void money() {
		System.out.println("parent1 money");
	}
}
class Parent2 {
	void money() {
		System.out.println("parent2 money");
	}
}
class Child extends Parent1,Parent2 {
	public static void main(String[] args){
		Child c = new Child();
        c.money(); //ambiguity problems
    }
}

5. Hybrid Inheritance


Hybrid is combination of hierarchical & multiple inheritance .
Java is not supporting hybrid inheritance because multiple inheritance(not supported by java) 

is included in hybrid inheritance.


How to Prevent Inheritance
**************************
We can prevent inheritance by using the keyword final.
If we declare a class with final key word we cannot extend that class.