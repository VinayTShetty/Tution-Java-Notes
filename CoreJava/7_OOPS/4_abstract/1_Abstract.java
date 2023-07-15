Abstraction 

Abstraction is a process of hiding the implementation details and showing only functionality to the user.
	Hide internal implementation and just highlight the set of services, is called abstraction.

Example :
By using ATM GUI screen bank people are highlighting the set of services what they are offering without highlighting internal implementation.

abstract:-

A class which is declared with the abstract keyword is known as an abstract class in Java

How to differentiate between abstract and Concerete methods
***********************************************************
a. Normal methods/Concerete Methods(
b. Abstract methods


Normal methods:- (component method/concrete method)
***************************************************
Normal method is a method wahich contains method declaration as well as method implementation.
   
   Example:- class Test
   {
	   public static void m1(){}
	   public  void m2(){}
   }

Abstract methods:-
******************
The method which is having only method declaration but not method implementations such type of methods are called abstract Methods

Example :- 
			class Exam
			{
				abstract void m1();
			}

If a class Contanins atleast one abstract method that class should be declared as abstract class.

class Exam contains one abstract method,so the class is declared as abstract class.

		abstract class Exam
		{
			abstract void m1();
		}


abstract modifer:-
*****************

Object creation is not valid for abstract class.

If a class contains atleas one abstract methods then the class is declared as abstract.

abstract class can have main method also.

An abstract class can have all the method s as concrete methods and still can be declared as abstract. 
		Just to avoid Object Creation.

abstract modifier is applicable for methods and classes but not for variables.

abstract method implementation should be provided in child class es.

abstract class can have non-abstract method(Normal/Concerete Method s) and abstract methods both.

abstract class can have constrctor also.
 Note:- 
 Interview Question:- If the class is abstract we cannot create a Object for that class.
                      If we cannot create Object for the abstract class , How can we execute the constructor of the abstract class.
						 Solution:- We can execute abstract class constructor by the following steps
						            1)Implement the abstract methods in the child class.(i.e extends keyword )
									2)Create the Object for implemented child class,
									In this manner we can execute abstract class constructor.


abstract and static key word are invalid(illegal combination of modifiers).
   Reason :- We provide abstract keyword to the method to provide implementation/Override the parent class method in child class.
             But static methods we cannot override.(It will come under Method Hiding).
			 Therefore we cannot use both static and abstract together.





