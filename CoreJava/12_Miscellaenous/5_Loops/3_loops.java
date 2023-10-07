Iteration Statements:-

By using iteration statements we are able to execute group of statements repeatedly or more number of times.

1) For 2) while 3) do-while



Example 1

Without using Loop.
******************
Example 1:-without using loop.

class Test {
	public static void main(String[] args) {
		System.out.println("ratan");
		System.out.println("ratan");
		System.out.println("ratan");
		System.out.println("ratan");
		System.out.println("ratan");
	}
}

Example 2:- With using loop.

class Test {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Ratan");
		}
	}
}


Do-While Loop.
*************
Do-While:-
If we want to execute the loop body at least one time them we should go for do-while statement.
In do-while first body will be executed then only condition will be checked.
In the do-while the while must be ends with semicolon otherwise compilation error.

Syntax:- 
do
 { //body of loop

} while (condition);


