package bankAccount;

import java.util.Scanner;

class Account
{
int withdraw;
static float cash =1000;

Scanner sc=new Scanner(System.in);

static int Login()
{
	int pinAttempt,pin,savedPin;
	savedPin=2030;
	Scanner sc=new Scanner(System.in);
	pinAttempt=0;
	System.out.print("Enter Pin: ");
	pin=sc.nextInt();

	while(pinAttempt<=3){
	if(pin!=savedPin){
	System.out.print("Wrong Pin\nTry Again: ");
	pin=sc.nextInt();
	++pinAttempt;
	}if((pin!=savedPin)&&(pinAttempt==3)){
	System.out.print("\nNO MORE TRIES!!\n\nTHE SYSTEM WILL NOW QUIT\n\n");
	System.out.print("\nFOR MORE QUERIES ABOUT YOUR PIN, KINDLY CONTACT THE ADMINSTRATOR\n");
	closeAccount();
	break;	
    
}else{
if(pin==savedPin){
System.out.print("\n\n");
memberMenu();
break;
}}
}
return 0;}
static void Withdraw() {
System.out.println("ENTER AMOUNT TO WITHDRAW");
Scanner sc=new Scanner(System.in);
int withdraw;
withdraw=sc.nextInt();
if(withdraw>(cash-200)){
   System.out.println("\n\n\t\tINSUFFICIENT BALANCE\n");
   Resume();  
}
else {
cash=cash-withdraw;
	System.out.println("SUCCESSIFUL");
	System.out.println("NEW BALANCE: Ksh"+cash);
}
Resume();
}	
static void memberMenu()
{
int choice;
Scanner sc=new Scanner(System.in);
System.out.print("ACC TYPE: SAVINGS ACCOUNT\n");
System.out.print("ACC NAME: MBOTE JOSEPH\n");
System.out.print("ACC NO:   008574582365\n");
System.out.print("*************************\n");
System.out.print("1. CHECK BALANCE\n");
System.out.print("2. TRANSFER FUNDS\n");
System.out.print("3. WITHDRAW CASH\n");
System.out.print("4. USE PAYBILL\n");
System.out.print("5. QUIT\n");
System.out.print("SELECT A CHOICE\n");
choice=sc.nextInt();

switch(choice){
case 1:checkBalance();
break;
case 2:transferFunds();
break;
case 3:Withdraw();
break;
case 4:Paybill();
break;
case 5:closeAccount();
break;
default: System.out.println("\t\tINVALID CHOICE\n");
memberMenu();
break;
}
}
static void checkBalance(){
System.out.println("BALANCE: Ksh "+cash);
Resume();
} 
static void transferFunds()
{
int transferAcc=1122334455;
Scanner sc=new Scanner(System.in);
int amnt,accNo;
System.out.println("ENTER ACCOUNT NO");
accNo=sc.nextInt();
if(accNo!=transferAcc) {
	System.out.println("THE ACCOUNT NUMBER DOESN'T MATCH\n");
}else if(accNo==transferAcc) {
	System.out.println("ENTER AMOUNT\n");
	amnt=sc.nextInt();
	if(amnt>cash) {
		System.out.println("YOU HAVE INSUFFICIENT BALANCE\n");
		
	}else {
		System.out.println("SUCCESSFUL TRANSFERRED Ksh"+amnt);
		System.out.println("YOUR BALANCE: Ksh"+(cash-amnt));
	}
}
Resume();
}

static void Paybill()
{
int billNo=102500;
Scanner sc=new Scanner(System.in);
int amnt,payno;
System.out.println("ENTER PAYBILL NO");
payno=sc.nextInt();
if(payno!=billNo) {
	System.out.println("THE PAYBILL DOESN'T MATCH\n");
}else if(payno==billNo) {
	System.out.println("ENTER AMOUNT\n");
	amnt=sc.nextInt();
	if(amnt>cash) {
		System.out.println("YOU HAVE INSUFFICIENT BALANCE\n");
		
	}else {
		System.out.println("SUCCESSIFUL TRANSFERRED Ksh"+amnt);
		System.out.println("YOUR BALANCE: Ksh"+(cash-amnt));
	}
}
Resume();
}
static void bankMenu()
{
System.out.print("BANKING SYSTEM\n\n");
System.out.print("***SERVICES***\n\n");
System.out.print("CASH TRANSFERS\n");
System.out.print("DEPOSITS\n");
System.out.print("WITHDRAWS\n");
System.out.print("BUYING GOODS\n");
System.out.print("\n***WELCOME ...\n\n");
System.out.print("\n\nLOGIN TO CONTINUE...\n");	
}
static void Deposit(float amt){ 
Scanner sc=new Scanner(System.in);
amt=sc.nextInt();	
cash=cash+amt;  
System.out.println(cash+" HAS BEEN SUCCESSFULLY DEPOSITED"); 
System.out.println("NEW AMOUNT: Ksh "+cash);
Resume();
} 
static void Resume() {
	char ans;
	Scanner sc=new Scanner(System.in);
	System.out.print("\n\n\t\tDO YOU WISH TO CONTINUE?(y/n): ");
	ans=sc.next().charAt(0);
	System.out.println("\n\n");
	switch(ans){
	case 'y': memberMenu();
	break;
	case 'Y': memberMenu();
	break;
	case 'n':System.out.print("\t\tTHANK YOU FOR BANKING WITH US\n");
		closeAccount();
	break;
	case 'N':System.out.print("\t\tTHANK YOU FOR BANKING WITH US\n");
		closeAccount();
	break;
	default:System.out.print("\t\tINVALID CHOICE\n");
	Resume();
	break;
	}	
}
static int closeAccount(){
	System.out.print("THANK YOU FOR BANKING WITH US\n\n");
	System.out.print("THE SYSTEM WILL NOW QUIT\n\n");
	return 0;	
}
}

class MemberAccount
{

	public static void main(String[] args)	{
	Account input=new Account();
	MemberAccount acc=new MemberAccount();
	Scanner sc=new Scanner(System.in);

	input.bankMenu();
	input.Login();
		
	System.out.print("\n\n\nmbote@jose_softs.com\n");	
	}
}

