import java.util.Scanner;
//more than one Inheritance using interface



// abstract class is used for RateOfCurrence value changes
abstract class Payment {
    public double RateOfCurrence;

    Payment(double rate){
        this.RateOfCurrence = rate;
    }
    boolean CheckBalance(double amountTopay,double Balance){
        if(Balance < (amountTopay*RateOfCurrence))
            return false;
        else{
            return true;
        }
    }
    abstract double PaymentProcced(double Balance,double amount);
}


// normal class to used abstract class
class Dollar extends Payment{
    Dollar(){
        super(158.02);
    }

    @Override
    double PaymentProcced(double Balance,double amount) {
        boolean possible = CheckBalance(this.RateOfCurrence,Balance);
        if (possible){
            Balance -= amount*RateOfCurrence;
            System.out.println("Balance is now: "+Balance);
        }
        else
            System.out.println("Your Balance is less than amount to pay after chaning into Dollar");

        return Balance;
    }
}
// same working
class Pound extends Payment{
    Pound(){
        super(258.02);
    }

    @Override
    double PaymentProcced(double Balance,double amount) {
        boolean possible = CheckBalance(this.RateOfCurrence,Balance);
        if (possible){
            Balance -= amount*RateOfCurrence;
            System.out.println("Balance is now: "+Balance);
        }
        else
            System.out.println("Your Balance is less than amount to pay after chaning into Pound");
        return Balance;
    }
}


// Real working start 
// A interface is define here to use it
interface BankAccount{
    void Payment(double amount);
    void PaymentInDollar(double amount);
    void PaymentInPound(double amount);
}


class Details{
    String Name = "Muhammad Fahad";
    String typeOfAccount = "assets";        
}

//Multiple Inheritance using interface
class Account extends Details implements BankAccount{
    public double Balance;

    Dollar Currency1 = new Dollar();
    Pound Currency2 = new Pound();

    public void Payment(double amount){
        if(Balance > amount)
            Balance -= amount;
        else
            System.out.println("Your Balance is less than amount to pay");
    }
    public void PaymentInDollar(double amount){
        Balance -= Currency1.PaymentProcced(Balance,amount);
    }

    public void PaymentInPound(double amount){
        Balance -= Currency2.PaymentProcced(Balance,amount);
    }

    public void setBalance(double balance) {
        Balance += balance;
    }
}



public class InterfaceExample_5{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account account = new Account();
        int input,in;
        double amount;

        do {
            System.out.println("Welcome "+account.Name+" to ABC Bank(You can pay the amount in any form(Dollar,pound and normal currency)\n Your Balance is "+account.Balance+").......................");
            System.out.println("1. Deposit the Amount");
            System.out.println("2. Withdrawn/payment the Amount");
            System.out.println("0. Exit ");
            System.out.print("Enter here: ");
            input = scan.nextInt();

            if(input == 0)
                break;
            else if(input == 1) {
                System.out.print("Enter the amount to deposit in your acount: ");
                amount = scan.nextDouble();
                account.setBalance(amount);
                System.out.println("Your account is successfully deposited");
            }
            else if(input == 2){
                System.out.print("Your wants to pay amount in which form press (1 => normal currency,2 => Dollar,3 => Pound)");
                in = scan.nextInt();

                if (in == 1){
                    System.out.print("Enter the amount to pay: ");
                    amount = scan.nextDouble();
                    account.Payment(amount);
                }
                else if(in == 2){
                    System.out.print("Enter the amount of dollar to pay: ");
                    amount = scan.nextDouble();
                    account.PaymentInDollar(amount);
                }
                else{
                    System.out.print("Enter the amount of pound to pay: ");
                    amount = scan.nextDouble();
                    account.PaymentInPound(amount);
                }
            }
            else{
                System.out.println("Enter the Valid input(404 no way found on "+input+")");
            }
        }while (true);
    }
}