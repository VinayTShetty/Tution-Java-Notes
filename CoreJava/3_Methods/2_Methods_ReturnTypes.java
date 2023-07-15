Methods Concepts
****************

Syntax for Creating a Method in java.

<Modifier Name> <Static KeyWord> <Return Type> <UserDefiend Name> (<data type> <parameter>){

	System.out.println("Method Syntax");

}


Mandatory
*********
<Return Type> <UserDefiend Name>(){
	
}

The below are optional
----------------------
<Modifier Name> 
<Static KeyWord>

<data type> <parameter>

Normal Method example:-
-----------------------
static method.
--------------
public static void test(int x){
	
}

* The return type here is void.

Instance Method
----------------
public void test1(int x){
	
}

* The return type here is void.

In this example modifername,static,and Method parameter are removed as its optional
------------------------------------------------------------------------------------
void test2(){
	
}

* The return type here is void.
------------------------------------------------------------------------------------
1)The return type is applicable for methods(Instance/Static)
2)The return type of the method and type of data returned at the end of the method should be of the same type
or its child.
3)The variable that stores the returned value after the method is called should be a similar data type otherwise,
the data might get lost.
4)We can return lower datatypes to higher return Datatypes.
  This is called Narrowing.
------------------------------------------------------------------------------------
Please refer the Diagram for the reference and Explanation.
