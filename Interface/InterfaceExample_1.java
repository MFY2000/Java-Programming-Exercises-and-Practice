// one class implements another interface class
interface Payment {
    double Balance = 2000;// is the account balance which is hardcoded
    String Name = "Muhammad Fahad";
    String typeOfAccount = "assets";

    boolean CheckBalance(double amountTopay);
    void PaymentProcced(double amount);
    void Start();
}

// the class which implements interface class
class test implements Payment{
    @Override
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
        System.out.println("You wants to pay amount of: 1000 Rupees");
        PaymentProcced(1000);
    }

}

// main methods 
public class InterfaceExample_1{
    public static void main(String[] args) {
        test obj = new test();
        obj.Start();
    }
}
