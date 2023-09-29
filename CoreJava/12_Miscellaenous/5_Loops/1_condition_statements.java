java flow control Statements:-

There are three types of flow control statements in java
a. Selection Statements
b. Iteration statements
c. Transfer statements


1. Selection Statements
  a. If b. If-else c. switch

If syntax:-
**********
if (condition)
{ 
	 true body;
}
else
{
	false body;
}

If is taking condition that condition must be Boolean condition. Otherwise compiler will generate error message.
The curly brasses are optional but without it are possible to take only one statement except initialization.


********************************************************************************************************************************************
Example 1 :-

public class Test {
	public static void main(String[] args) {
		int a = 10, b = 20;
		if (a < b) {
			System.out.println("if body / true body");
		} else {
			System.out.println("else body/false body ");
		}
	}
}

if body / true body

********************************************************************************************************************************************
Example 2:- For the if the condition it is possible to provide Boolean values

class Test {
	public static void main(String[] args) {
		if (true) {
			System.out.println("true body");
		} else {
			System.out.println("false body");
		}
	}
}

true body
********************************************************************************************************************************************
Example 3 :- Only boolean type is expected.

public class Test {
	public static void main(String args[]) {
		int x = 0;
		if (x) {
			System.out.println("hello");
		} else {
			System.out.println("hi");
		}
	}
}

D:\JavaCode>javac Test.java
Test.java:4: error: incompatible types: int cannot be converted to boolean
                if (x) {
                    ^
1 error
********************************************************************************************************************************************
Example 4 :- its taking boolean type.

public class Test {
	public static void main(String args[]) {
		int x = 10;
		if (x == 20) {
			System.out.println("hello");
		} else {
			System.out.println("hi");
		}
	}
}
********************************************************************************************************************************************
Example 5 :- Without curly braces we can take only one statement that statement should not be declarative statement.

public class Test {
	public static void main(String args[]) {
		if (true)
		System.out.println("1");		
	}
}

// 1


Example 5.1

public class Test {
	public static void main(String args[]) {
		if (false)
		System.out.println("1");		
	}
}
// no output as its false, and "1" won t be printed.


Example 5.3

public class Test {
	public static void main(String args[]) {
		if (true)
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
	}
}

1
2
3
4
5

 Example 5.4

public class Test {
	public static void main(String args[]) {
		if (false)
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
	}
}

2
3
4
5

Example 5.5 :- The boolean condition inside the if statement might be true or false.
	if its false next statement might not be executed,so without curly braces only one statement can be executed that statement should not
	be declarative statement.

public class Test {
	public static void main(String args[]) {
		if (true)
		int x=10;
	}
}
	
D:\JavaCode>javac Test.java
Test.java:4: error: variable declaration not allowed here
                int x=10;
                    ^
1 error
**************************************************************************************************************
Example :- 6  we cannot write else without it.

public class Test {
	public static void main(String args[]) {
		else {
			System.out.println("bye");
		}
	}
}


D:\JavaCode>javac Test.java
Test.java:3: error: 'else' without 'if'
                else {
                ^
1 error

**************************************************************************************************************
Example 7 :- if 
	      else if 
	      else example.

	public class Test {
	public static void main(String args[]) {
		int age = 100;

		if (age < 18) {
			System.out.println("You are a minor.");
		} else if (age < 65) {
			System.out.println("You are an adult.");
		} else if (age >65) {
			System.out.println("You are an Oldage.");
		} else {
			System.out.println("You are a senior.");
		}
	}
}

**************************************************************************************************************
Example :-
**************************************************************************************************************
Example :-
**************************************************************************************************************
Example :-
**************************************************************************************************************
Example :-
**************************************************************************************************************
Example :-
**************************************************************************************************************
