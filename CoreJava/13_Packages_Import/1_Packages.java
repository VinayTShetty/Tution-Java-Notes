java source code:-
******************

Java is a open source software we are able to download it free of cost and we are able to see the source code of the java.
The source code location C:\Program Files\Java\jdk1.7.0_75\src (zip file) extract the zip file.

Java contains 14 predefined packages but the default package in java if java.lang. package.

Java.lang 
java.beans
java.text
java.sql

Note : The default package in java is java.lang package.
Note : package is nothing but physical folder structure.


Types of packages:-

There are two types of packages in java
1) Predefined packages.
2) User defined packages.


Predefined packages:
********************

The predefined packages are introduced by James Gosling and these packages contains predefined classes & interfaces and these class & interfaces contains predefined variables and methods.
Example:- java.lang, java.io ,java.util…..etc


User defined packages:-
***********************
The packages which are defined by user, and these packages contains user defined classes and interfaces.
Declare the package by using package keyword.

syntax : package package-name;
example : package com.certisured;


Rules
*****
Inside the source file it is possible to declare only one package statement 
and that statement must be first statement of the source file.



Example-1:valid

package com.certisured;
import java.io.*;
import java.lang.*;

Example-2:Invalid
import java.io.*;
package com.sravya;
import java.io.*;

Example-3:Invalid
import java.io.*;
import java.lang.*;
package com.sravya;

Example-4:Invalid
package com.sravya;
package com.tcs;

Java.lang:-The most commonly required classes and interfaces to write a sample program is encapsulated into a separate package is called java.lang package.

java
|------lang
|-- String(class)
|-- StringBuffer(class)
|-- Object(class)
|-- Runnable(interface)
|-- Cloneable(interface)

Note:- the default package in the java programming is java.lang package.


Package name coding conventions :-(not mandatory but we have to follow)
************************************************************************

Advantages of packages:-
***********************

Example-1:-
**********
Step-1: write the application with package statement.

package com.sravya.java.corejava;
class Test{
	public static void main(String[] args){
		System.out.println("package first example");
		}
	}

class A{ }
class B{ }
interface It{ }

execute and run package diagram



Import Statement.
*****************

Importing all classes.
**********************
Import java.lang.*;

Importing application required classes
**************************************
Import java.lang.System;
Import java.lang.String;

Import Variables
***************
import static java.lang.Math.PI; 

Example Code
************
import static java.lang.Math.PI; 
class Test{
	public static void main(String[] args) {
		 System.out.println( 2 * PI);  
	}
}


Import Methods
**************
import static java.lang.Math.sqrt; 

Example Code
************
import static java.lang.Math.sqrt;

class Test{
	public static void main(String[] args) {
        System.out.println(sqrt(25));    
	}
}


Example:- We can import mulitple clasees and Variables and method.
*******
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) {
        // Using classes from different packages

        // Using classes from java.util package
        List<String> myList = new ArrayList<>();
        myList.add("Java");
        myList.add("Python");

        // Using classes from java.util and java.text packages
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = dateFormat.format(currentDate);

        // Displaying results
        System.out.println("List: " + myList);
        System.out.println("Formatted Date: " + formattedDate);
    }
}



Object class
************
why Object class acts as a root class for all java class.
Because the most common method which all class es are required are defined in the Object class.

Directly or indirectly every class in java is the child class of Object.

Directly :- class A is by default extends Object class directly.
*******
class A
{
}

Indirectly:- class A is the direct child class of Object. class B is the indirect child class of Object. 
************
class B extends A{}
class A{}

