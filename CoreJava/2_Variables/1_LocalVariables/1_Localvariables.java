Local Variables
------------------
A variable which is declared inside  the 'Method','Block','Constructor','Loop' is called Local variables.
only final modifier is allowed for local variable.


Syntax for Creating a Local Variable
-------------------------------------

<Modifier><Data-Type><UserDefined Name>=value;
Example:-  final int x=100;

Note :- Here <Modifier> is optional
Example:-   int y=100;

class Test
{
	public static void m1(){
		int x=100; // Local variable declared inside the method.
	}

	public void m2(){
		final int y=100; // Local variable declared inside the method.
	}
}