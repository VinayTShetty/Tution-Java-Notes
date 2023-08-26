interface
*********
Interface is also one of the type of class.
Interface methods does not contain any implementation.
It contains only abstract methods.
By defualt all methods inside interface are public and abstract.
interface variables are by default public static final
interface variables value cannot be changed.

Updated Version on Java 8:-
**************************
interface can have concrete method.

1)default void(){ } method can be written in interface.
2)Static method can be written in interface.

Syntax
******
interface <UserDefined_Name>
{
	void m1();
	void m2();
	void m3();
}


Example:- 
*********
Example 1.1
************

interface Test                                      
{
	int x=10;
	void m1();
	void m2();
	void m3();
}

Example 1.2
************
 abstract interface Test                                      
{
	public static final int x=10;
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
}



Interface class when we should use.
***********************************
if you don’t no the anything about implementation just we have the requirement specification then declare that requirements by using interface.

abstract class when we should use.
***********************************
if u know the implementation but not completely then we should go for abstract classes.

concerete class
***********************************
if you know the implementation completely then we should go for concrete classes.

Main use of using Interface concept.
***********************************
Abstraction: Interfaces allow you to define a contract for classes, specifying what methods they should have without providing the implementation details. 
			 This promotes abstraction by separating the "what" (interface) from the "how" (implementation).

Multiple Inheritance: Java does not support multiple inheritance of classes, meaning a class cannot extend more than one class. 
			Interfaces provide a way to achieve multiple inheritance by allowing a class to implement multiple interfaces.

Polymorphism: Interfaces enable polymorphism, allowing different classes to be treated as instances of the same interface type. 
			This facilitates code flexibility and reuse.
