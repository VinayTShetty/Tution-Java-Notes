Exception Handling
******************
Introduction:-

Dictionary meaning of the exception is abnormal termination.

An exception is an event that occurs during execution of the program,
that disturb normal flow of the program instructions.

If the application contains exception then the program terminated abnormally then the rest of the application 
is not executed.


To overcome above limitation in order to execute the rest of the application & to get normal termination of the application must handle the exception.
In java we are having two approaches to handle the exceptions.

1) By using try-catch block.
2) By using throws keyword.




Exception Handling:-
*********************
The main objective of exception handling is to get normal termination of the application in
order to execute rest of the application code.

Exception handling means just we are providing alternate code to continue the execution of remaining 
code & to get normal termination of the application.


Syntax for Exception
********************
Exception handling by using Try –catch blocks:-
Syntax:-

	try
	{
		exceptional code;
	}
	catch (ExceptionName reference_variable){
		Code to run if an exception is raised (alternate code);
}


Every Exception is a predefined class present in different packages.
*******************************************************************
java.lang.ArithmeticException
java.io.IOException
java.sql.SQLException
javax.servlet.ServletException
..etc

The exception are occurred due to several reasons
**************************************************
a. Developer mistakes
b. End-user mistakes.
	i. While providing inputs to the application.
	ii. Whenever user is entered invalid data then Exception is occur.
	iii. A file that needs to be opened can’t found then Exception is occurred.
	iv. Exception is occurred when the network has disconnected at the middle of the communication……..etc

Types of Exceptions:-
*********************
In above tree Structure(Exception_hierachy) RuntimeException its child classes & Error its child classes are Unchecked remaining all exceptions are checked Exceptions.
The root class of exception handling is Throwable class.

The Exceptions are divided into 2 types
1) Checked Exception
2) Unchecked Exception

Note-1:-
Whether it is a checked Exception or unchecked exception exceptions are raised at runtime but not compile time.

Checked Exception:-
*****************
The Exceptions which are checked by the compiler at the time of compilation is called Checked Exceptions.
	Examples:- 
	IOException,SQLException,InterruptedException,ClassNotFoundException

If the application contains checked Exception the compiler is able to check it and it will give intimation
to developer regarding Exception in the form of compilation error.

Handle the checked Exception in two ways
By using try-catch block.
By using throws keyword.


Example 1:- 
***********
Exception showing at CompileTime 

import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        readFile("example.txt");
    }

    public static void readFile(String fileName) {
        // This method attempts to read a file and throws an IOException if there's an issue.
        FileReader fileReader = new FileReader(fileName);
        // Code to read the file would go here...
        fileReader.close();
    }
}

D:\JavaCode>javac Test.java
Test.java:11: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
        FileReader fileReader = new FileReader(fileName);
                                ^
Test.java:13: error: unreported exception IOException; must be caught or declared to be thrown
        fileReader.close();
                        ^
2 errors

Example 2 
**********
Handling the exception using try catch block.


import java.io.FileReader;
import java.io.IOException;

public class Child {
    public static void main(String[] args) {
		readFile("example.txt");	
    }

    public static void readFile(String fileName) {
    	try {
            FileReader fileReader = new FileReader(fileName);
            // Code to read the file would go here...
            fileReader.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception has Occured");
		}
        // This method attempts to read a file and throws an IOException if there's an issue.

    }
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Exception has Occured


UnChecked Exception:-
********************
The exceptions which are not checked by the compiler at the time of compilation are called unchecked Exception.
	ArithmeticException,ArrayIndexOutOfBoundsException,NumberFormatException….etc

If the application contains un-checked Exception code is compiled but at runtime JVM (Default Exception handler) display exception message then program terminated abnormally.

To overcome runtime problem must handle the exception in two ways.
	By using try-catch blocks.
	By using throws keyword.


Example 3
*********
Exception showing at RunTime.

public class Test {
    public static void main(String[] args) {
		calculator();
    }

    public static void calculator() {
		int x=10/0;
    }
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.calculator(Test.java:7)
        at Test.main(Test.java:3)

Example 4:-
**********
Handling Exception using try-catch block

public class Test {
    public static void main(String[] args) {
		calculator();
    }

    public static void calculator() {
		try {
			int x=10/0;			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception has Occured Please enter valid Number");
		}
		
    }
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Exception has Occured Please enter valid Number
