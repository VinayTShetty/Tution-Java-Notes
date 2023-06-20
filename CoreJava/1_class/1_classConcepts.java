Installation of Java(JDK)
	check you Laptop is 32 bit or 64 bit.
	Open MyComputer Disk and Right Click Properties and See Operating System.

	Download the JDK( https://download.oracle.com/java/20/latest/jdk-20_windows-x64_bin.exe)
	Install JDK
	Go to bin folder in JDK copy the path 
	Copy path for javac 
	Set path in Environment Variables
		
----------------------------------------------------------------
How to check for java installation.
Open CMD Type Javac

How to Check Java Version installed

java --version
----------------------------------------------------------------
Installation of Editor

Check 32 or 64 bit 
Install the Ediotr
----------------------------------------------------------------
main Method:- 
Explanation will do in later part.

public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
----------------------------------------------------------------

How to Create a class 

	Syntax for Creating a class 
	***************************

class <UserDefined Name>{
	
}
----------------------------------------------------------------

How to Save a Java File

We can save the Java file in 2 approaches.
	Any Name
	Specific Name


Any Name
********
If the java File don t contain any public class we can save it with any name
 
Specific Name
*************
If the java File Contain any public class then we need to save the File name same as class name which is having public modifier
---------------------------------------------------------------------------------------------------
How to compile a java File
**************************
Syntax for Compiling java file.

  javac <FileName>.java



How to Run a java class
************************
Syntax for Running java file.

 java <className having main Mehtod in the java file>

---------------------------------------------------------------------------------------------------

Cases

1)Java File can have mulitple class. 
  In this Screnario we can save java file with any name.

2)Java File can have mulitple class but only one class should be public.
  In this Scenario we should save the java file same as class name which is having public
 
4)Java File can have mulitple class es 
	But Only one main method we can write  for a class.

5)Main Method is optional for a class.
  We should write the Main Method only when we want to execute that particular class.

6)We cannot write more than 1 main method in a class.

7)Nesting of class is allowed in java.

8)java file with same class name is not allowed.
	ex:- Same district name in karnataka is not allowed.
---------------------------------------------------------------------------------------------------
Rules for Identifier/UserDefined Names

Names can contain letters, digits, underscores, and dollar signs
Names must begin with a letter
Names should start with a lowercase letter and it cannot contain whitespace
Names can also begin with $ and _ (but we will not use it in this tutorial)
Names are case sensitive ("myVar" and "myvar" are different variables)
Reserved words (like Java keywords, such as int or boolean) cannot be used as names
-----------------------------------------------------------------------------------------------------
Assignment:- 
***********

1)Create 2 class 'Test','Exam' with Main Method.
	Compile and Run 'Exam' class.

2)Create 3 class 'Test','Exam','Preparatory' with Main Method 
	Compile and Run 'Exam' class.
  Note:- In this 'Exam' class should be public.

3)Create 3 class 'Test','Exam','Preparatory' without Main Method.
	Just Compile the java file.

4)Create 4 class 'Add','Sub','Mul','Div' without Main Method
    Compile Java File and Run any class and Observe Output.
   