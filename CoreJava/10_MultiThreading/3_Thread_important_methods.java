Thread.sleep():-

Thread.sleep() functions to execute, it always pauses the current thread execution.
If any other thread interrupts when the thread is sleeping, then InterruptedException will be thrown
If the system is busy, then the actual time the thread will sleep will be more as compared to that passed while calling the sleep method and if the system has less load, then the actual sleep time of the thread will be close to that passed while calling sleep() method

Example 1:- 

class Test{
	
	public static void main(String[] args) throws Exception{
		System.out.println(" Main Method");
		Thread.sleep(5000);
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
	
	
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test
 Main Method
0
1
2
3  // upto 100 it will continue.
*****************************************************************************************************
Synchronized
************

Synchronized modifier is the modifier applicable for methods but not for classes and variables.

If a method or a block declared as synchronized then at a time only one Thread is allowed to operate on the given object.

The main advantage of synchronized modifier is we can resolve data inconsistency problems.

But the main disadvantage of synchronized modifier is it increases the waiting time of the Thread and effects performance of the system

Hence it is not recommended to use the synchronized modifier in the multithreading programming.


Example 2:-

class PrintMessage {
	public  static synchronized  void message(String msg) // only one thread is able to access
	{
		System.out.println(msg+" Current Thread "+Thread.currentThread().getName());
		System.out.println(msg+" Current Thread "+Thread.currentThread().getName());
	}
}

class MyThread1 extends Thread {
	public void run() {
		PrintMessage.message("Certisured");
	}
}

class MyThread2 extends Thread {
	public void run() {
		PrintMessage.message("QQ spiders");
	}
}

class MyThread3 extends Thread {
	public void run() {
		PrintMessage.message(" J Spiders");
	}
}

class Test {
	public static void main(String[] args) // main thread -1
	{
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		MyThread3 t3 = new MyThread3();
		t1.start(); // 2-Threads
		t2.start(); // 3-Threads
		t3.start(); // 4-Threads
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Certisured Current Thread Thread-0
Certisured Current Thread Thread-0
QQ spiders Current Thread Thread-1
QQ spiders Current Thread Thread-1
 J Spiders Current Thread Thread-2
 J Spiders Current Thread Thread-2


Example 2.1:-use Thread.delay() to pause the execution for few seconds to check the synchronized property.

class PrintMessage {
	public static synchronized void message(String msg) // only one thread is able to access
	{
		try{
		Thread.sleep(1000);
		System.out.println(msg+" Current Thread "+Thread.currentThread().getName());
		Thread.sleep(1000);
		System.out.println(msg+" Current Thread "+Thread.currentThread().getName());
		}
		catch(InterruptedException ie ){
			System.out.println("Interupted Exception");
		}
		
	}
}

class MyThread1 extends Thread {
	public void run() {
		PrintMessage.message("Certisured");
	}
}

class MyThread2 extends Thread {
	public void run() {
		PrintMessage.message("QQ spiders");
	}
}

class MyThread3 extends Thread {
	public void run() {
		PrintMessage.message(" JJ Spiders");
	}
}

class Test {
	public static void main(String[] args) // main thread -1
	{
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		MyThread3 t3 = new MyThread3();
		t1.start(); // 2-Threads
		t2.start(); // 3-Threads
		t3.start(); // 4-Threads
	}
}



Assignment 2:- Remove Synchronized keyword and validate the output.
See how the Thread is changing the msg based randomly.
******************************************************************************************************

