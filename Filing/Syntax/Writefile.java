
public class Writefile {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.unfinished(12,15));
    }    



}

abstract class A{
    A(){
        System.out.println("Constructors");
    }
    int unfinished(int a, int b){
        return (a+b);
    }

}


class B extends A{

    B(){
        super();
    }
}



