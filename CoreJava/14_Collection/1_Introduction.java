Importance of collections:-

The main objective of collections framework is to represent group of object as a single entity.
In java Collection framework provide very good architecture to store and manipulate the group of objects.
Collection API contains group of classes and interfaces that makes it easier to handle group of objects.
Collections are providing flexibility to store, retrieve, and manipulate data.

All collection framework classes and interfaces are present in java.util package.
The root interface of Collection framework is Collection.


ArrayList Characteristics:-

1) ArrayList Introduced in 1.2 version.
2) ArrayList stores Heterogeneous objects(different types).
3) In ArrayList it is possible to insert Null objects.
4) Duplicate objects are allowed.
5) ArrayList preserved Insertion order it means whatever the order we inserted the data in the same way output will be printed.
6) ArrayList methods are non-synchronized methods.
7) The under laying data structure is growable array.
8) By using cursor we are able to retrieve the data from ArrayList : Iterator , ListIterator


****************************************************************************************************
Example :- 1  ArrayList example 
************

import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        // Creating an ArrayList without specifying the type (raw type)
        ArrayList arrayList = new ArrayList();

        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Mango");
        arrayList.add(2);

        // Accessing elements using for loop
        System.out.println("Elements in the ArrayList:");
       for (int i = 0; i < arrayList.size(); i++) {
    	   System.out.println(arrayList.get(i));
	}

        // Adding an element at a specific index
        arrayList.add(2, "Grapes");

        // Updating an element at a specific index
        arrayList.set(1, "Cherry");

        // Removing an element by value
        arrayList.remove("Mango");

        // Removing an element by index
        arrayList.remove(0);

        // Checking if an element is present
        if (arrayList.contains("Banana")) {
            System.out.println("Banana is in the list.");
        } else {
            System.out.println("Banana is not in the list.");
        }

        // Getting the size of the ArrayList
        int size = arrayList.size();
        System.out.println("Size of the ArrayList: " + size);

        // Clearing all elements from the ArrayList
        arrayList.clear();

        // Checking if the ArrayList is empty
        if (arrayList.isEmpty()) {
            System.out.println("ArrayList is empty.");
        } else {
            System.out.println("ArrayList is not empty.");
        }
    }
}

********************************************************************************************************
Example :- ArrayList providing Type safety using Generic concept.
**********
We can provide any reference Type for the TypeSafety.This concept is called Generic.

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Mango");
        arrayList.add(2);

        // Accessing elements using for loop
        System.out.println("Elements in the ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Adding an element at a specific index
        arrayList.add(2, "Grapes");

        // Updating an element at a specific index
        arrayList.set(1, "Cherry");

        // Removing an element by value
        arrayList.remove("Mango");

        // Removing an element by index
        arrayList.remove(0);

        // Checking if an element is present
        if (arrayList.contains("Banana")) {
            System.out.println("Banana is in the list.");
        } else {
            System.out.println("Banana is not in the list.");
        }

        // Getting the size of the ArrayList
        int size = arrayList.size();
        System.out.println("Size of the ArrayList: " + size);

        // Clearing all elements from the ArrayList
        arrayList.clear();

        // Checking if the ArrayList is empty
        if (arrayList.isEmpty()) {
            System.out.println("ArrayList is empty.");
        } else {
            System.out.println("ArrayList is not empty.");
        }
    }
}


********************************************************************************************************
Example :-   Providing Type safety using Generic concept.
**********  For userDefined class.

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Parent> arrayList = new ArrayList<Parent>();
       
        Parent p=new Parent();
        arrayList.add(p);
        arrayList.add(new Parent());
        arrayList.add(new Parent());
        arrayList.add(new Child());
        
        for (int i = 0; i < arrayList.size(); i++) {
     	   System.out.println(arrayList.get(i).x);
 	}
    }
}

class Parent{
	int x=10;
}

class Child{
	
}
********************************************************************************************************
Example  Looping through Collection using iterator vs listIterator.
*******

import java.util.*;

class Test {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("ratan");
		al.add("anu");
		al.add("sravya");
//1st appraoch to print Collection data
		for (String a : al) {
			System.out.println(a);
		}
//2nd approach to print Collection data
		int size = al.size();
		for (int i = 0; i < size; i++) {
			System.out.println(al.get(i));
		}
//3rd approach to print Collection data
//normal version of Iterator(type casting required at the time of retrieving)
		Iterator itr1 = al.iterator();
		while (itr1.hasNext()) {
			String str = (String) itr1.next();
			System.out.println(str);
		}
//generic version of Iterator(type casting not required at the time of retrieving)
		Iterator<String> itr2 = al.iterator();
		while (itr2.hasNext()) {
			String str = itr2.next();
			System.out.println(str);
		}
	}
}

********************************************************************************************************
Example :-
Since a Set does not allow duplicates, adding a duplicate element (e.g., "Apple" again) will not have any effect.
We use a for-each loop to iterate over the elements of the set.
We remove an element ("Orange") from the set.
We check if an element ("Banana") is present in the set using the contains method.
We get the size of the set using the size method.
We clear all elements from the set using the clear method.
Finally, we check if the set is empty using the isEmpty method


import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> stringSet = new HashSet<>();

        // Adding elements to the set
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Orange");
        stringSet.add("Mango");

        // Adding a duplicate element (will not be added)
        stringSet.add("Apple");

        // Displaying elements in the set
        System.out.println("Elements in the Set:");
        for (String fruit : stringSet) {
            System.out.println(fruit);
        }

        // Removing an element from the set
        stringSet.remove("Orange");

        // Checking if an element is present in the set
        if (stringSet.contains("Banana")) {
            System.out.println("Banana is in the set.");
        } else {
            System.out.println("Banana is not in the set.");
        }

        // Getting the size of the set
        int size = stringSet.size();
        System.out.println("Size of the Set: " + size);

        // Clearing all elements from the set
        stringSet.clear();

        // Checking if the set is empty
        if (stringSet.isEmpty()) {
            System.out.println("Set is empty.");
        } else {
            System.out.println("Set is not empty.");
        }
    }
}


********************************************************************************************************
Example :- Map example in java.
********

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> studentScores = new HashMap<>();

        // Adding key-value pairs to the map
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 90);
        studentScores.put("Charlie", 78);
        studentScores.put("David", 92);

        // Accessing values using keys
        System.out.println("Bob's score: " + studentScores.get("Bob"));

        // Displaying all key-value pairs in the map
        System.out.println("Student Scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Checking if a key is present in the map
        String studentName = "Charlie";
        if (studentScores.containsKey(studentName)) {
            System.out.println(studentName + "'s score is present.");
        } else {
            System.out.println(studentName + "'s score is not present.");
        }

        // Checking if a value is present in the map
        int scoreToFind = 78;
        if (studentScores.containsValue(scoreToFind)) {
            System.out.println("A student scored " + scoreToFind);
        } else {
            System.out.println("No student scored " + scoreToFind);
        }

        // Removing a key-value pair from the map
        String studentToRemove = "Alice";
        studentScores.remove(studentToRemove);
        System.out.println(studentToRemove + "'s score removed.");

        // Getting the size of the map
        int size = studentScores.size();
        System.out.println("Size of the map: " + size);

        // Clearing all key-value pairs from the map
        studentScores.clear();
        System.out.println("Map cleared.");

        // Checking if the map is empty
        if (studentScores.isEmpty()) {
            System.out.println("Map is empty.");
        } else {
            System.out.println("Map is not empty.");
        }
    }
}


Key-value pairs are added to the map using the put method.
We access values using keys with the get method.
The entrySet method is used to iterate over all key-value pairs in the map.
The containsKey and containsValue methods check if a specific key or value is present in the map.
We remove a key-value pair using the remove method.
The size method gives the number of key-value pairs in the map.
The clear method removes all key-value pairs from the map.
The isEmpty method checks if the map is empty.
********************************************************************************************************

