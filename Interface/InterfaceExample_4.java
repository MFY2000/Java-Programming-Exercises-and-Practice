

// Single class implements more than one

import java.util.Scanner;

interface Payment {
    double Balance = 2000;// is the account balance which is hardcoded

    boolean CheckBalance(double amountTopay);
    void PaymentProcced(double amount);

    // these are two interface method
}


// the class Extending Another Interface
interface Account{
    void Start();
}

interface Details{
    String Name = "Muhammad Fahad";
    String typeOfAccount = "assets";    
    
}

interface Topayamount {
    Scanner input = new Scanner(System.in);
    
    void getInputFromUser();
}


// the class which implements another interface class

class test implements Payment,Account,Details,Topayamount{
    int amount = 0;
    
    public boolean CheckBalance(double amountTopay) {
        if(amountTopay < Balance){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public void PaymentProcced(double amount) {
        if(CheckBalance(amount)){
            System.out.println("Your account is able to pay the  amount");
        }
        else {
            System.out.println("You are unable to pay amount");
        }
    }
    
    @Override
    public void Start() {
        System.out.println("Name: "+Name);
        System.out.println("Type Of Account: "+typeOfAccount);
        getInputFromUser();
        System.out.println("You wants to pay amount of: "+amount+" Rupees");
        PaymentProcced(amount);
    }
    
    // Intupt methods taking input.
    public void getInputFromUser(){
        System.out.print("Enter the amount to pay: ");
        amount = input.nextInt();
    }
    
}

// main methods 
public class Example_IEI_4{
    public static void main(String[] args) {
        test obj = new test();
        obj.Start();
    }
}
