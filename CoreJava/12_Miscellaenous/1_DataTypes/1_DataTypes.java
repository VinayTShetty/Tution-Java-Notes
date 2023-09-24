Data Types
**********


Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.
Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.

Note:- char to ASCII
https://www.rapidtables.com/code/text/ascii-table.html

Java Primitive Data Types
*************************
There are 8 types of primitive data types:

boolean 
byte 
char 
short 
int 
long 
float 
double 



Default Values of Data Types.
****************************

Example 1:-Default Values of Primitive Types.

class Test{
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static boolean bo;
	static char c;
	public static void main(String[] args) {
		System.out.println("byte = "+b);
		System.out.println("Short = "+s);
		System.out.println("int = "+i);
		System.out.println("long= "+l);
		System.out.println("float = "+f);
		System.out.println("double= "+d);
		System.out.println("boolean= "+bo);
		System.out.println("char = "+c);
	}
}

byte = 0
Short = 0
int = 0
long= 0
float = 0.0
double= 0.0
boolean= false
char =

*****************************************************************************************************************
Example 2 :-Default values for Non-Primiotive Types is null.

class Test{
	static Exam e;
	static String s;
	public static void main(String[] args) {
		System.out.println(e);
		System.out.println(s);
	}
}


class Exam
{
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test
null
null

*****************************************************************************************************************
Example 3 :-

Its valid to represent both +ve and -ve numbers for Integral  and Floating point data types
So these data types are called signed data types.


Expect char and boolean remaining data types are signed data types.
For char and boolean we cannot represent anything in -ve.

*****************************************************************************************************************
Example :-

data types calculation in the PPT.

*****************************************************************************************************************
Example :-
*****************************************************************************************************************
Example :-
*****************************************************************************************************************
Example :-
byte,short,int, float , double , long

byte:-byte: This is an 8-bit signed data type. Use byte when you need to conserve memory and you are working with small integers within the range of -128 to 127. byte is often used when dealing with raw binary data or when memory usage is a critical concern
Use byte when you need to represent small integers within the range of -128 to 127 and memory conservation is critical.

short:- This is a 16-bit signed data type. Use short when you need to represent integers within a larger range than byte, typically -32,768 to 32,767. It's' useful when you need more range than byte but still want to conserve memory compared to int
Use short when you need to represent integers within the range of -32,768 to 32,767 and still want to conserve memory compared to int.

int :-This is a 32-bit signed data type. int is the default choice for representing integers in Java because it provides a good balance between range and memory usage. It can represent values from -2,147,483,648 to 2,147,483,647.
Use int as the default choice for most integer representations in Java, as it provides a good balance between range and memory usage.

char: - This is a 16-bit unsigned data type used for representing characters. Use char when you need to work with single characters, such as letters, digits, or symbols. It can also be used to represent Unicode characters.
Use char when you need to represent characters or Unicode characters.


long :- 
This is a 64-bit signed integer data type. Use long when you need to represent very large whole numbers that cannot be accommodated within the range of an int. long is typically used for things like timestamps, representing time in milliseconds, or when dealing with large counts or IDs
Use long for large whole numbers or when you need to represent time in milliseconds or other large values.

class Test{
	static char c=1;
	
	public static void main(String[] args) {
		long timestamp = System.currentTimeMillis();
		System.out.println(timestamp);
	}
}

1695564438025



float :- 
This is a 32-bit floating-point data type. Use float when you need to represent decimal numbers with single precision. It is suitable for scenarios where you need to conserve memory or when precision up to 7 decimal places is sufficient. Examples of such use cases include graphics processing, mobile applications, and some scientific calculations
Use float for single-precision floating-point numbers when memory conservation and moderate precision are sufficient
float floatValue = 3.14159f;


double :-
This is a 64-bit floating-point data type. It provides double precision compared to float. It is the default choice for representing decimal numbers in most cases because it offers a wider range and higher precision than float. Use double when you need high precision, such as in financial calculations, scientific simulations, or any situation where precision beyond 7 decimal places is required
Use double for double-precision floating-point numbers in most cases where you need high precision.
double doubleValue = 3.141592653589793;
*****************************************************************************************************************
Example :-

Assignment:- Print all Signed data types values 

1)Max values.
2)Min values.
3)Postive values
4)Negative values

All in separate programes.
*****************************************************************************************************************
Example :-
*****************************************************************************************************************