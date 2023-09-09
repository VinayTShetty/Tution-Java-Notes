Assignment:-
************

Different Scenario used for try-catch is given in diagram(try-catch_different_possibilities).
Create individual examples for each.

finally
*******

1) Finally block code is always executed irrespective of try and catch.
2) It is used to provide clean-up code

	a. Database connection closing. Connection.close();
	b. streams closing. Scanner.close();
	c. Object destruction . Test t = new Test(); t=null;

3)finally block won t be executed in these 2 cases
	a)if the control is not reached inside try-catch block.
	b)if the JVM is shutdown ,then the corresponding finally block won t be executed.



Assignment:- Create individual examples for below mentioned cases.

It is not possible to write finally alone.
******************************************
a. try-catch-finally ---> valid
b. try-catch ---> valid
c. catch-finally ---> invalid
d. try-catch-catch-finally ---> valid
e. try-finally ---> valid
f. catch-catch-finally ---> invalid
g. Try ---> invalid
h. Catch ---> invalid
i. Finally ---> invalid


Assignment:- Create a example based on this syntax after the topic is covered.

Syntax:-
********
try
{
	// risky code;
}
catch (Exception obj)
{
	// code to be run if the exception raised (handling code);
}
finally
{
	// Clean-up code;(database connection closing , streams closing……etc)
}


Possibilities of finally block.
*******************************

Points to check on the below Code.
	Normal Termination.
	Abnormal Termination.
	Execution of finally block.

*********************************************************************************************************
Example 1:- finally block is executed , Even though there is no exception is raised.
Normal Termiation.

class Test {
	public static void main(String[] args) {
		try {
			System.out.println("try");
		} catch (ArithmeticException ae) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
	}
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test
try
finally
*********************************************************************************************************
Example 2:-finally block is executed , Even though there is no exception is raised.
Abnormal Termiation.
Reason:- Corresponding catch block is not matched.


class Test {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (NullPointerException ae) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
finally
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:4)

Assignment:- use the correct catch block and make the code Normal Termination.
And Observe finally block is executed or not.

*********************************************************************************************************
Example 3:-finally block is executed.
Abnormal Termination.
Reason:- catch block should have exception handling code.
But in this example we have exception raising code i.e 10/0

class Test {
	public static void main(String[] args) {
		try
		{ System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{ System.out.println(10/0);
		}
		finally
		{ System.out.println("finally");
		}
	}
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test
finally
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:7)

Assignment:- Create a similar example where the Exception is handled in catch block also.
Hint:- use try-catch block in catch block and execute.

*********************************************************************************************************
Example 4:-finally bloack is executed,
Abnormal Termination.
finally block contains exception raising code.

class Test {
	public static void main(String[] args) {
		try {
			System.out.println("try");
		} catch (ArithmeticException ae) {
			System.out.println("catch");
		} finally {
			System.out.println("finallly");
			System.out.println(10 / 0);
		}
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
try
finallly
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:9)

Assignment:- Create a similar example where the execution is normal termination.
Hint:-In finally example use corresponding try-catch block and Note the o/p.

*********************************************************************************************************
Example 5:-
finally block is not executed.
	a)Because the control is not reached try-catch block.
	b)The corresponding exception raising code i.e 10/0 is not handled properly.

class Test {
	public static void main(String[] args) {
		System.out.println(10 / 0);
		try {
			System.out.println("ratan");
		} finally {
			System.out.println("finally block");
		}
		System.out.println("rest of the code");
	}
}

D:\JavaCode>java Test
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:3)

*********************************************************************************************************
Example 6:-Shutdown of JVM using System.exit(0)
Normal Termination.
control is not reaching finally as the JVM is shutdown at try block only.

class Test {
	public static void main(String[] args) {
		try {
			System.out.println("ratan");
			System.exit(0);
		} finally {
			System.out.println("finally block");
		}
		System.out.println("rest of the code");
	}
}

D:\JavaCode>javac Test.java
D:\JavaCode>java Test
ratan
D:\JavaCode>
*********************************************************************************************************