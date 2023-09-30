Pre-increment & post increment :-

Pre-increment :- it increases the value by 1 then it will execute statement.
Post-increment :-it executes the statement then it will increase value by 1.


class Test {
	public static void main(String[] args) { // post increment
		int a = 10;
		System.out.println(a); // 10
		System.out.println(a++); // 10
		System.out.println(a); // 11
//pre increment
		int b = 20;
		System.out.println(b); // 20
		System.out.println(++b); // 21
		System.out.println(b); // 21

//11 13 13 15
	}
}

10
10
11
20
21
21

**********************************************************************************************************
Pre-decrement :- it decreases the value by 1 then it will execute statement.
Post-decrement :-it executes the statement then it will increase value by 1.


class Test {
	public static void main(String[] args) {
		
		// post decrement
		int a = 10;
		System.out.println(a); // 10
		System.out.println(a--); // 10
		System.out.println(a); // 9
		
       //pre decrement
		int b = 20;
		System.out.println(b); // 20
		System.out.println(--b); // 19
		System.out.println(b); // 19
	}
}

10
10
9
20
19
19
***************************************************************************************************