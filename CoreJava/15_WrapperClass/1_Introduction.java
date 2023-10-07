Need of Wrapper Classes
***********************
There are certain needs for using the Wrapper class in Java as mentioned below:

They convert primitive data types into objects. Objects are needed if we wish to modify the arguments passed into a method (because primitive types are passed by value).
The classes in java.util package handles only objects and hence wrapper classes help in this case also.


Advantages of Wrapper Classes

Collections allowed only object data.
On object data we can call multiple methods compareTo(), equals(), toString()
Cloning process only objects
Object data allowed null values.
Serialization can allow only object data.//(Sending Object via network).


1. Autoboxing
The automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing. For example – conversion of int to Integer, long to Long, double to Double, etc. 

// Java program to demonstrate Autoboxing

import java.util.ArrayList;
class Autoboxing {
	public static void main(String[] args)
	{
		char ch = 'a';

		// Autoboxing- primitive to Character object
		// conversion
		Character a = ch;

		ArrayList<Integer> arrayList
			= new ArrayList<Integer>();

		// Autoboxing because ArrayList stores only objects
		arrayList.add(25);

		// printing the values from object
		System.out.println(arrayList.get(0));
	}
}



2. Unboxing
It is just the reverse process of autoboxing. Automatically converting an object of a wrapper class to its corresponding primitive type is known as unboxing. For example – conversion of Integer to int, Long to long, Double to double, etc.

// Java program to demonstrate Unboxing
import java.util.ArrayList;

class Unboxing {
	public static void main(String[] args)
	{
		Character ch = 'a';

		// unboxing - Character object to primitive
		// conversion
		char a = ch;

		ArrayList<Integer> arrayList
			= new ArrayList<Integer>();
		arrayList.add(24);

		// unboxing because get method returns an Integer
		// object
		int num = arrayList.get(0);

		// printing the values from primitive data types
		System.out.println(num);
	}
}



1. Which are the wrapper classes in Java?
A Wrapper class in Java is a class whose object wraps or contains primitive data types.

2. Why use the wrapper class in Java?
The wrapper class in Java is used to convert primitive data types into objects. Objects are needed if we wish to modify the arguments passed into a method.

3. What are the 8 wrapper classes in Java?
There are 8 Wrapper classes in Java these are Boolean, Byte, Short, Character, Integer, Long, Float, Double.


Advangtages of Using Wrapper class concept in java.

In Java, the wrapper classes provide a way to use primitive data types as objects. Each primitive data type has a corresponding wrapper class, such as Integer for int, Double for double, etc. The wrapper concept in Java offers several advantages:

Nullable Values in Collections:

Wrapper classes allow you to represent null values for primitive types, which is not possible with the primitive types themselves. This is particularly useful in collections (like List, Set, `Map) where null often indicates an absence of a value.
Generics in Collections:

Generics in Java work only with objects, not primitive types. By using wrapper classes, you can use generics with collections, allowing you to create collections that can hold elements of any type.
Compatibility with Object-Oriented Frameworks:

Many object-oriented frameworks and libraries work with objects, not primitive types. Using wrapper classes allows you to seamlessly integrate primitive types into these frameworks.
Methods for Conversion:

Wrapper classes provide methods for converting between primitive types and their corresponding wrapper objects. For example, the parseInt method in the Integer class converts a String to an int.