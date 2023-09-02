Introduction
***********


Information about main Thread:-
*******************************
When a java program started one Thread is running immediately that thread is called main thread of your program.
It is used to create a new Thread(child Thread).
It must be the last thread to finish the execution because it perform various actions.


The main important application areas of the multithreading are
***************************************************************

1. Developing video games
2. Implementing multimedia graphics.
3. Developing animations


Take src folder from folder from below location and extract it.
C:\Program Files\Java\jdk-17.0.1\lib\src

Thread class location will be avaliable at C:\Users\vinayts\OneDrive\Desktop\delete\java.base\java\lang

Thread can be created in two ways:-
***********************************
1) By extending Thread class.
2) By implementing  Runnable interface(java.lang.Runnable)



By extending Thread class
*************************
Create a class GameCar that extends Thread class.
Create a Object for the GameCar class.
using the GameCar class Object Reference execute start() method.
Inside the run() method write all logics that needs to be executed from the Thread.

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

Main Method
Business Logic of the Thread
Thread Name= Thread-0


**************************************************************************************************************
Assignment :-In the same way prepare notes for creating Thread using runnable interface.
Wrtie all the steps.
For each steps write the Corresponding code.


Create a presentation which involves what is start() and run() method.
How Overriding Concept will be used.
**************************************************************************************************************

Thread Scheduler:-
*****************

Thread Scheduler is a part of the JVM.
If the application contain more than one Thread.
Thread execution is descided by Thread Scheduler.

Thread Scheduler mainly uses two algorithms to decide Thread execution.
1) Preemptive algorithm.
2) Time slicing algorithm.

We can’t expect exact behavior of the thread scheduler it is JVM vendor dependent.
So we can’t say expect output of the multithreaded examples we can say the possible outputs.


Preemptive algorithm:- 
**********************
In this highest priority task is executed first.
After this task enters into waiting state or dead state then only another higher priority task come to existence.

Time slicing algorithm:-
***********************
A task is executed predefined slice of time and then return pool of ready tasks.
The scheduler determines which task is executed based on the priority and other factors.

**************************************************************************************************************

**************************************************************************************************************
Thread Name:- 
*************
We can Get and Set the Thread Name.
Methods used for getting and Setting the Thread Name.
 <class reference variable >. getName();
 <class reference variable >. setName();

To get the Current Thread Name we can use Thread.currentThread().getName();
To get the Current Thread ID we can use Thread.currentThread().getId();
**************************************************************************************************************
Thread Priority:- 
*****************
1. Every Thread in java has some property. It may be default priority provided be the JVM or customized priority provided by the programmer.

2. The valid range of thread priorities is 1 – 10. Where 1 is lowest priority and 10 is highest priority.

3. The default priority of main thread is 5. The priority of child thread is inherited from the parent.

4. Thread defines the following constants to represent some standard priorities.

5. Thread Scheduler will use priorities while allocating processor the thread which is having highest priority will get chance first and the thread which is having low priority.

6. If two threads having the same priority then we can’t expect exact execution order it depends upon Thread Scheduler.

7. The thread which is having low priority has to wait until completion of high priority threads.

8. Three constant values for the thread priority.
	a. MIN_PRIORITY = 1
	b. NORM_PRIORITY = 5
	c. MAX_PRIORITY = 10

Assignment:- Based on the Point 3:-
Create a example and Print Thread Priority.

Thread class defines the following methods to get and set priority of a Thread.
Public final int getPriority()
Public final void setPriority(int priority)


Context Switching:- Thread priority decide when to switch from one running thread to another this process is called context switching.
******************* 

Java.lang.Thread.yield():-
*************************
Yield() method causes to pause current executing Thread for giving the chance for waiting threads of same priority.
If there are no waiting threads or all threads are having low priority then the same thread will continue its execution once again.