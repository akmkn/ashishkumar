import java.util.Scanner;

// java program written to help bankers
// only add account details all manual and track your tranction
// just a start to record bank details

public class BankerProbs {
public static Scanner scan;
private static long bal;

// function written to record account holder details
public void accountDetails(long accNo, String name, long addharNo, float iniAmount){
    System.out.println("*WELCOME*");
}
// function written to make a check about amount deposited or withdraw 
public void transaction(long withdrawl, long deposit){
    System.out.println("amount withdrawed:" +withdrawl);
    System.out.println("Amount deposited:" +deposit);
    
}
// function written to calculate balance in account after making transaction
public void balance(long withdrawl,long bal, float iniAmount, long deposit){
    bal = (long) (iniAmount+deposit-withdrawl);
    System.out.println("Your current balance:"+bal);
    
}
    public static void main(String args[]){
        BankerProbs obj = new BankerProbs();
        scan = new Scanner(System.in);
        System.out.println("Account holder details:");
        System.out.println("Account Number:");
        long accNo = scan.nextLong();
        System.out.println("Account holder ID:");
        long addharNo = scan.nextLong();
        System.out.println("Account opening amount:");
        float iniAmount = scan.nextFloat();
        System.out.println("Account holder name:");
        String name=scan.next();  
        
        obj.accountDetails(accNo, name, addharNo, iniAmount);
        
        System.out.println("Amount depostied:");
        long deposit = scan.nextLong();
        System.out.println("Amount withdraw:");
        long withdrawl = scan.nextLong();
        
        obj.transaction(withdrawl,deposit);
        obj.balance(withdrawl, bal, iniAmount, deposit);
    }
    
    
}