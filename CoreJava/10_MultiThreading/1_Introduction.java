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


Thread can be created in two ways:-
***********************************
1) By extending Thread class.
2) By implementing  interface(java.lang.Runnable)



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
Thread Life Cycle Explanation
*****************************