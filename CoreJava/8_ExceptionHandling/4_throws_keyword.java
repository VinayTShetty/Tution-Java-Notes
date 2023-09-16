throws keyword
**************
We can use throws keyword to delegate the responsibility of exception handling to the caller method.

"throws" keyword required only checked exceptions. Usage of throws for unchecked exception there is no use.

"throws" keyword required only to convince complier. Usage of throws keyword doesn't' prevent abnormal termination of the program.



Syntax:-
********
return_type method_name() throws <exception_class_name>{  

}  

note:-<exception_class_name> eiether same type or its Parent.

example :-
**********
public void add() throws Exception{
	// Exception raising code 
}


Hint:- For explanation , 
Used this below code which gives Checked Exception.i.e InterruptedException


Thread.sleep(1000) method will InterruptedException.

How to verify :- 
Open cmd and Type.
javap java.lang.Thread

*********************************************************************************************************
Example 1:- This example show s how the exception is delegated to caller method.

Example 1.1
***********
In this method exception occured at m1() i.e line 6,
But user is not interested in handling it.

public class Test {
    public static void main(String[] args) {
		new Test().m3();
	}
	public void m1(){
		Thread.sleep(1000);
	}
	public void m2(){m1();}
	public void m3(){m2();}
}

D:\JavaCode>javac Test.java
Test.java:6: error: unreported exception InterruptedException; must be caught or declared to be thrown
                Thread.sleep(1000);
                            ^
1 error

Example 1.2
***********

In this method exception occured at m1() i.e line 6,
But user is not interested in handling it.
So the user is using throws keyword to delegate the exception to caller method.i.e m2() line 8.

public class Test {
    public static void main(String[] args) {
		new Test().m3();
	}
	public void m1() throws InterruptedException{
		Thread.sleep(1000);
	}
	public void m2(){m1();}
	public void m3(){m2();}
}

D:\JavaCode>javac Test.java
Test.java:8: error: unreported exception InterruptedException; must be caught or declared to be thrown
        public void m2(){m1();}
                           ^
1 error

Example 1.3
************
In this method exception occured at m1() i.e line 6,
But user is not interested in handling it.
So the user is using throws keyword to delegate the exception to caller method.i.e m2() line 8.
In this example m2() is also not interested in handling it,so its delegating the responsibility to caller method i.e m3() method.

public class Test {
    public static void main(String[] args) {
		new Test().m3();
	}
	public void m1() throws InterruptedException{
		Thread.sleep(1000);
	}
	public void m2() throws InterruptedException{m1();}
	public void m3(){m2();}
}


D:\JavaCode>javac Test.java
Test.java:9: error: unreported exception InterruptedException; must be caught or declared to be thrown
        public void m3(){m2();}
                           ^
1 error

Example 1.4
***********
In this method exception occured at m1() i.e line 6,
But user is not interested in handling it.
So the user is using throws keyword to delegate the exception to caller method.i.e m2() line 8.
In this example m2() is also not interested in handling it,so its delegating the responsibility to caller method i.e m3() method.
In this example m3() is also not interested in handling it,so its delegating the responsibility to caller method i.e main method.


public class Test {
    public static void main(String[] args) {
		new Test().m3();
	}
	public void m1() throws InterruptedException{
		Thread.sleep(1000);
	}
	public void m2() throws InterruptedException{m1();}
	public void m3()throws InterruptedException {m2();}
}

D:\JavaCode>javac Test.java
Test.java:3: error: unreported exception InterruptedException; must be caught or declared to be thrown
                new Test().m3();

Example 1.5
***********
In this method exception occured at m1() i.e line 6,
But user is not interested in handling it.
So the user is using throws keyword to delegate the exception to caller method.i.e m2() line 8.
In this example m2() is also not interested in handling it,so its delegating the responsibility to caller method i.e m3() method.
In this example m3() is also not interested in handling it,so its delegating the responsibility to caller method i.e main method.
In this example main() is also not interested in handling it,so its delegating the responsibility to caller method i.e JVM.

In most cases it might be normal Termination or abnormal Termination.


public class Test {
    public static void main(String[] args) throws InterruptedException{
		new Test().m3();
		System.out.println("Main method");
	}
	public void m1() throws InterruptedException{
		Thread.sleep(1000);
	}
	public void m2() throws InterruptedException{m1();}
	public void m3()throws InterruptedException {m2();}
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Main method

************************************************************************************************************
Example 2:-
m1() method is throwing InterruptedException but the user is not interested in Handling it. 

public class Test {
    public static void main(String[] args) {
		new Test().m1();
		System.out.println("Main method");
	}
	public void m1() {
		Thread.sleep(1000);
	}
}


D:\JavaCode>javac Test.java
Test.java:7: error: unreported exception InterruptedException; must be caught or declared to be thrown
                Thread.sleep(1000);
                            ^
1 error

Example 2.1
***********
m1() is not interested in handling the InterruptedException so it uses throws keyword to handle the caller method i.e main method to handle the exception.

public class Test {
    public static void main(String[] args) {
		new Test().m1();
		System.out.println("Main method");
	}
	public void m1() throws InterruptedException{
		Thread.sleep(1000);
	}
}



D:\JavaCode>javac Test.java
Test.java:3: error: unreported exception InterruptedException; must be caught or declared to be thrown
                new Test().m1();
                             ^
1 error

Example 2.2
***********
main method is also not interested in Handling the exception so main method uses throws keyword to handle the exception to JVM.

public class Test {
    public static void main(String[] args) throws InterruptedException {
		new Test().m1();
		System.out.println("Main method");
	}
	public void m1() {
		Thread.sleep(1000);
	}
}



D:\JavaCode>javac Test.java
Test.java:7: error: unreported exception InterruptedException; must be caught or declared to be thrown
                Thread.sleep(1000);
                            ^
1 error

D:\JavaCode>
************************************************************************************************************
Example 3:-
************************************************************************************************************
Example 4:-
************************************************************************************************************
Example 5:-
************************************************************************************************************
Example 6:-
************************************************************************************************************
Example 7:-
************************************************************************************************************
Example 8:-
************************************************************************************************************
Example 9:-
************************************************************************************************************
Example 10:-
************************************************************************************************************
Example 11:-
************************************************************************************************************
Example 1:-
************************************************************************************************************
Example 1:-
************************************************************************************************************