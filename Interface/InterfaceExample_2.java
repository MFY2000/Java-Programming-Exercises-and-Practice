//single Interface Extended by more than one Interface

interface Payment {
    double Balance = 2000;// is the account balance which is hardcoded

    boolean CheckBalance(double amountTopay);
    void PaymentProcced(double amount);

    // these are two interface method
}


// the class Extending Another Interface

interface Details {
    String Name = "Muhammad Fahad";
    String typeOfAccount = "assets";
}


interface Account extends Payment,Details {
    void Start();
}




// the class which implements all the interface class
class test implements Account{
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
        System.out.println("You wants to pay amount of: 2000 Rupees");
        PaymentProcced(2000);
    }

}

// main methods 
public class Example_IMEI_2{
    public static void main(String[] args) {
        test obj = new test();
        obj.Start();
    }
}
