Enum
****
1. This concept is introduced in 1.5 version

2. enumeration is used to declare group of named constant s.

3. we are declaring the enum by using enum keyword.
	For the enums the compiler will generate .classess

4. enum is a keyword and Enum is a class and every enum is directl child class of java.lang.Enum,
	That is it will implicitly extends Enum class.
	so it is not possible to inherit the some other class. 
	Hence for the enum inheritance concept is not applicable

5. By default enum constants are public static final


when we should go for Enum Concept.
***********************************

1) Representing a Finite Set of Constants:

Enums are ideal for situations where you have a predefined set of constant values that a variable can take. For example, days of the week, months, colors, or card suits can be represented using enums
Example:- 

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

2) Improved Code Readability:
	Enums can make your code more readable and self-documenting.
	Instead of using arbitrary integer or string constants, 
	you can use descriptive enum values, which makes your code more understandable

3) Switch Statements:
	Enums work well with switch statements, making it easy to perform different actions based on the enum value. 
	This can lead to more structured and maintainable code



Points to Remember on Enum
**************************
1. inside the enum it is possible to declare constructors. 
	That constructors will be ececuted for each and every constant. 
	If we are declaring 5 constants then 5 times constructor will be executed.

2. Inside the enum if we are declaring only constants the semicolon is optional.

3. Inside the enum if we are declaring group of constants and constructors at that situation the group of constants 
	must be first line of the enum must ends with semicolon.

4. Enum class es cannot be extended from other class.
   Bcoz its by default extended from Predefiend class Enum(java.lang.Enum)

5. By default enum constants are public static final

6.	The values() method is a method that is automatically generated by the Java compiler for all enum types. 
	It returns an array containing all the enum constants (values) defined within that enum type. This method allows you to easily access and iterate through all the possible values of an enum without having to manually define an array of enum constants yourself.

7. inside the enums it is possible to declare group of constants and constructors and main method

Assignment for Point 7:-

Create a enum class.
add constants for the Enum class.
Create a constructor for the enum class.
Create a main method for the enum class and execute

****************************************************************************************************************
Example 1:- Inside the enum if we are declaring only constants the semicolon is optional.

public class Test {
    public static void main(String[] args) {
    Days d=Days.MONDAY;
    System.out.println(d);
      
    }
    enum Days {
    	MONDAY,TUESDAY,WEDNESDAY,THURSDAY 
    }

}

MONDAY
****************************************************************************************************************
Example 2:-
   The values() method is a method that is automatically generated by the Java compiler for all enum types.
   It returns an array containing all the enum constants (values) defined within that enum type. This method allows you to easily access and iterate through all the possible values of an enum without having to manually define an array of enum constants yourself.

public class Test {
    public static void main(String[] args) {
    Days [] days=Days.values();
    
	  for (Days mydays:days){
		System.out.println(mydays);
		}

    }

    enum Days {
    	MONDAY,TUESDAY,WEDNESDAY,THURSDAY 
	}

}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test
MONDAY
TUESDAY
WEDNESDAY
THURSDAY
****************************************************************************************************************
Example 3:-
    Inside the enum it is possible to declare constructors. 
	That constructors will be ececuted for each and every constant. 
	If we are declaring 5 constants then 5 times constructor will be executed.

enum Days {
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY;

	Days() {
		System.out.println("Days Constructor");
	}
}

class Test {
	public static void main(String... ratan) {
		Days d = Days.MONDAY;
		System.out.println(d);
	}
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Days Constructor
Days Constructor
Days Constructor
Days Constructor
MONDAY

D:\JavaCode>

****************************************************************************************************************
Example 4:- 
	Inside the enum if we are declaring group of constants and constructors at that situation the group of constants 
	must be first line of the enum must ends with semicolon.

enum Days {


	Days() {
		System.out.println("Days Constructor");
	}
	
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY;
}

class Test {
	public static void main(String... ratan) {
		Days d = Days.MONDAY;
		System.out.println(d);
	}
}

D:\JavaCode>javac Test.java
Test.java:5: error: <identifier> expected
                System.out.println("Days Constructor");
                                  ^
Test.java:5: error: illegal start of type
                System.out.println("Days Constructor");
                                   ^
Test.java:6: error: ',', '}', or ';' expected
        }
         ^
3 errors


****************************************************************************************************************
Example 5:- 

By default enum constants are public static final

enum Days {
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY;
}

class Test {
	public static void main(String... ratan) {
		Days d = Days.MONDAY=100;
		System.out.println(d);
	}
}


D:\JavaCode>javac Test.java
Test.java:7: error: cannot assign a value to final variable MONDAY
                Days d = Days.MONDAY=100;
                             ^
Test.java:7: error: incompatible types: int cannot be converted to Days
                Days d = Days.MONDAY=100;
                                     ^
2 errors

****************************************************************************************************************
Example 6:-
Enum with switch statements

public class Test {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;

        switch (today) {
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday!");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday!");
                break;
            case THURSDAY:
                System.out.println("It's Thursday!");
                break;
            case FRIDAY:
                System.out.println("It's Friday!");
                break;
            case SATURDAY:
                System.out.println("It's Saturday!");
                break;
            case SUNDAY:
                System.out.println("It's Sunday!");
                break;
            default:
                System.out.println("Unknown day!");
        }
    }
}



D:\JavaCode>javac Test.java

D:\JavaCode>java Test
It's Wednesday!


****************************************************************************************************************
Example 1:- 
****************************************************************************************************************
Example 1:- 
****************************************************************************************************************
Example 1:- 
****************************************************************************************************************
Example 1:- 
****************************************************************************************************************
Example 1:- 
****************************************************************************************************************
Example 1:- 
****************************************************************************************************************
Example 1:- 
****************************************************************************************************************