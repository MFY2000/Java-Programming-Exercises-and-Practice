//Multiple Inheritance using interface

class car{
    String carName = "Honda Civic Reborn";

    String start(){
        return "Car Stars with a Push Button Mechanism.";
    }
}

interface Engine{
    String enginePower = "2000 CC";
}


class example5 extends car implements Engine{

    public void display(){
        System.out.println("Car Name = " + carName);
        System.out.println(start());
        System.out.println("Engine Power = " + Engine.enginePower);
    }
    public static void main(String args[]){
        example5 Task = new example5();
        Task.display();
    }
}