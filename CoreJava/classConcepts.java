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

Syntax for Compiling java file.

  javac <FileName>.java

---------------------------------------------------------------------------------------------------

How to Run a java class

Syntax for Running java file.

 java <className having main Mehtod>

---------------------------------------------------------------------------------------------------

Cases

1)Java File can have mulitple class. 
  In this Screnario we can save java file with any name.

2)Java File can have mulitple class but only one class should be public.
  In this Scenario we should save the java file same as class name which is having public
 
3)Java File can have mulitple class es.
	
4)Java File can have mulitple class es 
	But Only one main method we can write  for a class.

5)Main Method is optional for a class.
  We should write the Main Method only when we want to execute that particular class.

6)Nesting of class is allowed in java.
---------------------------------------------------------------------------------------------------
Rules for Identifier/UserDefined Names

Names can contain letters, digits, underscores, and dollar signs
Names must begin with a letter
Names should start with a lowercase letter and it cannot contain whitespace
Names can also begin with $ and _ (but we will not use it in this tutorial)
Names are case sensitive ("myVar" and "myvar" are different variables)
Reserved words (like Java keywords, such as int or boolean) cannot be used as names
-----------------------------------------------------------------------------------------------------
1)Java File can have mulitple class. 
  In this Screnario we can save java file with any name.

class Bank
{

}
class HDFC_Bank
{
}
class SBI_Bank
{
}
class Canara_Bank
{
}

How to save the Java file-->We can save it with any name.
*********************************************************
BankApplication.java

How to Compile Java File
*************************
javac BankApplication.java

How to Run the Java File, We can Run the java class that has main method.
*************************************************************************
java BankApplication



2)Java File can have mulitple class but only one class should be public.
  In this Scenario we should save the java file same as class name which is having public

public class Bank
{
  public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
class HDFC_Bank
{
}
class SBI_Bank
{
}
class Canara_Bank
{
}


How to save the Java file-->We can save it with specific name as its contains public class.
*******************************************************************************************
BankApplication.java

How to Compile Java File
*************************
javac BankApplication.java

How to Run the Java File, We can Run the java class that has main method.
*************************************************************************
java BankApplication


3)Java File can have mulitple class es ,But Only one main method we can write  for a class.

public class Bank
{
	public static void main(String[] args) 
	{
		System.out.println("Bank");
	}
}
class HDFC_Bank
{
	public static void main(String[] args) 
	{
		System.out.println("HDFC Bank");
	}
}
class SBI_Bank
{
	public static void main(String[] args) 
	{
		System.out.println("SBI Bank");
	}
}
class Canara_Bank
{
	public static void main(String[] args) 
	{
		System.out.println("Canara Bank");
	}
}


4)Main Method is optional for a class.

class Bank
{
}
class HDFC_Bank
{
}
class SBI_Bank
{
}
class Canara_Bank
{
}

5)Nesting of a class is allowed in java

class Bank
{
	class BankOperation
	{

	}
}

class HDFC_Bank
{
	class HDFC_Branch
	{
	}
}
class SBI_Bank
{
	class SBI_Branch
	{
	}
}
class Canara_Bank
{
	class Canara_Branch
	{
	}
}
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
   