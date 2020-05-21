
public class Readfile {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); // clear console screen 
B obj = new B();
System.out.println(obj.unfinished());

        System.out.println("Hello world");
    }    



}

abstract class A{
    abstract  int unfinished();
}


class B extends A{
    public int unfinished(){
        return 12;
    }
}



