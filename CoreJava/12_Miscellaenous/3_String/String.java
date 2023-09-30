String in java

They are around 4 class es for String in java.

1) Java.lang.String
2) Java.lang.StringBuffer
3) Java.lang.StringBuilder
4) Java.util.StringTokenizer



Java.lang.String / String
*************************
String is used to represent group of characters or character array enclosed with in the double quotes.

We are able to create String object in two ways.

1) Without using new operator String str="Vinay";
2) By using new operator String str = new String("Vinay");

class Test {
	public static void main(String[] args) {
		String str = "Vinay";
		System.out.println(str);
		String str1 = new String("Vinay");
		System.out.println(str1);
	}
}



D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Vinay
Vinay


*************************************************************************************************
StringBuffer
************
StringBuffer object is created as follow by the example.

StringBuffer <userdefiened name> =new StringBuffer("Vinay");

Example:- 1
***********

class Test {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Vinay");
	}
}


StringBuilder
************
StringBuilder object is created as follow by the example.

StringBuilder <userdefiened name> =new StringBuilder("Vinay");

Example:- 1
***********

class Test {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Vinay");
	}
}


*************************************************************************************************
== operator :-

1) It is comparing reference type and it returns Boolean value as a return value.
2) If two reference variables are pointing to same object then it returns true otherwise false.


class Test {
	public static void main(String[] args) {
		System.out.println("***********Test***************" );
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = t1;
	 
		System.out.println(t1 == t2);
		System.out.println(t1 == t3); 
		System.out.println("***********String***************" );  
		String str1 = "Vinay";
		String str2 = "James";
		String str3 = "Vinay";
		System.out.println(str1 == str2); 
		System.out.println(str1 == str3); 
		System.out.println("***********new String()***************" );  
		String s1 = new String("Vinay");
		String s2 = new String("Shetty");
		String s3 = new String("Vinay");
		System.out.println(s1 == s2); 
		System.out.println(s1 == s3); 
		System.out.println("***********StringBuffer***************" );
		StringBuffer sb1 = new StringBuffer("Vinay");
		StringBuffer sb2 = new StringBuffer("James");
		StringBuffer sb3 = new StringBuffer("Vinay");
		System.out.println(sb1 == sb2);
		System.out.println(sb1 == sb3);
		System.out.println("***********StringBuilder***************" );
		StringBuilder sbd = new StringBuilder("Vinay");
		StringBuilder sbd1 = new StringBuilder("James");
		StringBuilder sbd2 = new StringBuilder("Vinay");
		System.out.println(sbd == sbd1); 
		System.out.println(sbd == sbd2); 
	}
}
	
**********************************************************************************************

**********************************************************************************************
toString() method
*****************
toString( ) method present in object class it returns a string representation of object(class-name@hashcode).

Example:- 

class Test {
	public static void main(String[] args) {
	Test t=new Test();
	System.out.println(t.toString());
	}
}

Test@2c7b84de


String is child class of Object and it is overriding toString() to return content of the String object.

StringBuffer is child class of Object and it is overriding toString() to return content of the StringBuffer object.
Hint:- See the source file after unzipping for confermation // C:\Users\vinayts\OneDrive\Desktop\delete\java.base\java\lang\String.java

Note :- whenever we are printing any type of reference variable in java internally it is calling toString() method .


class Test {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t);
		System.out.println(t.toString());
		
		// String class toString() executed
		String str = "Vinay";
		System.out.println(str);
		System.out.println(str.toString());
		
		// StringBuffer class toString() executed
		StringBuffer sb = new StringBuffer("James");
		System.out.println(sb);
		System.out.println(sb.toString());
		
		StringBuilder sbd = new StringBuilder("Shetty");
		System.out.println(sbd);
		System.out.println(sbd.toString());
	}
}

****************************************************************************************************************
immutability vs mutability
**************************

Immutability:- Once Created cannot be Modified.
------------
String is immutability class it means once we are creating String objects it is not possible to perform modifications on existing object. (String object is fixed object)

Example 2:-
**********
class Test {
	public static void main(String[] args) {
		
		// String class toString() executed
		String str = "Vinay";
		str.concat("Shetty");
		System.out.println(str);
		
		
		String st=new String("James");
		st.concat("Gosling");
		System.out.println(st);
	}
}

Vinay
James


Assignment 1:- If there is no concat operation happening from concat() method.
what is the use of that method.
Create a program to show the usage of this method.

Hint:- Create 2 String Object.
      str1 and str2.
	  use str1.concat(str2)
	  To verify use toString() method to conferm 


mutability :- Once Created can be Modified.
----------
StringBuffer is a mutability class it means once we are creating StringBuffer objects on that existing object it is possible to perform modification.

class Test {
	public static void main(String[] args) {
		
		// String class toString() executed
		StringBuffer str =new StringBuffer("Vinay");
		str.append("Shetty");
		System.out.println(str);
	}
}

VinayShetty

StringBuffer is a mutability class it means once we are creating StringBuffer objects on that existing object it is possible to perform modification.

class Test {
	public static void main(String[] args) {
		
		// String class toString() executed
		StringBuilder str =new StringBuilder("Vinay");
		str.append("Shetty");
		System.out.println(str);
	}
}
****************************************************************************************************************

Internal implementation of .equals() method.
********************************************
.equals( ) method present in object used for reference comparison & return Boolean value.
If two reference variables are pointing to same object returns true otherwise false.

class Test {
	public static void main(String[] args) {
		Test t=new Test();
		Test t1=new Test();
		Test t2=t;
		
		System.out.println(t.equals(t1));
		System.out.println(t1.equals(t));
		System.out.println(t2.equals(t));
	}
}

false
false
true


String
******

String is child class of object and it is overriding .equals( ) methods used for content comparison.
If two objects content is same then returns true otherwise false


StringBuffer
************
StringBuffer class is child class of object and it is not overriding equals() method hence it is using parent class(Object) equals() method used for reference comparison.
If two reference variables are pointing to same object returns true otherwise false.


StringBuilder
************
StringBuilder class is child class of object and it is not overriding equals() method hence it is using parent class(Object) equals() method used for reference comparison.
If two reference variables are pointing to same object returns true otherwise false.

class Test {
	public static void main(String[] args) {
		String s="Vinay";
		String s1="james";
		String s2="Vinay";
		
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		
		System.out.println("----------------------");
		
		StringBuffer sb=new StringBuffer("Vinay");
		StringBuffer sb1=new StringBuffer("James");
		StringBuffer sb2=sb;
		
		System.out.println(sb.equals(sb1));
		System.out.println(sb.equals(sb2));
		System.out.println("----------------------");
		
		StringBuilder sbl=new StringBuilder("Vinay");
		StringBuilder sbl1=new StringBuilder("James");
		StringBuilder sbl2=sbl;
		
		System.out.println(sb.equals(sbl1));
		System.out.println(sb.equals(sbl2));
	}
}


****************************************************************************************************************
== method and .equals () method Differences.

Assignemnt:- 
Create a table for the == operator and .equals() method.
****************************************************************************************************************

StringBuilder
*************
Java.lang.StringBuilder:-

1) Introduced in jdk1.5 version.
2) StringBuilder is identical to StringBuffer except for one important difference.
3) Every method present in the StringBuilder is not Synchronized means that is not thread safe.
4) multiple threads are allow to operate on StringBuilder methods hence the performance of the application is increased.


****************************************************************************************************************
Difference begtween .equals() method and == method.
****************************************************************************************************************
All String class method basic examples.
****************************************************************************************************************
Assignment:- 1

class Test {
	public static void main(String[] args) {	
		String str = "Vinay";
		String str1 = "Shetty";
		String str2=str.concat(str1);
	
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
	}
}
****************************************************************************************************************