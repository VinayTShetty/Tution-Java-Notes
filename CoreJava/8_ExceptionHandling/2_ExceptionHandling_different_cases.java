Example 1:-
***********
Whenever the exception is raised in the try block JVM won’t terminate the program immediately it will search corresponding catch block.
a. If the catch block is matched then that block will be executed & rest of the application executed & program is terminated normally.
b. If the catch block is not matched program is terminated abnormally.

class Test {
	public static void main(String[] args) {
		System.out.println("Main Method Start");
		try {
			System.out.println(10 / 0);
			System.out.println("Bye"); //Not Executed
		} catch (ArithmeticException ae) {
			System.out.println("Exception Occured");
		}
		System.out.println("End of the application");
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Main Method Start
Exception Occured
End of the application
*********************************************************************************************************************
Example 2:- In this example catch block is not matched.

Whenever the exception is raised in the try block JVM won’t terminate the program immediately it will search corresponding catch block.
	a. If the catch block is matched then that block will be executed & rest of the application executed & program is terminated normally.
	b. If the catch block is not matched program is terminated abnormally.
In below example catch block is not matched hence program is terminated abnormally.

class Test {
	public static void main(String[] args) {
		System.out.println("Main Method Start");
		try {
			System.out.println(10 / 0);
			System.out.println("Bye"); // This line is Not Executed
		} catch (NullPointerException ne) {
			System.out.println("Exception Occured");
		}
		System.out.println("End of the application");
	}
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Main Method Start
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:5)

*********************************************************************************************************************
Example 3:- If there is no exception in try block the corresponding catch blocks are not checked/not executed.

class Test {
	public static void main(String[] args) {
		System.out.println("Main Method Start");
		try {
			System.out.println("Hi");
			System.out.println("Bye"); 
		} catch (NullPointerException ne) {
			System.out.println("Exception Occured");
		}
		System.out.println("End of the application");
	}
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Main Method Start
Hi
Bye
End of the application

*********************************************************************************************************************
Example 4:-In Exception handling independent try blocks declaration are not allowed,
			Must declare try-catch or try- finally or try-catch-finally.

class Test {
	public static void main(String[] args) {
		System.out.println("Main Method Start");
		try {
			System.out.println("Hi");
			System.out.println("Bye"); 
		} 
		System.out.println("End of the application");
	}
}

D:\JavaCode>javac Test.java
Test.java:4: error: 'try' without 'catch', 'finally' or resource declarations
                try {
                ^
1 error

*********************************************************************************************************************
Example 5:-
In between try-catch blocks it is not possible to declare any statements,if we are declaring statements compiler will generate error message.
In exception handling must declare try with immediate catch block.


class Test {
	public static void main(String[] args) {
		System.out.println("Main Method Start");
		try {
			System.out.println("Hi");
			System.out.println("Bye"); 
		} 
		System.out.println("Try-catch Middle");
		catch (NullPointerException ne) {
			System.out.println("Exception Occured");
		}
		System.out.println("End of the application");
	}
}


D:\JavaCode>javac Test.java
Test.java:4: error: 'try' without 'catch', 'finally' or resource declarations
                try {
                ^
Test.java:9: error: 'catch' without 'try'
                catch (NullPointerException ne) {
                ^
2 errors
*********************************************************************************************************************
Example 6:-
If the exception raised in try block jvm will search corresponding catch block but if the exception raised other than try-catch blocks it is always abnormal termination.
In below example exception raised in catch block hence program is terminated abnormally.


class Test {
	public static void main(String[] args) {
		System.out.println("Main Method Start");
		try {
			System.out.println(10/0);// Exception Occuring Code
		} 
		catch (ArithmeticException  ae) {
			System.out.println("Exception Occured");
			System.out.println(10/0); // Exception Occuring Code
		}
		System.out.println("End of the application");
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Main Method Start
Exception Occured
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:9)

*********************************************************************************************************************
Example 7

If the exception raised in try block the remaining code of try block is not executed.
Once the control is out of the try block the control never entered into try block once again.
Don’t take normal code inside try block because no guarantee all statements in try-block executed or not.

class Test {
	public static void main(String[] args) {
		System.out.println("Main Method Start");
		try {
			System.out.println("TRY-BLOCK-1");
			System.out.println("TRY-BLOCK-2");
			System.out.println(10/0);// Exception Occuring Code
			System.out.println("TRY-BLOCK-3");
			System.out.println("TRY-BLOCK-4");
		} 
		catch (ArithmeticException  ae) {
			System.out.println("Exception Occured");
		}
		System.out.println("End of the application");
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Main Method Start
TRY-BLOCK-1
TRY-BLOCK-2
Exception Occured
End of the application

*********************************************************************************************************************
Example 8:-

The way of handling the exception is varied from exception to the exception hence it is
recommended to provide try with multiple number of catch blocks.


import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // Scanner object used to take dynamic input
		System.out.println("provide the division value");
		int n = s.nextInt();
		try {
			System.out.println(10 / n);
			System.out.println("ratan".charAt(10));
		} catch (ArithmeticException ae) {
			System.out.println("ArithMetic Exception catch block");
		} catch (StringIndexOutOfBoundsException se) {
			System.out.println("String Index Bound Exception");
		}
		System.out.println("rest of the code");
	}
}
*********************************************************************************************************************
Example 9:-By using Exception class catch block it is possible to hold any type of exceptions.


import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // Scanner object used to take dynamic input
		System.out.println("provide the division value");
		int n = s.nextInt();
		try {
			System.out.println(10 / n);
			System.out.println("ratan".charAt(10));
		} catch (Exception ae) {
			System.out.println("Exception class will hold all Exception");
		}
		System.out.println("rest of the code");
	}
}

*********************************************************************************************************************
Example 10

When we declare multiple catch blocks then the catch block order must be child-parent.
But if we are declaring parent to child compiler will generate error message.

In this Example ArithmeticException is Child and Exception is Parent.
The flow is correct i.e Child-Parent.

	import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		System.out.println("Enter input");
		Scanner inputValue = new Scanner(System.in);
		int n = inputValue.nextInt();
		try {
			System.out.println(10 /n);
			System.out.println("ABCDEF".charAt(10));
		} catch (ArithmeticException ae) {
			System.out.println("ArithMetic Exception catch block");
		} catch (Exception e) {
			System.out.println("Exception code");
		}
		System.out.println("rest of the code");
	}
}


*********************************************************************************************************************
Example 11

When we declare multiple catch blocks then the catch block order must be child-parent.
But if we are declaring parent to child compiler will generate error message.

In this Example ArithmeticException is Child and Exception is Parent.
The flow is Not-correct i.e Parent-Child.

import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		System.out.println("Enter input");
		Scanner inputValue = new Scanner(System.in);
		int n = inputValue.nextInt();
		try {
			System.out.println(10 /n);
			System.out.println("ABCDEF".charAt(10));
		} catch (Exception ae) {
			System.out.println("Exception code");
		} catch (ArithmeticException e) {
			System.out.println("ArithMetic Exception catch block");
		}
		System.out.println("rest of the code");
	}
}

D:\JavaCode>javac Test.java
Test.java:12: error: exception ArithmeticException has already been caught
                } catch (ArithmeticException e) {
                  ^
1 error
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************
*********************************************************************************************************************