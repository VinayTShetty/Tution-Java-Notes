Switch statement:-
******************
Switch statement:-
Switch statement is used to declare multiple selections.
Inside the switch It is possible to declare any number of cases but one default case.
Switch is taking the argument, the allowed arguments are
Byte, Short,Int,Char,enum(1.5 version),String(1.7 version).
Float and double and long is not allowed for a switch argument because these are having more number of possibilities (float and double is having infinity number of possibilities).
Based on the provided argument the matched

Syntax:-
********
switch(argument)
{
case label1 : 
	statements;
	break;
case label2 :
	statements;
	break;
default : statements;
break;
}



Example 1:- Normal Statement.

class Test {
	public static void main(String[] args) {
		int a = 10;
		switch (a) {
		case 10:
			System.out.println("anushka");
			break;
		case 20:
			System.out.println("nazriya");
			break;
		case 30:
			System.out.println("samantha");
			break;
		default:
			System.out.println("ubanu");
			break;
		}
	}
}
*******************************************************************************************************
Example  2 :-Inside the switch the case labels must be unique; if we are declaring duplicate case labels the compiler will raise compilation error “duplicate case label”.

class Test {
	public static void main(String[] args) {
		int a = 10;
		switch (a) {
		case 10:
			System.out.println("anushka");
			break;
		case 10:
			System.out.println("nazriya");
			break;
		default:
			System.out.println("ubanu");
			break;
		}
	}
}
D:\JavaCode>javac Test.java
Test.java:8: error: duplicate case label
                case 10:
                ^
1 error

*******************************************************************************************************
Example  3:-Inside the switch for the case labels it is possible to provide expressions (10+10+20 , 10*4 , 10/2).

class Test {
	public static void main(String[] args) {
		int a = 100;
		switch (a) {
		case 10 + 20 + 70:
			System.out.println("anushka");
			break;
		case 10 + 5:
			System.out.println("nazriya");
			break;
		case 30 / 6:
			System.out.println("samantha");
			break;
		default:
			System.out.println("ubanu");
			break;
		}
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
anushka

*******************************************************************************************************
Example 4 :- Inside the switch the case label must be constant values. 
			If we are declaring variables as a case labels the compiler will show compilation error “constant expression required”.

class Test {
	public static void main(String[] args) {
		int a = 10, b = 20;
		switch (a) {
		case a:
			System.out.println("anushka");
			break;
		case b:
			System.out.println("nazriya");
			break;
		default:
			System.out.println("ubanu");
			break;
		}
	}
}


D:\JavaCode>javac Test.java
Test.java:5: error: constant expression required
                case a:
                     ^
Test.java:8: error: constant expression required
                case b:
                     ^
2 errors

*******************************************************************************************************
Example 5 :-inside the switch the default is optional

class Test {
	public static void main(String[] args) {
		int a = 10;
		switch (a) {
		case 10:
			System.out.println("10");
			break;
		}
	}
}

// 10
*******************************************************************************************************
Example 6 :-

class Test {
	public static void main(String[] args) {
		int a = 10;
		switch (a) {
		default:
			System.out.println("default");
			break;
		}
	}
}

// default

*******************************************************************************************************
Example 7 :- inside the switch both cases and default Is optional.

public class Test {
	public static void main(String[] args) {
		int a = 10;
		switch (a) {
		}
	}
}

*******************************************************************************************************
Example 8 :- inside the switch independent statements are not allowed. If we are declaring the statements 
			that statement must be inside the case or default.
public class Test {
	public static void main(String[] args){
		int x=10;
		switch(x){
		System.out.println("Hello World");
		}
		}
	}

	
D:\JavaCode>javac Test.java
Test.java:5: error: case, default, or '}' expected
                System.out.println("Hello World");
                ^
Test.java:5: error: case, default, or '}' expected
                System.out.println("Hello World");
                      ^
Test.java:5: error: case, default, or '}' expected
                System.out.println("Hello World");
                       ^
Test.java:5: error: case, default, or '}' expected
                System.out.println("Hello World");
                          ^
Test.java:5: error: case, default, or '}' expected
                System.out.println("Hello World");
                           ^
Test.java:5: error: case, default, or '}' expected
                System.out.println("Hello World");
                                  ^
Test.java:5: error: case, default, or '}' expected
                System.out.println("Hello World");
                                   ^
Test.java:5: error: case, default, or '}' expected
                System.out.println("Hello World");
                                                ^
Test.java:5: error: case, default, or '}' expected
                System.out.println("Hello World");
                                                 ^
9 errors

D:\JavaCode>

*******************************************************************************************************
Example 9 :- internal conversion of char to integer. Unicode values a-97 A-65

class Test {
	public static void main(String[] args) {
		int a = 65;
		switch (a) {
		case 66:
			System.out.println("10");
			break;
		case 'A':
			System.out.println("20");
			break;
		case 30:
			System.out.println("30");
			break;
		default:
			System.out.println("default");
			break;
		}
	}
}

// 20

Hint:-  Captial value of A = 65.
https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
*******************************************************************************************************
Example 10 :- internal conversion of integer to character.

class Test {
	public static void main(String[] args) {
		char ch = 'd';
		switch (ch) {
		case 100:
			System.out.println("10");
			break;
		case 'A':
			System.out.println("20");
			break;
		case 30:
			System.out.println("30");
			break;
		default:
			System.out.println("default");
			break;
		}
	}
}

// 10 will be printed.
Hint:- As the integer value of 'd'=100
*******************************************************************************************************
Example  :-
	Inside the switch statement beak is optional.
	If we are not providing break statement then from the matched case onwards up to break statement will be executed, if there is no break statement then end of the switch will be executed. 
	This situation is called as fall though inside the switch case.

	class Test {
	public static void main(String[] args) {
		int a = 10;
		switch (a) {
		case 10:
			System.out.println("10");
		case 20:
			System.out.println("20");
		case 40:
			System.out.println("40");
			break;
		default:
			System.out.println("default");
			break;
		}
	}
}

// 10
  20
  40
*******************************************************************************************************
Example  :-

Inside the switch the case label must match with provided argument data type otherwise compiler will raise 
compilation error “incompatible types”.

class Test {
	public static void main(String[] args){
		char ch='a';
       switch (ch){
		   case "aaa" :System.out.println("samantha"); break;
           case 65 :System.out.println("anu"); break;
           case 'a' :System.out.println("ubanu"); break;
           default :System.out.println("default"); break;
		   }
		 }
}

D:\JavaCode>javac Test.java
Test.java:5: error: incompatible types: String cannot be converted to char
                   case "aaa" :System.out.println("samantha"); break;
                        ^
1 error

Hint:- Different data types provided will give error.

*******************************************************************************************************
Example  :- Inside the switch we are able to declare the default statement at starting or middle or end of the switch.

class Test {
	public static void main(String[] args) {
		int a = 100;
		switch (a) {
		default:
			System.out.println("default");
		case 10:
			System.out.println("10");
		case 20:
			System.out.println("20");
		}
	}
}

o/p:-
default
10
20

*******************************************************************************************************
Example  :-
*******************************************************************************************************
Example  :-
*******************************************************************************************************
Example  :-
*******************************************************************************************************
Example  :-
*******************************************************************************************************
Example  :-
*******************************************************************************************************
Example  :-
*******************************************************************************************************
Example  :-
*******************************************************************************************************
Example  :-
*******************************************************************************************************
Example  :-
*******************************************************************************************************
Example  :-
*******************************************************************************************************
Example  :-
*******************************************************************************************************
Example  :-
*******************************************************************************************************