Example 1

In this example a programmer can easily access the Bank instance variables and change the value/properties.

class Bank
{
	int balance=100;
	int Fd_amount=200;
}


class Hacker
{
	public static void main(String [] args){
		Bank bank=new Bank();
		bank.balance=100000;
		System.out.println("The balance= "+bank.balance);
	}
}


D:\JavaCode>javac Test.java

D:\JavaCode>java Hacker
The balance= 100000

-------------------------------------------------------------------------------------------------------
Example 2

class Bank
{
	private int balance=100;
	private int Fd_amount=200;
}


class Hacker
{
	public static void main(String [] args){
		Bank bank=new Bank();
		bank.balance=100000;
		System.out.println("The balance= "+bank.balance);
	}
}



D:\JavaCode>javac Test.java
Test.java:12: error: balance has private access in Bank
                bank.balance=100000;
                    ^
Test.java:13: error: balance has private access in Bank
                System.out.println("The balance= "+bank.balance);
                                                       ^
2 errors
-------------------------------------------------------------------------------------------------------
class Bank
{
	private int balance=100;
	private int fd_amount=200;

	public void setbalance(int accountNumber,int depositAmout){
		//Account Number validation is done in backend
		this.balance=depositAmout;
	}

	public int getBalance(){
		return this.balance;
	}

	public void setfd_amount(int fd_depositAmout){
		//Account Number validation is done in backend
		this.fd_amount=fd_depositAmout;
	}

	public int getfd_amount(){
		return this.fd_amount;
	}

}


class Hacker
{
	public static void main(String [] args){
		Bank bank=new Bank();
		bank.setbalance(123456789,100);
		System.out.println("The balance= "+bank.getBalance());

		bank.setfd_amount(999);
		System.out.println("The fd_balance= "+bank.getfd_amount());


	}
}



D:\JavaCode>javac Test.java

D:\JavaCode>java Hacker
The balance= 100
The fd_balance= 999
-------------------------------------------------------------------------------------------------------
