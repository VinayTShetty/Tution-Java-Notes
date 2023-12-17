Java Command Line Arguments
***************************

The java command-line argument is an argument i.e. passed at the time of running the java program.
The arguments passed from the console can be received in the java program and it can be used as an input.


Example 1:-
***********

class  Test
{
	public static void main(String[] args) 
	{
		System.out.println("Your first argument is: "+args[0]);  	
	}
}

D:\JavaCode>javac Test.java

D:\JavaCode>java Test 0
Your first argument is: 0

Example 2:-
**********
class  Test
{
	public static void main(String[] args) 
	{
		for(int i=0;i<args.length;i++) {  

		System.out.println(args[i]);  
		
		}    	
	}
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Test 1 2 3 4 5 6 7
1
2
3
4
5
6
7

D:\JavaCode>