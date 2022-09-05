package prince;

import java.util.Scanner;

public class Account {
public static int myAccNumber;
public static float a,b=1000,Fa,Fb=500, target;
public static String myName;

static void FPaybill() {
	System.out.println("Enter the Business Number");
	Scanner business = new Scanner(System.in);
	int numF=business.nextInt();
	System.out.println("Enter the Account Number");
	Scanner accnumF=new Scanner(System.in);
	String accnum1F=accnumF.next();
	System.out.println("Enter the amount");
	Scanner cash2F=new Scanner(System.in);
	float myCashF=cash2F.nextInt();
	if(target<=Fb) {
		System.out.println("Sorry, you have not reached your target\nKindly, deposit more to reach your target so as to be able to continue with this operation");
		System.out.println("\nDo you wish to continue (Y/N)...");
		Scanner contF=new Scanner(System.in);
		char sContF=contF.next().charAt(0);
		switch (sContF) {
		case 'Y':	Fixed();
		case 'y':	Fixed();
		case 'n':	close();
		case 'N':	close();
		default:	close();
		}
	}
	else if(myCashF<0) {
		System.out.println("Sorry, you cannot transfer amount less than zero");
		System.out.println("\nDo you wish to continue (Y/N)...");
		Scanner contF=new Scanner(System.in);
		char sContF=contF.next().charAt(0);
		switch (sContF) {
		case 'Y':	Fixed();
		case 'y':	Fixed();
		case 'n':	close();
		case 'N':	close();
		default:	close();
		}
	}
	else
	{
		System.out.println("Success! "+myCashF+" has been transfered to Business Number "+numF+" and account number "+accnum1F);
		Fb=Fb-myCashF;
		System.out.println("Your new account balance is "+Fb);
		System.out.println("\nDo you wish to continue (Y/N)...");
		Scanner contF=new Scanner(System.in);
		char sContF=contF.next().charAt(0);
		switch (sContF) {
		case 'Y':	Fixed();
		case 'y':	Fixed();
		case 'n':	close();
		case 'N':	close();
		default:	close();
		}
	}
}
static void FWithdraw() {
	System.out.println("Enter the amount you wish to withdraw");
	Scanner cash1F=new Scanner(System.in);
	float amount1F=cash1F.nextInt();
	if(amount1F<0) {
		System.out.println("Sorry, You cannot withdraw amount less than zero");
		System.out.println("Do you wish to continue (Y/N)...");
		Scanner contF=new Scanner(System.in);
		char sContF=contF.next().charAt(0);
		switch (sContF) {
		case 'Y':	Fixed();
		case 'y':	Fixed();
		case 'n':	close();
		case 'N':	close();
		default:	close();
		}
	}
	else if(Fb<=target){
		System.out.println("Sorry, you have not reached your target savings yet.\nKindly, deposit more to reach your target so as to be able to continue with this operation");
		System.out.println("Do you wish to continue (Y/N)...");
		Scanner contF=new Scanner(System.in);
		char sContF=contF.next().charAt(0);
		switch (sContF) {
		case 'Y':	Fixed();
		case 'y':	Fixed();
		case 'n':	close();
		case 'N':	close();
		default:	close();	
		}
	}
	else {
		System.out.printf("%.2f",amount1F);
		System.out.println(" has been withrawn from your account");
		Fb=Fb-amount1F;
		System.out.println("Your new account balance is "+Fb);
		System.out.println("Do you wish to continue (Y/N)...");
		Scanner contF=new Scanner(System.in);
		char sContF=contF.next().charAt(0);
		switch (sContF) {
		case 'Y':	Fixed();
		case 'y':	Fixed();
		case 'n':	close();
		case 'N':	close();
		default:	close();
		}
	}
}
static void FBalance() {
	System.out.printf("Your current balance is %.2f",Fb);
	System.out.println("\nDo you wish to continue (Y/N)...");
	Scanner contF=new Scanner(System.in);
	char sContF=contF.next().charAt(0);
	switch (sContF) {
	case 'Y':	Fixed();
	case 'y':	Fixed();
	case 'n':	close();
	case 'N':	close();
	default:	close();
	}
}
static void FDeposit() {
	System.out.println("Enter the amount you wish to deposit");
	Scanner cashF=new Scanner(System.in);
	Fa=cashF.nextInt();
	Fb=Fb+Fa;
	if(Fa<=0) {
		System.out.println("Invalid amount. Amount cannot be less than 0");
		System.out.println("Do you wish to continue (Y/N)...");
		Scanner contF=new Scanner(System.in);
		char sContF=contF.next().charAt(0);
		switch (sContF) {
		case 'Y':	Fixed();
		case 'y':	Fixed();
		case 'n':	close();
		case 'N':	close();
		default:	close();
		}
	}
	else {
		System.out.printf("Sucess!%.2f",Fa);
		System.out.print(" has been credited into your account");
		System.out.printf("\nYour new account balance is %.2f\n",Fb);
		System.out.println("Do you wish to continue (Y/N)...");
		Scanner contF=new Scanner(System.in);
		char sContF=contF.next().charAt(0);
		switch (sContF) {
		case 'Y':	Fixed();
		case 'y':	Fixed();
		case 'n':	close();
		case 'N':	close();
		default:	close();
		}
	}
}
static void close() {
	System.out.println("Do you wish to Exit the System (Y/N)...");
	Scanner confirm=new Scanner(System.in);
	char iconfirm=confirm.next().charAt(0);
	switch (iconfirm) {
	case 'Y':
		System.out.println("System will now exit....");
		Runtime.getRuntime().exit(0);
	case 'y':
		System.out.println("System will now exit....");
		Runtime.getRuntime().exit(0);
	case 'n':	print();
	case 'N':	print();
	}
}
static void Paybill() {
	System.out.println("Enter the Business Number");
	Scanner business = new Scanner(System.in);
	int num=business.nextInt();
	System.out.println("Enter the Account Number");
	Scanner accnum=new Scanner(System.in);
	String accnum1=accnum.next();
	System.out.println("Enter the amount");
	Scanner cash2=new Scanner(System.in);
	float myCash=cash2.nextInt();
	if(myCash>b) {
		System.out.println("Sorry, your account Balance is too low");
		System.out.println("\nDo you wish to continue (Y/N)...");
		Scanner cont=new Scanner(System.in);
		char sCont=cont.next().charAt(0);
		switch (sCont) {
		case 'Y':	Savings();
		case 'y':	Savings();
		case 'n':	close();
		case 'N':	close();
		default:	close();
		}
	}
	else if(myCash<0) {
		System.out.println("Sorry, you cannot transfer amount less than zero");
		System.out.println("\nDo you wish to continue (Y/N)...");
		Scanner cont=new Scanner(System.in);
		char sCont=cont.next().charAt(0);
		switch (sCont) {
		case 'Y':	Savings();
		case 'y':	Savings();
		case 'n':	close();
		case 'N':	close();
		default:	close();
		}
	}
	else {
		System.out.println("Success! "+myCash+" has been transfered to Business Number "+num+" and account number "+accnum1);
		b=b-myCash;
		System.out.println("Your new account balance is "+b);
		System.out.println("\nDo you wish to continue (Y/N)...");
		Scanner cont=new Scanner(System.in);
		char sCont=cont.next().charAt(0);
		switch (sCont) {
		case 'Y':	Savings();
		case 'y':	Savings();
		case 'n':	close();
		case 'N':	close();
		default:	close();
		}
	}
}
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
		case 'Y':	Savings();
		case 'y':	Savings();
		case 'n':	close();
		case 'N':	close();
		default:	close();
		}
	}
	else if(amount1<0) {
		System.out.println("Sorry, You cannot withdraw amount less than zero");
		System.out.println("Do you wish to continue (Y/N)...");
		Scanner cont=new Scanner(System.in);
		char sCont=cont.next().charAt(0);
		switch (sCont) {
		case 'Y':	Savings();
		case 'y':	Savings();
		case 'n':	close();
		case 'N':	close();
		default:	close();
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
		case 'Y':	Savings();
		case 'y':	Savings();
		case 'n':	close();
		case 'N':	close();
		default:	close();
		}
	}
}
static void Balance() {
	System.out.printf("Your current balance is %.2f",b);
	System.out.println("\nDo you wish to continue (Y/N)...");
	Scanner cont=new Scanner(System.in);
	char sCont=cont.next().charAt(0);
	switch (sCont) {
	case 'Y':	Savings();
	case 'y':	Savings();
	case 'n':	close();
	case 'N':	close();
	default:	close();
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
		case 'Y':	Savings();
		case 'y':	Savings();
		case 'n':	close();
		case 'N':	close();
		default:	close();
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
		case 'Y':	Savings();
		case 'y':	Savings();
		case 'n':	close();
		case 'N':	close();
		default:	close();
		}
	}
}
static void Savings() {
		System.out.println("******************************************************\n\tWELCOME TO SAVINGS ACCOUNT\n******************************************************");
		System.out.println("ACCOUNT NAME	: "+myName);
		System.out.println("ACCOUNT NO	: "+myAccNumber);
		System.out.println("Account Type	: Savings Account\n");
		System.out.println("Select an Option from the list");
		System.out.println("1. Deposit\n2. Check Balance\n3. Withdraw\n4. PayBill\n5. Close");
		Scanner select1=new Scanner(System.in);
		int s1=select1.nextInt();
		switch (s1) {
		case 1:		Deposit();
		case 2:		Balance();
		case 3:		Withdraw();
		case 4:		Paybill();
		case 5:		close();
		default:	close();
		}	
	}
static void Fixed() {
	System.out.println("******************************************************\n\tWELCOME TO FIXED ACCOUNT\n******************************************************");
	System.out.println("ACCOUNT NAME	: "+myName);
	System.out.println("ACCOUNT NO	: "+myAccNumber);
	System.out.println("Account Type	: Fixed Account\n");
	System.out.println("Enter your target savings");
	Scanner save1=new Scanner(System.in);
	float target=save1.nextInt();
	System.out.println("Select an Option from the list");
	System.out.println("1. Deposit\n2. Check Balance\n3. Withdraw\n4. PayBill\n5. Close");
	Scanner select2=new Scanner(System.in);
	int s2=select2.nextInt();
	switch (s2) {
	case 1:		FDeposit();
	case 2:		FBalance();
	case 3:		FWithdraw();
	case 4:		FPaybill();
	case 5:		close();
	default:	close();
	}
}	
static void print() {
	System.out.println("*********************************************************\n\t\tABC BANK ATM\n*********************************************************");
	System.out.println("Enter your Account Name");
	Scanner name=new Scanner(System.in);
	myName=name.next();
	System.out.println("Enter your account number");
	Scanner accNumber=new Scanner (System.in);
	myAccNumber=accNumber.nextInt();
	System.out.println("Enter your pin");
	Scanner pin=new Scanner(System.in);
	int mypin=pin.nextInt();
	if(mypin==2019) {
	System.out.println("\t\t\tACCOUNTS MENU\n\t\t______________________________");
	System.out.println("1. Savings Account\n2. Fixed Accounts\n\nSelect the Account to Open");
	Scanner select=new Scanner(System.in);
	int s=select.nextInt();
	switch(s) {
	case 1: 	Savings();
	case 2:		Fixed();
	default:
		System.out.println("Invalid choice, kindly choose from the ones listed");
		System.out.println("Do you wish to continue (Y/N)...");
		Scanner cont=new Scanner(System.in);
		char sCont=cont.next().charAt(0);
		switch (sCont) {
		case 'Y':	print();
		case 'y':	print();
		case 'n':	close();
		case 'N':	close();
		default:	close();
		}
	}	
}
	else {
		System.out.println("Invalid pin, your pin is set to your current year");
		System.out.println("Do you wish to continue (Y/N)...");
		Scanner cont=new Scanner(System.in);
		char sCont=cont.next().charAt(0);
		switch (sCont) {
		case 'Y':	print();
		case 'y':	print();
		case 'n':	close();
		case 'N':	close();
		default:	close();
		}
	}
}
public static void main(String[] args) {
		Account acc=new Account();
		acc.print();
	}
}
