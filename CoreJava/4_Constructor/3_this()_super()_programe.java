If we are not writing any Constructor then Compiler will generate 1 default 0 arg constructor with empty implementation.
Inside the compiler generated default 0 arg constructor super() will be written by default from compiler.

Programe
*******

class Exam
{
	Exam(){
		System.out.println("Exam Constructor");
	}
}

class Test extends Exam
{
	
		public static void main(String[] args) 
	{
			Test t=new Test();
		System.out.println("Main Method");
	}
}

D:\JavaCode>java Test
Exam Constructor
Main Method

***********************************************************************************************

Inside the User Defined constructor if we are not using this() or super(),
The compiler will generate super() as the Frist Statment in the constructor.

Programe
********
class Exam
{
	Exam(){
		System.out.println("Exam Constructor");
	}
}

class Test extends Exam
{
	Test(){
		System.out.println("Test 0-arg Constructor");		
	}
		public static void main(String[] args) 
	{
			Test t=new Test();
		System.out.println("Main Method");
	}
}

D:\JavaCode>java Test
Exam Constructor
Test 0-arg Constructor
Main Method
******************************************************************************************************
Inside the Constructor we can use eiether this() or super().
We cannot use both.

class Test 
{
	Test(){
		super();
		this(10);
		System.out.println("Test 0-arg Constructor");		
	}
	Test(int x){
		
	}
		public static void main(String[] args) 
	{
		System.out.println("Main Method");
	}
}

D:\JavaCode>javac Test.java
Test.java:5: error: call to this must be first statement in constructor
                this(10);
                    ^
1 error
******************************************************************************************************

this() and super() should be used inside the constructor and it should be the frist statement.

class Test 
{
	Test(){
		System.out.println("Test 0-arg Constructor");		
	}
	Test(int x){
		System.out.println("Test 1-arg Constructor");
	}
		public static void main(String[] args) 
	{
		System.out.println("Main Method");
	}

	public void m1(){
		this(10);
	}
}

D:\JavaCode>javac Test.java
Test.java:15: error: call to this must be first statement in constructor
                this(10);
                    ^
1 error

------------------

class Test 
{
	Test(){
		System.out.println("Test 0-arg Constructor");		
	}
	Test(int x){
		System.out.println("Test 1-arg Constructor");
	}
		public static void main(String[] args) 
	{
		System.out.println("Main Method");
	}
	public static void m2(){
		this(10);
	}
}

D:\JavaCode>javac Test.java
Test.java:14: error: call to this must be first statement in constructor
                this(10);
                    ^
1 error
************************************************************************************************************
this () is used to current class Constructor.

class Test 
{
	Test(){
		this(10);
		System.out.println("Test 0-arg Constructor");		
	}
	Test(int x){
		System.out.println("Test 1-arg Constructor");
	}
		public static void main(String[] args) 
	{
		Test t=new Test();
		System.out.println("Main Method");
	}
	
}

D:\JavaCode>java Test
Test 1-arg Constructor
Test 0-arg Constructor
Main Method

************************************************************************************************************

super () key word is used to call ParentClass Constructor.

class Exam
{
	Exam(){
		System.out.println("Exam 0-arg Constructor");		
	}

	Exam(int x){
		System.out.println("Exam 1-arg Constructor");		
	}
}

class Test extends Exam
{
	Test(){
		super();
		System.out.println("Test 0-arg Constructor");		
	}
	Test(int x){
		super(10);
		System.out.println("Test 1-arg Constructor");
	}
		public static void main(String[] args) 
	{
			Test t=new Test();
			Test t1=new Test(10);
		System.out.println("Main Method");
	}
	
}

D:\JavaCode>java Test
Exam 0-arg Constructor
Test 0-arg Constructor
Exam 1-arg Constructor
Test 1-arg Constructor
Main Method
****************************************************************************************