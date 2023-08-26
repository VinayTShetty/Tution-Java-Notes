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
2) By implementing java.lang.Runnable interface



By extending Thread class
*************************
Step 1:-Our normal java class will become Thread class whenever we are extending predefined Thread class.
class Test extends Thread{}

Step 2:- override the run() method to write the business logic of the Thread( run() method present in Thread class).

class Test extends Thread{
	public void run(){
		System.out.println("business logic of the thread");
	}
}

Step 3:- Create userdefined Thread class object.
i.e Test t=new Test();

class Test extends Thread{
	public static void main(String[] args) {
		Test t=new Test();		
	}

	public void run(){
		System.out.println("business logic of the thread");
	}
}

Step 4:- Start the Thread by using start() method of Thread class.

class Test extends Thread{
	public static void main(String[] args) {
			System.out.println("Hello");
			Test t=new Test();
			t.start();
	}

	public void run(){
		System.out.println("business logic of the thread");
	}
}


Assignment :-In the same way prepare notes for creating Thread using runnable interface.
