Instance Block
**************
Instance blocks are used to write the logics of projects & these logics are executed during object creation 
just before constructor execution.

If we want to write a logic that we want to execute on the creation of all kinds of objects,
then using instance blocks is a good idea to avoid writing the same logic inside every constructor

Instance block logic is common for all the objects.

Syntax for Instance Block.
**************************
 
	{
	// Logics for the instance Block
	}	


Points to Remember
******************
Instance Block can be declared inside classes,Outside the method,Block,Constructor,Loop.

Instance Block are executed each time a Object is created.

Order of execution of instance block is from top to bottom.

We can Write mulitple intance block in java.

Order of the instance block is from top to Bottom.

In java it is possible to initialize the values in different ways
1)By using constructors
2)By using instance blocks
3)By using methods
4)By using setter methods……..…etc

static Block
************
Static blocks are used to write the logics of project that logics are executed during .class file loading time.
In java .class file is loaded only one time hence static blocks are executed once per class.

ex:- Its mainly used to upload some native libraries path in the application.
	
	Every JDBC driver class internally contains a static block to register the driver
	with DriverManager

Static block syntax
*******************
static
{
	
}


Points to Remember
******************
Inside the class it is possible to write multiple static blocks but the execution is top to bottom.
static blocks are always executed during .class file loading.