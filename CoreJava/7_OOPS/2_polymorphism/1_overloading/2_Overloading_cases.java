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
		int total=x+y+z;
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
		int total=x+y;
		System.out.println("Sum of 2 numbers= "+total);
		System.out.println("Password = "+password);
		System.out.println("------------------");
	}

	public void addNumber(int x,int y,int z,boolean status){
		int total=x+y+z;
		System.out.println("Sum of 3 numbers= "+total);
		System.out.println("Status= "+status);
		System.out.println("****************");
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
Sum of 2 numbers= 300
Password = Admin@123
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

----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------