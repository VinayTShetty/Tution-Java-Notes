Programe
*******

Demo Instance Block 

Example:-1

class Test
{
	{
		System.out.println("Instance Block");
	}
	Test(){
		System.out.println("Constructor");		
	}
	public static void main(String[] args) 
	{
		Test t=new Test();
		System.out.println("Main Method");
	}	
}

D:\JavaCode>java Test
Instance Block
Constructor
Main Method

Example:-2

class Test
{
	{
		System.out.println("Instance Block");
	}

	{
		System.out.println("Instance Block-1");
	}
	Test(){
		System.out.println("Constructor");		
	}
	
	public static void main(String[] args) 
	{
		Test t=new Test();
		System.out.println("Main Method");
	}	
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Instance Block
Instance Block-1
Constructor
Main Method

**********************************************************************************************
Instance Block Main usage:-
Used to write the logics that needs to executed for every Object Creation.

Example:-3

without Instance Block Topics.
-------------------------------
Here if we Observe means System.out.println("Logic-xyz"); is written in each and every constructor.

class Test
{
	Test(){
		System.out.println("Logic-xyz");		
		System.out.println("0-Constructor");		
	}
	Test(int f){
		System.out.println("Logic-xyz");
		System.out.println("1-Constructor");		
	}
	Test(int d,int e){
		System.out.println("Logic-xyz");
		System.out.println("2-Constructor");		
	}
	Test(int a,int b,int c){
		System.out.println("Logic-xyz");
		System.out.println("3-Constructor");		
	}
	public static void main(String[] args) 
	{
		Test t=new Test();
		Test t1=new Test(10);
		Test t2=new Test(20,30);
		Test t3=new Test(40,50,60);
		System.out.println("Main Method");
	}	
}

D:\JavaCode>java Test
Logic-xyz
0-Constructor
Logic-xyz
1-Constructor
Logic-xyz
2-Constructor
Logic-xyz
3-Constructor
Main Method

Example:-4

with Instnace Block Topics
--------------------------
Here if we Observe means System.out.println("Logic-xyz"); is written only once in the instance block.
Code redudancy is reduced.

class Test
{
	{
		System.out.println("Logic-xyz");		
	}
	Test(){	
		System.out.println("0-Constructor");		
	}
	Test(int f){
		System.out.println("1-Constructor");		
	}
	Test(int d,int e){
		System.out.println("2-Constructor");		
	}
	Test(int a,int b,int c){
		System.out.println("3-Constructor");		
	}
	public static void main(String[] args) 
	{
		Test t=new Test();
		Test t1=new Test(10);
		Test t2=new Test(20,30);
		Test t3=new Test(40,50,60);
		System.out.println("Main Method");
	}	
}

Logic-xyz
0-Constructor
Logic-xyz
1-Constructor
Logic-xyz
2-Constructor
Logic-xyz
3-Constructor
Main Method

*************************************************************************************************************
Example:-5

Order of the Execution of the instance Block is from Top to Bottom.

class Test
{
	{
		System.out.println("Instance Block");
	}

	{
		System.out.println("Instance Block -1");
	}

	{
		System.out.println("Instance Block -2");
	}

	{
		System.out.println("Instance Block-3");
	}
	Test(){
		System.out.println("Constructor");		
	}
	
	public static void main(String[] args) 
	{
		Test t=new Test();
		System.out.println("Main Method");
	}	
}


D:\JavaCode>java Test
Instance Block
Instance Block -1
Instance Block -2
Instance Block-3
Constructor
Main Method
********************************************************************
Example 6:-

Instance block execution depends on object creation but not constructor execution.

In below example two constructors are executing but only one object is crating.
Hence only one time instance block is executed.

class Test
{
	{
		System.out.println("Instance Block");
	}
	Test(){
		this(10);
		System.out.println("Constructor");		
	}
	Test(int x){
		System.out.println("1-arg-Constructor");		
	}
	public static void main(String[] args) 
	{
		Test t=new Test();
		System.out.println("Main Method");
	}	
}

D:\JavaCode>java Test
Instance Block
1-arg-Constructor
Constructor
Main Method
*******************************************************************************************
Example 7:-

Using Instance blocks to assing value to variables and call methods() also.

class Test
{
	int x=10;
	static int y=20;
	{
		System.out.println("Instance Block");
		x=30;
		y=40;
	}
	Test(){
		System.out.println("Constructor");		
	}
	public static void main(String[] args) 
	{
		Test t=new Test();
		System.out.println("Main Method");
		System.out.println(t.x);
		System.out.println(t.y);
	}	
}

D:\JavaCode>java Test
Instance Block
Constructor
Main Method
30
40
****************************************************************************************
Pending:- // Will complete after method return type is completed.

Example 8:-

When we declare instance block & instance variable the execution order is top to bottom.
In below example instance block is declared first so instance block is executed first.



class Test
{
	{ System.out.println("instance block"); } //instance block
   
	int a=m1(); //instance variables
	
   int m1(){
	   System.out.println("m1() method called by variable");
	return 100;
}
	public static void main(String[] args){
		new Test();
	}
}