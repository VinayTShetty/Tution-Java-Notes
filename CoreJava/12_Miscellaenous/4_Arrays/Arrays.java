Arrays
*****
1)Arrays are used to represent group of elements as a single entity but these elements are homogeneous & fixed size.
	Homogeneous means :- Same Type.

2)The size of Array is fixed it means once we created Array it is not possible to increase and decrease the size.

3)Array in java is index based first element of the array stored at 0 index.


Advantages of array:-
*********************

Instead of declaring individual variables we can declare group of elements by using array it reduces length of the code.

We can store the group of objects easily & we are able to retrieve the data easily.

We can access the random elements present in the any location based on index.

Array is able to hold reference variables of other types.
 We can create Array for primitive type and reference type.


Decalaration and intialization of Array s in Different ways.
************************************************************
Syntax
******
1) data type[] arrName;
2) datatype arrName[];
3) datatype [] arrName;


*************************************************************************************************************
Example:-1

class Test {
	public static void main(String[] args) {
		/**
		 * Declaration of the Array elements. It will take the size,Based on the declararion of elements
		 */
		int[] x = { 10, 20, 30, 40 };
		/**
		 * Declaration of the Array. Here size is mentioned. Syntax 1
		 */
		int[] y = new int[5];
		y[0] = 11;
		y[1] = 84;
		y[2] = 55;
		y[3] = 78;
		y[4] = 45;
		/**
		 * Declaration of the Array. Here size is mentioned. Syntax 2
		 */
		int z[] = new int[5];
		z[0] = 100;
		z[1] = 200;
		z[2] = 300;
		z[3] = 400;
		z[4] = 500;
		/**
		 *  Syntax 3 Assignment.
		 */
		/**
		 * Looping through all elements in the array.
		 */
		
		for (int i = 0; i < x.length; i++) {
			  System.out.print(x[i]+",");
			}
		
		System.out.println();
		
		for (int i = 0; i < y.length; i++) {
			  System.out.print(y[i]+",");
			}
		
		System.out.println();
		

		for (int i = 0; i < z.length; i++) {
			  System.out.print(z[i]+",");
			}
	}
}

10,20,30,40,
11,84,55,78,45,
100,200,300,400,500,

*************************************************************************************************************
Example:-2 Creating array for reference types.

class Test{
	public static void main(String[] args) {
	
		Exam ta=new Exam();
		Exam tx=new Exam();
		Exam ty=new Exam();
		Exam tz=new Exam();
		Exam ts=new Exam();
		
		Exam e [] =new Exam[5];	
		e[0]=ta;
		e[1]=tx;
		e[2]=ty;
		e[3]=tz;
		e[4]=ts;
	
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
	}	
}


class Exam{
	
}

/**
 * Summary
 * 
 * 1)Create a reference Type array with Size.
 * 2)Fill the index of the array with the correposning/Homogenous elements.
 */

 Exam@3fee733d
Exam@5acf9800
Exam@4617c264
Exam@36baf30c
Exam@7a81197d

*************************************************************************************************************
Example:-3  Creating a array for reference types and printing values.

class Test{
	public static void main(String[] args) {
	
		Exam ta=new Exam(85);
		Exam tx=new Exam(35);
		Exam ty=new Exam(45);
		Exam tz=new Exam(30);
		Exam ts=new Exam(10);
		
		Exam e [] =new Exam[5];	
		e[0]=ta;
		e[1]=tx;
		e[2]=ty;
		e[3]=tz;
		e[4]=ts;
	
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].min_marks);
		}
	}	
}


class Exam{
	int min_marks=35;
	Exam(int Obtained_marks){
		this.min_marks=Obtained_marks;
	}
}

/**
 * Summary
 * 
 * 1)Create a reference Type array with Size.
 * 2)Fill the index of the array with the correposning/Homogenous elements.
 */

85
35
45
30
10

*************************************************************************************************************
Example:-4 Default values in Array is assigned by the JVM for primitive types and reference types.
Even for local variables.

class Test{
	public static void main(String[] args) {

	//Primitive Type
	int [] i=new int[10];
	System.out.println("int values= "+i[5]);

	//Reference Types
	Emp [] e=new Emp[4];
	System.out.println("Emp values= "+e[2]);
	}	
}



class Emp{
	
}

int values= 0
Emp values= null
*************************************************************************************************************
Example:-5 The maximum allowed array size in java is maximum value of int size [2147483647].

class Test {
	public static void main(String[] args) {
		byte b[] = new byte[2147483647];
	//	byte b1[] = new byte[2147483648];
		int z[] = new int[2147483647];
	//	int z1[] = new int[2147483648];
	}
}

Hint :- Compile Time error is not obtained.
we might get RE.

*************************************************************************************************************
Example:-6 MutliDimensional Array:-

class Test {
	public static void main(String[] args) {
		int [][] a=new int[2][3];
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		

		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
	}
}

[I@2c7b84de
[I@3fee733d
0
0
0
0
0
0
*************************************************************************************************************
Example:-7 we cannot give negative size in the array.

class Test {
	public static void main(String[] args) {
		int[] a=new int[-3];//
	}
}

Hint :- No Error , But we will get Exception.
Assignment :- Check which Exception.And Handle it.
*************************************************************************************************************
Example:-4
*************************************************************************************************************
Example:-4
*************************************************************************************************************