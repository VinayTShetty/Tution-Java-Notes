
Thread can be created in two ways:-
***********************************
1) By extending Thread class.
2) By implementing  Runnable interface(java.lang.Runnable)



2) By implementing  Runnable interface(java.lang.Runnable)


Procedure:-
***********
a) create a class(i.e Certisured) that implements Runnable interface
b) Overide run method() and write the logic in run() method.
c)Create a Object or instantiate Thread Object.
   i.e Thread t=new Thread();

d)Pass the runnable implemented class Object(i.e certisured variable) to Thread class Object.


Example 1
*******
class Certisured implements Runnable{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Vinay");
		}
	}
	
}
class Test{
	public static void main(String[] args) {
		Certisured c=new Certisured();
		Thread t=new Thread(c);
		t.start();
	}
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Vinay
Vinay
Vinay
Vinay .. // execute 10 times.


Example 2
*******
Passing the certisured Object directly.

class Certisured implements Runnable{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Vinay");
		}
	}
	
}
class Test{
	public static void main(String[] args) {
		Thread t=new Thread(new Certisured());
		t.start();
	}
}

Example 3
**********
Creating new Thread() Object and passing new Certisured directly.


class Certisured implements Runnable{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Vinay");
		}
	}
	
}
class Test{
	public static void main(String[] args) {
		new Thread(new Certisured()).start();
	}
}