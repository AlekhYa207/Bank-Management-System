import java.util.Scanner;
class Customer{
private int acc_no;
private String name;
private float balance;
Customer(int acc_no,String name,float balance){
this.acc_no=acc_no;
this.name=name;
this.balance=balance;
}
public int getAcc_no(){
return acc_no;
}
public void setAcc_no(int acc_no){
this.acc_no=acc_no;
}
public String getName(){
return name;
}
public void setName(String name){
this.name=name;
}
public float getBalance(){
return balance;
}
public void setBalance(int balance){
this.balance=balance;
}
public String toString(){
return "acc_no="+acc_no+"name="+name+"balance"+balance;
}
void deposit(int amt)
{
balance+=amt;
System.out.println("Total ="+balance);
}
void withdrawl(int amt)
{
if(amt>balance){
System.out.println("Insuuficient balance");
}
else{
balance=balance-amt;
System.out.println("After withdrawl balance="+ balance);
}
}
void balance_enquiry(){
System.out.println("My current balance is: " + balance);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter acc_no:");
int acc_no=sc.nextInt();
System.out.println("Enter name:");
String name=sc.next();
System.out.println("Enter amount:");
float balance=sc.nextFloat();
Customer obj=new Customer(acc_no,name,balance);
System.out.println("Menu");
System.out.println("----->");
System.out.println("1.Deposit");
System.out.println("2.Withdraw");
System.out.println("3.Balance enquiry");
System.out.println("4.Exit");
System.out.println("Enter your choice: ");
int option=sc.nextInt();
int amt=0;
switch(option){
case 1:
System.out.println("Enter amount to deposit :");
amt=sc.nextInt();
obj.deposit(amt);
break;
case 2:
System.out.println("Enter amount to withdraw: ");
amt=sc.nextInt();
obj.withdrawl(amt);
break;
case 3:
obj.balance_enquiry();
break;
case 4:
System.exit(0);
break;
}
}
}

