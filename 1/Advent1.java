import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Your First Program

public class Advent1 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello, World!"); 
        File input = new File("1_input.txt");
        Scanner scan  = new Scanner(input);

        System.out.println(scan.nextLine());
        scan.close();
    }
}