1) What is Java?

Java is the high-level, object-oriented, robust, secure programming language, platform-independent, 
high performance, Multithreaded, and portable programming language. 
It was developed by James Gosling in June 1991.
It can also be known as the platform as it provides its own JRE and API.
****************************************************************************************************************
 List the features of Java Programming language

Simple: Java is easy to learn. The syntax of Java is based on C++ which makes easier to write the program in it.

Object-Oriented: Java follows the object-oriented paradigm which allows us to maintain our code as the combination of different type of objects that incorporates both data and behavior.

Portable: Java supports read-once-write-anywhere approach. We can execute the Java program on every machine. Java program (.java) is converted to bytecode (.class) which can be easily run on every machine.

Platform Independent: Java is a platform independent programming language. It is different from other programming languages like C and C++ which needs a platform to be executed. Java comes with its platform on which its code is executed. Java doesn't depend upon the operating system to be executed.

Secured: Java is secured because it doesn't use explicit pointers. Java also provides the concept of ByteCode and Exception handling which makes it more secured.

Robust: Java is a strong programming language as it uses strong memory management. The concepts like Automatic garbage collection, Exception handling, etc. make it more robust.

Architecture Neutral: Java is architectural neutral as it is not dependent on the architecture. In C, the size of data types may vary according to the architecture (32 bit or 64 bit) which doesn't exist in Java.

Interpreted: Java uses the Just-in-time (JIT) interpreter along with the compiler for the program execution.

High Performance: Java is faster than other traditional interpreted programming languages because Java bytecode is "close" to native code. It is still a little bit slower than a compiled language (e.g., C++).

Multithreaded: We can write Java programs that deal with many tasks at once by defining multiple threads. The main advantage of multi-threading is that it doesn't occupy memory for each thread. It shares a common memory area. Threads are important for multi-media, Web applications, etc.

Distributed: Java is distributed because it facilitates users to create distributed applications in Java. RMI and EJB are used for creating distributed applications. This feature of Java makes us able to access files by calling the methods from any machine on the internet.

Dynamic: Java is a dynamic language. It supports dynamic loading of classes. It means classes are loaded on demand. It also supports functions from its native languages, i.e., C and C++.
****************************************************************************************************************
What gives Java its 'write once and run anywhere' nature?

The bytecode. Java compiler converts the Java programs into the class file (Byte Code)
which is the intermediate language between source code and machine code. 
This bytecode is not platform specific and can be executed on any computer.
****************************************************************************************************************
If I don't provide any arguments on the command line, then what will the value stored in the String array passed into the main() method, empty or NULL?

It is empty, but not null.
****************************************************************************************************************
What if I write static public void instead of public static void?
The program compiles and runs correctly because the order of specifiers doesn't matter in Java
****************************************************************************************************************
What is the default value of the local variables?
****************************************************************************************************************
What are the various access specifiers in Java?
In Java, access specifiers are the keywords which are used to define the access scope of the method, class, or a variable. In Java, there are four access specifiers given below.

Public The classes, methods, or variables which are defined as public, can be accessed by any class or method.
Protected Protected can be accessed by the class of the same package, or by the sub-class of this class, or within the same class.
Default Default are accessible within the package only. By default, all the classes, methods, and variables are of default scope.
Private The private class, methods, or variables defined as private can be accessed within the class only.
****************************************************************************************************************
18) What is the purpose of static methods and variables?

****************************************************************************************************************
19) What are the advantages of Packages in Java?
There are various advantages of defining packages in Java.

Packages avoid the name clashes.
The Package provides easier access control.
We can also have the hidden classes that are not visible outside and used by the package.
It is easier to locate the related classes.
****************************************************************************************************************
What is the constructor?
How many types of constructors are used in Java?
Does constructor return any value?
****************************************************************************************************************
Why is the main method static?
Because the object is not required to call the static method. If we make the main method non-static, JVM will have to create its object first and then call main() method which will lead to the extra memory allocation
****************************************************************************************************************
Can we override the static methods?
No, we can't override static methods.

What is the static block?
****************************************************************************************************************

****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
Stack and Heap
**************
int x=10;

x is stored in stack memory 
value of x is stored in Heap Memory.

Stack is used for static memory allocation , that is memory is allocated at compile time.

Heap is used for dynamic memory allocation , that is memory is changed during runtime.
Heap memory is allocated and freed at random order.

Compare to Stack , Objects in Heap memory acess is much slower.

Stack follows LIFO order.
That is Last in Frist Out.

Heap doesnt follow any Order.Its dynamic.


Stack is used to store memory for very shortTime. like methods,variables,reference variable of the Objects.
Heap is used to store Objects and JRE class es and its values.
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************
****************************************************************************************************************

