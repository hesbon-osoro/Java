package prince;

import java.util.Scanner;

public class Account1 {
public static float a,b=100;
static void Withdraw() {
	System.out.println("Enter the amount you wish to withdraw");
	Scanner cash1=new Scanner(System.in);
	float amount1=cash1.nextInt();
	if(amount1>b) {
		System.out.println("Sorry, you have insufficient funds");
		System.out.println("Do you wish to continue (Y/N)...");
		Scanner cont=new Scanner(System.in);
		char sCont=cont.next().charAt(0);
		switch (sCont) {
		case 'Y':
			Savings();
		case 'y':
			Savings();
		}
	}
	else if(amount1<0) {
		System.out.println("Sorry, You cannot withdraw amount less than zero");
		System.out.println("Do you wish to continue (Y/N)...");
		Scanner cont=new Scanner(System.in);
		char sCont=cont.next().charAt(0);
		switch (sCont) {
		case 'Y':
			Savings();
		case 'y':
			Savings();
		}
	}
	else {
		System.out.printf("%.2f",amount1);
		System.out.println(" has been withrawn from your account");
		b=b-amount1;
		System.out.println("Your new account balance is "+b);
		System.out.println("Do you wish to continue (Y/N)...");
		Scanner cont=new Scanner(System.in);
		char sCont=cont.next().charAt(0);
		switch (sCont) {
		case 'Y':
			Savings();
		case 'y':
			Savings();
		}
	}
}
static void Balance() {
	System.out.printf("Your current balance is %.2f",b);
	System.out.println("\nDo you wish to continue (Y/N)...");
	Scanner cont=new Scanner(System.in);
	char sCont=cont.next().charAt(0);
	switch (sCont) {
	case 'Y':
		Savings();
	case 'y':
		Savings();
	}
}


static void Deposit() {
	System.out.println("Enter the amount you wish to deposit");
	Scanner cash=new Scanner(System.in);
	a=cash.nextInt();
	b=b+a;
	if(a<=0) {
		System.out.println("Invalid amount. Amount cannot be less than 0");
		System.out.println("Do you wish to continue (Y/N)...");
		Scanner cont=new Scanner(System.in);
		char sCont=cont.next().charAt(0);
		switch (sCont) {
		case 'Y':
			Savings();
		case 'y':
			Savings();
		}
	}
	else {
		System.out.printf("Sucess!%.2f",a);
		System.out.print(" has been credited into your account");
		System.out.printf("\nYour new account balance is %.2f\n",b);
		System.out.println("Do you wish to continue (Y/N)...");
		Scanner cont=new Scanner(System.in);
		char sCont=cont.next().charAt(0);
		switch (sCont) {
		case 'Y':
			Savings();
		case 'y':
			Savings();
		}
	}
}


static void Savings() {
		System.out.println("******************************************************\n\tWELCOME TO SAVINGS ACCOUNT\n******************************************************");
		System.out.println("Select an Option from the list");
		System.out.println("1. Deposit\n2. Check Balance\n3. Withdraw\n4. PayBill\n5. Close");
		Scanner select1=new Scanner(System.in);
		int s1=select1.nextInt();
		switch (s1) {
		case 1:
			Deposit();
		break;
		case 2:
			Balance();
		break;
		case 3:
			Withdraw();
		}
		
	}

void print() {
	System.out.println("*********************************************************\n\t\tABC BANK ATM\n*********************************************************\n\t\tACCOUNTS MENU\n\t_______________________________");
	System.out.println("1. Savings Account\n2. Fixed Accounts\n\nSelect the Account to Open");
	Scanner select=new Scanner(System.in);
	int s=select.nextInt();
	switch(s) {
	case 1: 
		Savings();
	}
	
		
}

	public static void main(String[] args) {
		//float b,a;
		//b=b+a;
		Account1 acc=new Account1();
		acc.print();
		// TODO Auto-generated method stub

	}

}
