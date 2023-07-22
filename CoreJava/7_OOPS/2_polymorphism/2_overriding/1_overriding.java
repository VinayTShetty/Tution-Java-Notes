Runtime polymorphism /dynamic binding /late binding.
****************************************************
Example :- method overriding.



Important Points
***************
To achieve method overriding we required two java classes with parent and child relationship.

The method implementations already present in parent class,
	a. If the child class required that implementation then access those implementations.
	b. If the child class not required, parent class method implementations then override parent class method in child class to provide child specific implementations.

In overriding parent class method is called ===> overridden method
Child class method is called ===> overriding method

Example:- 
*********
class Parent
{
	void property(){
		System.out.println("Land+Money+Gold");
	}

	void marry(){  //OverRidden Method
		System.out.println("Arrange Marriage");
	}
}


class Child extends Parent
{
	void marry(){  //Over Riding Method
		System.out.println("Love Marrriage");
	}

	public static void main(String[] args){
		Parent p =new Child();
		p.marry();
		p.property();
	}
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Child
Love Marrriage
Land+Money+Gold

overriding methods must fallow these rules:-
********************************************
1)Overridden method signature & overriding method signatures must be same

2)The return types of overridden method & overriding method must be same (at primitive level).

3)While overriding it is possible to change return type by using co-variant return types concept.
	Before java 1.5 version it is not possible to override the method by changing return type, 
	
	But form java 5 versions it is possible to override the method by changing return type by using 
	co-variant return type’s concept.

	But this is applicable only for class-level return types.

4)If an overridden method is final it is not possible to override that method in child class.

5)Static method we can’t override.
  But if we override static method we won t get any compile Time Error.Because it will act as method Hiding.

6)private methods we can t override.

7) In both the cases Overriding is possible

  Abstract to Non-Abstract
			&
  Non-Abstract to Abstract 
  Reason for it:- This approach is helpful to stop availability of Parent method implementation to
				  the next level child classes

8)While overriding we can't reduce the scope of access modifier.
  Related to Modifier rules for overriding refer overidinng_rules_modifiers(Image).

// Keep it Pending will discuss after exception topic is completed.
9) Exception rules during overriding
While overriding if the child class method throws any checked exception
compulsory the parent class method should throw the same checked exception or its
parent otherwise we will get compile time error.