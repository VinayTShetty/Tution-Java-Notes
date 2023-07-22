Example 1:-OverLoading example 

1)Same Method Name but Different number of arguments.

class Test
{
	// Same method name but different number of arguments.

	public void addNumber(){
		System.out.println("No argument");
	}

	public void addNumber(int x,int y){
		System.out.println("2 argument ");
	}

	public void addNumber(int x,int y,int z){
		System.out.println("3 argument same Data Type");
	}

	public static void main(String [] args){
		Test t=new Test();
		t.addNumber();
		t.addNumber(100,200);
		t.addNumber(10,20,30);
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
No argument
2 argument
3 argument same Data Type
----------------------------------------------------------------------------------------------------------------
Example 2

class Test
{
	// Same method name & same/different number of arguments but different data types.

	public void addNumber(){
		int x=10;
		int y=20;
		int total=x+y;
		System.out.println("Sum= "+total);
	}

	public void addNumber(int x,int y,String password){
		System.out.println("Same Method name 3 argument");
	}

	public void addNumber(int x,int y,int z,boolean status){
		System.out.println("Same Method name 4 argument");
	}

	public static void main(String [] args){
		Test t=new Test();
		t.addNumber();
		t.addNumber(100,200,"Admin@123");
		t.addNumber(10,20,30,false);
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Sum= 30
Same Method name 3 argument
Same Method name 4 argument
------------------
Sum of 3 numbers= 60
Status= false
****************
----------------------------------------------------------------------------------------------------------------
All these combination are allowed.
**********************************
1)Compulsary method name should be same.(Very Important)

2)Different number of arguments
3)Same number of arguments ,Different Data Types.
4)Different number of arguments ,Same Data Types.
----------------------------------------------------------------------------------------------------------------
Example 3:-
return type is not considered for overLoading Concept.

Important Point to Note down:- Method name is same and argument is different.

class Test
{
	// Same method name & same/different number of arguments but different data types.

	public int addNumber(){
		System.out.println("Method overloading int type");
		return 10;
	}

	public String addNumber(int x,int y,String password){
		System.out.println("Method overloading String type");
		return "MyExample";
	}

	public boolean addNumber(int x,int y,int z,boolean status){
		System.out.println("Method overloading boolean type");
		return true;
	}

	public static void main(String [] args){
		Test t=new Test();
		t.addNumber();
		t.addNumber(100,200,"Admin@123");
		t.addNumber(10,20,30,false);
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Method overloading int type
Method overloading String type
Method overloading boolean type

----------------------------------------------------------------------------------------------------------------
Example 4:-
Automatic Type Promotion in overloading as well as in Normal method call.

class Test
{
	public void addNumber(float value){
		System.out.println("Method overloading Type promotion");
	}

	public static void main(String [] args){
		Test t=new Test();
		t.addNumber(10);
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Method overloading Type promotion


Example 4.1
**********
Automatic Type Promotion in also valid in overloading.

class Test
{
	void addNumber(float value){
		System.out.println("Method overloading Type float");
	}

	void addNumber(int value){
		System.out.println("Method overloading Type int");
	}

	public static void main(String [] args){
		Test t=new Test();
		//t.addNumber('A');
		//t.addNumber(10);
		//t.addNumber(3.14f);
	}
}

----------------------------------------------------------------------------------------------------------------
Example 5
********
overloading of private /static /final methods is valid.

Example 5.1 :- Overloading of private methods is valid.
**********
class Test
{
	private  void addNumber(int fristNumber,int secondNumber){
		System.out.println("Method overloading Type 2 -arg");
	}

	private  void addNumber(int fristNumber,int secondNumber,int thirdNumber){
		System.out.println("Method overloading Type 3-arg");
	}

	public static void main(String [] args){
		Test t=new Test();
		t.addNumber(10,20);
		t.addNumber(10,20,30);
	}
}


Example 5.2 :- Overloading of static methods is valid.
**********
class Test
{
	static  void addNumber(int fristNumber,int secondNumber){
		System.out.println("Method overloading Type 2 -arg");
	}

	static  void addNumber(int fristNumber,int secondNumber,int thirdNumber){
		System.out.println("Method overloading Type 3-arg");
	}

	public static void main(String [] args){
		Test t=new Test();
		t.addNumber(10,20);
		t.addNumber(10,20,30);
	}
}


Example 5.3 :- Overloading of final methods is valid.
**********
class Test
{
	final  void addNumber(int fristNumber,int secondNumber){
		System.out.println("Method overloading Type 2 -arg");
	}

	final  void addNumber(int fristNumber,int secondNumber,int thirdNumber){
		System.out.println("Method overloading Type 3-arg");
	}

	public static void main(String [] args){
		Test t=new Test();
		t.addNumber(10,20);
		t.addNumber(10,20,30);
	}
}

Example 5.4 :- Overloading of private /static /final methods is valid.
**********

class Test
{
	private static final void addNumber(int fristNumber,int secondNumber){
		System.out.println("Method overloading Type 2 -arg");
	}

	private static final void addNumber(int fristNumber,int secondNumber,int thirdNumber){
		System.out.println("Method overloading Type 3-arg");
	}

	public static void main(String [] args){
		Test t=new Test();
		t.addNumber(10,20);
		t.addNumber(10,20,30);
	}
}



D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Method overloading Type 2 -arg
Method overloading Type 3-arg
----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------