Example :- 1
Static Block example.

In this example we can see that static block will be executed ,
Even though there is not logic implemented in the Main Method.

class Test
{
	static
	{
		System.out.println("static Block");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
	}	
}

D:\JavaCode>java Test
static Block
Main Method
***********************************************************************************************************
Execution of the static block is from Top to Bottom.

class Test
{
	static
	{
		System.out.println("static Block-1");
	}

	static
	{
		System.out.println("static Block-2");
	}

	static
	{
		System.out.println("static Block-3");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Method");
	}	
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
static Block-1
static Block-2
static Block-3
Main Method
****************************************************************************************
static-instance block execution 

class Test
{
	{ System.out.println("instance block"); } //instance block
   
	static // static block
		{ 
		System.out.println("static block"); 
		}

		Test(){
			System.out.println("Test Constructor"); 
		}
	public static void main(String[] args){
		Test t=new Test();
		System.out.println("Main Method"); 
	}
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test
static block
instance block
Test Constructor
Main Method