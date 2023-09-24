String in java

They are around 4 class es for String in java.

1) Java.lang.String
2) Java.lang.StringBuffer
3) Java.lang.StringBuilder
4) Java.util.StringTokenizer



Java.lang.String / String
*************************
String is used to represent group of characters or character array enclosed with in the double quotes.

We are able to create String object in two ways.

1) Without using new operator String str="Vinay";
2) By using new operator String str = new String("Vinay");

class Test {
	public static void main(String[] args) {
		String str = "Vinay";
		System.out.println(str);
		String str1 = new String("Vinay");
		System.out.println(str1);
	}
}



D:\JavaCode>javac Test.java

D:\JavaCode>java Test
Vinay
Vinay


*************************************************************************************************
== operator :-

1) It is comparing reference type and it returns Boolean value as a return value.
2) If two reference variables are pointing to same object then it returns true otherwise false.

class Test {
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = t1;
		System.out.println(t1 == t2); // false
		System.out.println(t1 == t3); // true
		String str1 = "Vinay";
		String str2 = "Vinay";
		System.out.println(str1 == str2); // true
		String s1 = new String("Shetty");
		String s2 = new String("Shetty");
		System.out.println(s1 == s2); // false
		StringBuffer sb1 = new StringBuffer("Certisured");
		StringBuffer sb2 = new StringBuffer("Certisured");
		System.out.println(sb1 == sb2); // flase
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test
false
true
true
false
false
**********************************************************************************************