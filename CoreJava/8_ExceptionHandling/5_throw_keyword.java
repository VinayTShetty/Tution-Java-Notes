throw keyword
*************
throw keyword is used to create custom Exception Object and Handover to JVM.
Its maily used to create userdefined custom Exception Object.

usage
*****
Its mainly used inside the method,block,constructor,loop.

Syntax
******
throw new <userDefined class name>()

Example
*******

class Test
{
	void m1(){
		int product_price=100;
		if(product_price>100){
			throw new HighPriceException();
		}
	}
}


Important Points:-
*****************
Exception are 2 types.
	checked Exception
	unChecked Exception

Upto now we have discussed only Predefined Exception it might be Checked/UnChecked Exception
i.e ArithmeticException,FileNotFoundException, ... etc.

Suppose if the devloper want to create Custom Exception , then devloper can create custom Exception.


Developer can create user defined Exception for Both Checked/UnChecked Exception in 2 ways.
		a. Default constructor approach.
		b. Parameterized constructor approach.


UserDefined Checked Exception
******************************

1)Default constructor Approach.

	a)create a class that extends Exception.
	b)use the created class for throw ing the Exception.

2)Parameterized constructor approach.
	a)create a class that extends Exception.
	b)create a constructor for the class and use the super() keyword to pass the message to super class constructor.
	b)use the created class for throw ing the Exception.


UserDefined Un-Checked Exception
******************************
Same steps as before,
But in the place of extends Exception, use RuntimeException.

********************************************************************************************************
Example 1 :- Predefined Exception.

class Test  {
	public static void main(String[] args) {
			new Test().m1(0);
	}	
	void m1(int x) {
		int result=10/x;
		System.out.println(result);
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.m1(Test.java:6)
        at Test.main(Test.java:3)
*********************************************************************************************************
Example 2 :-Create a UserDefined Checked Exception.
			Default Constructor Approach.

steps:-
1)Create a class i.e MyHighPrice that extends Exception class.
2)Use the created class i.e MyHighPrice where ever you want to create a Custom Exception.


class Test  {
	public static void main(String[] args) {
		new Test().m1(350);
	}
	
	void m1(int price) {
		
		if(price<499) {
				System.out.println("Buy the Product");
		}else {
			throw new MyHighPrice();
		}
	}
}

class MyHighPrice extends Exception
{}

D:\JavaCode>javac Test.java
Test.java:10: error: unreported exception MyHighPrice; must be caught or declared to be thrown
                        throw new MyHighPrice();
                        ^
1 error

Assignement:- Write Code to Handle the Exception.
*********************************************************************************************************
Example 3 :-Create a UserDefined Checked Exception.
			Parameterized Constructor Approach.

steps:-
1)Create a class i.e MyHighPrice that extends Exception class.
2)Create a constructor with String as parameter for MyHighPrice class.
3)use the super keyword to pass the argument to parent class.


class Test  {
	public static void main(String[] args) throws MyHighPrice {
		new Test().m1(500);
	}
	
	void m1(int price) throws MyHighPrice {
		
		if(price<499) {
				System.out.println("Buy the Product");
		}else {
			throw new MyHighPrice("Very High Price Exception");
		}
	}
}

class MyHighPrice extends Exception{
	MyHighPrice(String message){
		super(message);
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Exception in thread "main" MyHighPrice: Very High Price Exception
        at Test.m1(Test.java:11)
        at Test.main(Test.java:3)

Assignment:- use try catch block to handle this exception and Observe the output and provide necessary reason based on the output.
why there is Normal Termination of the programe.
*********************************************************************************************************
Example 4 :-
after the throw usage below we cannot use any code.
Reason:- It will be unreachable statement,if the exception is raised.

class Test  {
	public static void main(String[] args) throws MyHighPrice {
		new Test().m1(500);
	}
	
	void m1(int price) throws MyHighPrice {
		
		if(price<499) {
				System.out.println("Buy the Product");
		}else {
			throw new MyHighPrice("Very High Price Exception");
			System.out.println("hello");
		}
	}
}

class MyHighPrice extends Exception{
	MyHighPrice(String message){
		super(message);
	}
}


D:\JavaCode>javac Test.java
Test.java:12: error: unreachable statement
                        System.out.println("hello");
                        ^
1 error

D:\JavaCode>

*********************************************************************************************************
Example 5 :-
We can use throw keyword only for Throwable types.
i.e class that extends Exception / RuntimeException .

If we are using without extending  Exception / RuntimeException that we will get CE error

class Test  {
	public static void main(String[] args) throws MyHighPrice {
		new Test().m1(500);
	}
	
	void m1(int price) throws MyHighPrice {
		
		if(price<499) {
				System.out.println("Buy the Product");
		}else {
			throw new MyHighPrice("Very High Price Exception");
			System.out.println("hello");
		}
	}
}

class MyHighPrice {
	MyHighPrice(String message){
		super(message);
	}
}



D:\JavaCode>javac Test.java
Test.java:2: error: incompatible types: MyHighPrice cannot be converted to Throwable
        public static void main(String[] args) throws MyHighPrice {
                                                      ^
Test.java:6: error: incompatible types: MyHighPrice cannot be converted to Throwable
        void m1(int price) throws MyHighPrice {
                                  ^
Test.java:11: error: incompatible types: MyHighPrice cannot be converted to Throwable
                        throw new MyHighPrice("Very High Price Exception");
                        ^
Test.java:19: error: constructor Object in class Object cannot be applied to given types;
                super(message);
                ^
  required: no arguments
  found:    String
  reason: actual and formal argument lists differ in length
4 errors
*********************************************************************************************************
Example 6 :-
Passing custome message to Pre-Defined Exception.
Note:- Although its not recomended to pass custom messsage to PreDefined Exception.

use javap.java.lang.Exception in cmd to see the correponding method.

Actual source code folder
C:\Users\vinayts\OneDrive\Desktop\delete\java.base\java\lang

class Test{
	
	public static void main(String[] args) {
	new Test().m1(0);	
	}
	
	public void m1(int number) {
		if(number>0) {
			int result=10/number;
			System.out.println("Result= "+number);
		}else {
			throw new ArithmeticException("Hello Certisured");
		}
	}
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Exception in thread "main" java.lang.ArithmeticException: Hello Certisured
        at Test.m1(Test.java:12)
        at Test.main(Test.java:4

*********************************************************************************************************
Example 7 :-

	For same Example Create UnChecked Exception.
	Hint :- For unchecked Exception 
		    a)create a class that extends RuntimeException
		    b)use the class for throw ing the Exception.

		

*********************************************************************************************************
Example 8 :-
*********************************************************************************************************
Example 1 :-
*********************************************************************************************************
Example 1 :-
*********************************************************************************************************
Example 1 :-
*********************************************************************************************************
Example 1 :-
*********************************************************************************************************
Example 1 :-
*********************************************************************************************************
Example 1 :-
*********************************************************************************************************
Example 1 :-
*********************************************************************************************************
Assignment 1:-Solution 

class Test  {
	public static void main(String[] args) {
		new Test().m1(350);
	}
	
	void m1(int price) {
		
		if(price<499) {
			System.out.println("Buy the Product");
		}else {
			try {
				throw new MyHighPrice();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
}

class MyHighPrice extends Exception
{}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Buy the Product

D:\JavaCode>
*********************************************************************************************************
Assignment 2:-

class Test  {
	public static void main(String[] args) throws MyHighPrice {
		new Test().m1(500);
	}
	
	void m1(int price)  {
		
		if(price<499) {
				System.out.println("Buy the Product");
		}else {
			try {
				throw new MyHighPrice("Very High Price Exception");	
			} catch (Exception e) {
				System.out.println("Price Exception");
			}
			
		}
	}
}

class MyHighPrice extends Exception{
	MyHighPrice(String message){
		super(message);
	}
}

*********************************************************************************************************