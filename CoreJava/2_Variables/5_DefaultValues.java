Default Values
**************
The values which are assigned by the compiler automatically are called Default values.


Points to Remeber
****************
Default values will be allocated to only Instance and Static Variables.
Default value concept is not applicable for local Variables.

Default Values for DataTypes
****************************
Numeric types:

byte: 0
short: 0
int: 0
long: 0L
float: 0.0f
double: 0.0d
char: '\u0000' (null character)

boolean: false

Reference types:

Objects: null
Arrays: null

Programe
********

Default Value Programe.
************************
class Test
{
	int x;
	static int y;

	public static void main(String[] args) {
		System.out.println("Main Method");
		
	}
}

D:\JavaCode>java Test
Main Method
 Value of Y= 0
 Value of x= 0


Default Value not applicable to LocalVariables.
***********************************************

class Test
{

	public static void main(String[] args) {
		System.out.println("Main Method");
		int y;
		System.out.println(" Value of Y= "+y);
	}
}

D:\JavaCode>javac Test.java
Test.java:7: error: variable y might not have been initialized
                System.out.println(" Value of Y= "+y);
                                                   ^
1 error