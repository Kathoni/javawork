
import java.util.Scanner;

public class ScannerTut {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//Creating a new scanner object calling a varriable
        System.out.println("Enter Name:");//This asks the user to input
        String name = scan.nextLine();//This is a scanner method used in casting the data correctly 

        System.out.println("Enter Age:");//This asks the user to input
        int age = scan.nextInt();//This is a scanner method used in casting the data correctly

        System.out.println("Greetings " + name
                + ". You are " + age); //used to create output for the program

    }
    /*scanner performs input import calls java libraries*/
}
