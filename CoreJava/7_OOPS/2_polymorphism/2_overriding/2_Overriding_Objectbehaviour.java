Based on the Definition of Polymorphism
***************************************
The ability to appear in more forms is called polymorphism.
One thing can exhibits more than one form is called polymorphism.
One functionality with different actions is called polymorphisum.
One person with different debaviours is called polymorphisumk.
Polymorphism is a Greek word poly means many and morphism means forms.


Normal Object Creation for the class
************************************
class Test{
	void m1(){System.out.println("m1");}
	void m2(){System.out.println("m2");}
	void m3(){System.out.println("m3");}
	public static void main(String[] args) {
		Test t=new Test();
		t.m1();t.m2();t.m3();
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
m1
m2
m3

Parent to Child RelationShip inheritance
*****************************************

Example 1:- Creating Parent Object 
			So all method belonging to Parent are avaliable to Parent Object ref.

class Parent{
	void m1(){System.out.println("m1");}
	void m2(){System.out.println("m2");}
	void m3(){System.out.println("m3");}
	
}

class Child extends Parent
{
	void m4(){System.out.println("m4");}
	void m5(){System.out.println("m5");}
	void m6(){System.out.println("m6");}
	public static void main(String[] args) {
		Parent p=new Parent();
		p.m1();p.m2();p.m3();
	}
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Child
m1
m2
m3
---------------------------------------------------------------------------------------------------
Example 2:- Creating Child Object 
			So all method belonging to Parent and Child are avaliable to Child Object ref.

class Parent{
	void m1(){System.out.println("m1");}
	void m2(){System.out.println("m2");}
	void m3(){System.out.println("m3");}
	
}

class Child extends Parent
{
	void m4(){System.out.println("m4");}
	void m5(){System.out.println("m5");}
	void m6(){System.out.println("m6");}
	public static void main(String[] args) {
		Child c=new Child();
		c.m1();c.m2();c.m3();c.m4();c.m5();c.m6();
	}
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Child
m1
m2
m3
m4
m5
m6
--------------------------------------------------------------------------------------------------
Example 3:- Creating Parent reference Child class Object.
			i.e
			Parent p=new Child();

using parent reference we can call only parent class methods.
But during run time the JVM will check is there any method OverRiding is happening in the class.
If the Overriding is happening then the corresponding OverRiding method will get the chance.

class Parent{
	void m1(){System.out.println("m1");}
	void m2(){System.out.println("m2");}
	void m3(){System.out.println("m3");}
	
}

class Child extends Parent
{
	void m1(){System.out.println("m1-Child");}
	void m2(){System.out.println("m2-Child");}
	void m3(){System.out.println("m3-Child");}

	public static void main(String[] args) {
		Parent p=new Child();
		p.m1();p.m2();p.m3();
		}
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Child
m1-Child
m2-Child
m3-Child


Example 3.1 
***********
Creating Parent reference Child class Object.
			i.e
			Parent p=new Child();

In this example ,Parent class does not contain m4() method so compiler is telling cannot find symbol.
i.e method is not avaliable in the Parent class.

class Parent{
	void m1(){System.out.println("m1");}
	void m2(){System.out.println("m2");}
	void m3(){System.out.println("m3");}
	
}

class Child extends Parent
{
	void m1(){System.out.println("m1-Child");}
	void m2(){System.out.println("m2-Child");}
	void m3(){System.out.println("m3-Child");}
	void m4(){System.out.println("m4-Child");}

	public static void main(String[] args) {
		Parent p=new Child();
		p.m1();p.m2();p.m3();p.m4();
		}
}

D:\JavaCode>javac Test.java
Test.java:17: error: cannot find symbol
                p.m1();p.m2();p.m3();p.m4();
                                      ^
  symbol:   method m4()
  location: variable p of type Parent
1 error
--------------------------------------------------------------------------------------------------
Example 4

Java does not allow to Create Object as Parent ref Child class Object. 

<Child class name> <userdefined_name>=new <Parent class name>

class Parent{
	void m1(){System.out.println("m1");}
}

class Child extends Parent{
	void m1(){System.out.println("m1-Child");}
	public static void main(String[] args) {
		Child c=new Parent();
		}
}

D:\JavaCode>javac Test.java
Test.java:8: error: incompatible types: Parent cannot be converted to Child
                Child c=new Parent();
                        ^
1 error
--------------------------------------------------------------------------------------------------