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

How to save the Java file-->We can save it with any name-->BankApplication.java

How to Compile Java File --> javac BankApplication.java

*************************************************************************************************

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


How to save the Java file-->We can save it with specific name as its contains public class--> Bank.java

How to Compile Java File-->javac Bank.java
*************************************************************************************************

Java File can have mulitple class es ,But Only one main method we can write  for a class.

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
*******************************************************************************************
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
**********************************************************************************************
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
**********************************************************************************************
java file with same class name is not allowed.
	ex:- Same district name in karnataka is not allowed.

class Test 
{
}
class Exam
{
}
class Test
{
}

D:\JavaCode>javac Test.java
Test.java:7: error: duplicate class: Test
class Test
^
1 error
**********************************************************************************************
**********************************************************************************************