Polymorphism:-
**************
The ability to appear in more forms is called polymorphism.
One thing can exhibits more than one form is called polymorphism.
One functionality with different actions is called polymorphisum.
One person with different debaviours is called polymorphisumk.
Polymorphism is a Greek word poly means many and morphism means forms.

There are two types of polymorphism in java
*******************************************

1) Compile time polymorphism / static binding / early binding
		Example :- method overloading.

2) Runtime polymorphism /dynamic binding /late binding.
		Example :- method overriding.


what is OverLoading
*******************
Method overloading increases the readability of the program. 
This provides flexibility to programmers so that they can call the same method for different types of data.

When OverLoading should be used
*******************************
1)It is used so that the programmer does not have to remember various function names.
2)overloading concept in java reduces complexity of the programming.

Compile time polymorphism [Method Overloading] :-
************************************************
1) If java class allows more than one method with same name but different number of arguments. 
										or
	same number of arguments but different data types those methods are called overloaded methods.

a. Same method name but different number of arguments.
    void m1(int a){ }
    void m1(int a,int b){ }

b. Same method name & same number of arguments but different data types.
	void m1(int a){ }
	void m1(char ch){ }

2) To achieve overloading concept one java class sufficient.

3) It is possible to overload any number of methods in single java class.

4)Two methods are said to be overload if and only if both having the same name but different argument types.
--------------------------------------------------------------------------------------------------------------

Example without OverLoading.
***************************
Example 1

class Test
{
	public static void main(String [] args){
		Demo d=new Demo();
		d.addNumber();
	}
}

class Demo
{
	public void addNumber(){
		//HardCoding of the value.
		int x=10;
		int y=20;
		int total=x+y;
		System.out.println("Sum= "+total);
	}
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Sum= 30
-------------------------------------------------------------------------------------------------------------
Example 2:- Disadvantage without OverLoading.

class Test
{
	public static void main(String [] args){
		Demo d=new Demo();
		d.addNumber();
		d.add_two_Number(100,200);
		d.add_three_Number(50,25,15);
	}
}

class Demo
{
	public void addNumber(){
		//HardCoding of the value.
		int x=10;
		int y=20;
		int total=x+y;
		System.out.println("Sum= "+total);
	}

	public void add_two_Number(int x,int y){
		//Don t want to HardCode , I need to provide dynamically.
		int total=x+y;
		System.out.println("Sum of 2 numbers= "+total);
	}

	public void add_three_Number(int x,int y,int z){
		//Don t want to HardCode , I need to provide dynamically.
		int total=x+y+z;
		System.out.println("Sum of 3 numbers= "+total);
	}
}



D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Sum= 30
Sum of 2 numbers= 300
Sum of 3 numbers= 90


DisAdvantage:-All the method name is different.
i.e 

addNumber()
add_two_Number(int x,int y)
add_three_Number(int x,int y,int z)

Even though they are doing the same addtion operation of numbers.
-------------------------------------------------------------------------------------------------------------
Example 3 :- With Overloading
*****************************

class Test
{
	public static void main(String [] args){
		Demo d=new Demo();
		d.addNumber();
		d.addNumber(100,200);
		d.addNumber(50,25,15);
	}
}

class Demo
{
	public void addNumber(){
		//HardCoding of the value.
		int x=10;
		int y=20;
		int total=x+y;
		System.out.println("Sum= "+total);
	}

	public void addNumber(int x,int y){
		//Don t want to HardCode , I need to provide dynamically.
		int total=x+y;
		System.out.println("Sum of 2 numbers= "+total);
	}

	public void addNumber(int x,int y,int z){
		//Don t want to HardCode , I need to provide dynamically.
		int total=x+y+z;
		System.out.println("Sum of 3 numbers= "+total);
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Sum= 30
Sum of 2 numbers= 300
Sum of 3 numbers= 90

Advantage:- No Need to remember the method name individually for each operation.
As there is common name for similar operation.
-------------------------------------------------------------------------------------------------------------