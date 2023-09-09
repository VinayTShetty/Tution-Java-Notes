Example 1:- Create a Thread by Extending Thread class.

class GameCar extends Thread {
	public void run() {
		System.out.println("Business Logic of the Thread");
		System.out.println("Thread Name= " + Thread.currentThread().getName());
	}
}

class Test {
	public static void main(String[] args) {
		System.out.println("Main Method");
		GameCar gc = new GameCar();
		gc.start();
	}

}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Main Method
Business Logic of the Thread
Thread Name= Thread-0

Points:- When ever we are calling 
		gc.start();
		1)Thread class start() method will be executed.
		2)Your Thread i.e will be registred to Thread Scheduler. i.e (Thred-0)
		3)When ever Thread is registred to Thread Scheduler then only new Thread is created.
------------------------------------------------------------------------------------------------------------
Example 2:- We cannot Start the Same Thread Twice

class GameCar extends Thread {
	public void run() {
		System.out.println("Business Logic of the Thread");
		System.out.println("Thread Name= " + Thread.currentThread().getName());
	}
}

class Test {
	public static void main(String[] args) {
		System.out.println("Main Method");
		GameCar gc = new GameCar();
		gc.start();
		gc.start();
	}
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Main Method
Exception in thread "main" Business Logic of the Thread
java.lang.IllegalThreadStateException
        at java.base/java.lang.Thread.start(Thread.java:793)
        at Test.main(Test.java:13)
Thread Name= Thread-0
------------------------------------------------------------------------------------------------------------
Example :- 3 

By Default java class Having main method,Will contain main Thread.
The name of the Thread is 'main'
This 'main' Thread is not created from the user.
Its default created by JVM.


class Test {
	public static void main(String[] args) {
	System.out.println("Thread Name= " + Thread.currentThread().getName());
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Thread Name= main
------------------------------------------------------------------------------------------------------------
Example :- 4
Difference between start() and run() method.

start():- 
If the user is using start() method,new Thread won t be created.
Using the existing Thread only the operation will be executed.

run():-
If the user is using run() method, new Thread will be created.
The operation will be carried from that new Thread.
------------------------------------------------------------------------------------------------------------
Example 4.1:-Using start() method.

class GameCar extends Thread {
	public void run() {
		System.out.println("Game Car ");
		System.out.println("Game Car --> " + Thread.currentThread().getName());	
	}
}

class Test {
	public static void main(String[] args) {
		System.out.println("Main Method");
		System.out.println("Test class --> " + Thread.currentThread().getName());	
		GameCar gc = new GameCar();
		gc.start();
	}

}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Main Method
Test class --> main
Game Car
Game Car --> Thread-0

Assignment:- Investigate where is this run() method is avaliable in Parent class.
what is the name of the Parent class.
------------------------------------------------------------------------------------------------------------
Example 4.2:-Using run() method.

class GameCar extends Thread {
	public void run() {
		System.out.println("Game Car ");
		System.out.println("Game Car --> " + Thread.currentThread().getName());	
	}
}

class Test {
	public static void main(String[] args) {
		System.out.println("Main Method");
		System.out.println("Test class --> " + Thread.currentThread().getName());	
		GameCar gc = new GameCar();
		gc.run();
	}

}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Main Method
Test class --> main
Game Car
Game Car --> main


Points to Remember:- In this example new Thread is not created because,It s behaving like a normal method call.

1)We are not calling Thread class start() method.
2)If we are not calling Thread class start() method ,Then Thread won t be registered in Thread Scheduler.
3)If the Thread is not registered in the Thread scheduler ,then new Thread won t be created.

------------------------------------------------------------------------------------------------------------
Stack Mechanism.

For each and Every Thread,Stack will be Created.
In that stack ,The corresponding Thread method calls will be stored.
once the Thread execution is finished.
Stack will be destroyed.

Example 5:-Multiple Thread performing Single Task.(All Thread executing only run () method call.)

class GameCar extends Thread {
	public void run() {
		System.out.println("Game Car ");	
	}
}

class Test {
	public static void main(String[] args) {
		System.out.println("Main Method");
		
		GameCar gc = new GameCar();
		gc.start();
		
		GameCar gc_1 = new GameCar();
		gc_1.start();

		GameCar gc_2 = new GameCar();
		gc_2.start();

		GameCar gc_3 = new GameCar();
		gc_3.start();
	}

}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Main Method
Game Car
Game Car
Game Car
Game Car

Assignemnt:- Create Stack Diagram PPT.
1)Create a Exmaple where Mulitple Thread is having mulitple Task.
------------------------------------------------------------------------------------------------------------
Example 6:- Thread name Getting and Setting.

class GameCar extends Thread {
	public void run() {
		System.out.println("Game Car Logic");	
	}
}

class Test {
	public static void main(String[] args) {

		GameCar gc = new GameCar();
		gc.start();
		
		System.out.println("GC Thread default Name= "+gc.getName());
		
		gc.setName("Cerstisured Car ");
		System.out.println("GC default Name= "+gc.getName());
		
	
	}
}

Game Car Logic
GC Thread default Name= Thread-0
GC default Name= Cerstisured Car
------------------------------------------------------------------------------------------------------------
Example 7:- Setting and Getting the Thread name

class GameCar extends Thread {
	public void run() {
		System.out.println("Game Car Logic");	
		System.out.println("Game Car Thread=  "+Thread.currentThread().getName());
	}
}

class Test {
	public static void main(String[] args) {
		System.out.println("Main Method");		
		
		GameCar gc = new GameCar();
		gc.start();
		
		System.out.println("GC Thread default Name= "+gc.getName());
		
		gc.setName("Cerstisured Car ");
		System.out.println("GC default Name= "+gc.getName());
		
		System.out.println("Main Method = "+Thread.currentThread().getName());
	}
}

Assignment:- In the same way Create example for getting the Thread getId() , . .. all Thread get() properties.
------------------------------------------------------------------------------------------------------------
Example 8:- Explanation on For Loop:-

Its used to execute the code for particular interval of time.

class Test{
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(" Hello World ");
		}
	}
}
------------------------------------------------------------------------------------------------------------
Example 9:- Thread Priority

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 15; i++) {
			System.out.println("Name= "+Thread.currentThread().getName()+" Priority= "+Thread.currentThread().getPriority());
		}
	}
}
class Test {
	public static void main(String[] args)// main thread started
	{
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}
}

Thread Priority is not working Properly Because , Its not licensed version.
It will work properly in Linux OS.
In Real Time application we build application in Windows OS/platform and deply in Linux OS/Platform.
------------------------------------------------------------------------------------------------------------
Yield() method
**************
class MyThread extends Thread {
	public void run() {

		for (int i = 0; i < 100; i++) {
			Thread.yield();
			System.out.println("child thread");
		}
	}
}

class Test {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();

		for (int i = 0; i < 100; i++) {
			System.out.println("main thread");
		}
	}
}
------------------------------------------------------------------------------------------------------------
name less Object Creation
*************************
Syntax:-new <Class Name>();


class Test {
	int x=10;
	public static void main(String[] args) {
		// Named Object approach
		Test t=new Test();
		System.out.println(t.x);
		
		//Nameless Object Approach
		System.out.println(new Test().x);
	}
}

When we should use nameless Object:- When ever we want to create Object only once and it s reference is not used 
any where in the application then we should create nameless object.
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------