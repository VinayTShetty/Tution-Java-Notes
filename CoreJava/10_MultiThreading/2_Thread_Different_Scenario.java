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
		3)When ever Thread is registred to Thread Scheduler then only Thread is created.
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

Assignment:- Investigate where is this run() method is avaliable in Parent class.
what is the name of the Parent class.
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
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------