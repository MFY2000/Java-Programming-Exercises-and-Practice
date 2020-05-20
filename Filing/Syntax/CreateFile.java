import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); // clear console screen 
        
        try {
            File fileName = null;
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the method (demo = 1,runtime = 2, Exit = 0): ");
            int key = scan.nextInt(); 
            if(key == 0){ System.exit(1); }
            
            switch (key) {
                case 1:
                    fileName = new File("C:\Users\MFY\Desktop\"+ 0+"Maju 2nd semsester"+"\Java-Programming-Exercises-and-Practice\Filing\Syntax\firstFile.txt");
                    break;
                case 2:
                    scan.nextLine();
                    System.out.print("Enter the name of File: ");
                    String name = scan.nextLine();
                    
                    System.out.print("Enter the extension of File: ");
                    String extension = scan.nextLine();
                    fileName = new File(name+"."+extension);
                    break;

                default:
                    break;
            }
            if(fileName.createNewFile())
                System.out.println("Succesfully Created the file");
        }
         catch (Exception e) {
                System.out.println(e.getMessage());
        }
    
    }
}