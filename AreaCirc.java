import java.util.Scanner;
public class AreaCirc{
    public static void main (String[]args){
        Scanner Area = new Scanner (System.in);
        System.out.println("Enter radius: ");
        double radius = Area.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("Area: " + area);

    }
}