
import java.util.Scanner;
public class RectangleAreaPerimeter{
    public static void main(String[]args){
        double length, width;
        Scanner RectanglePerimeter= new Scanner (System.in);
        System.out.println("Enter your length : " );
        String name= RectanglePerimeter.nextLine();
        System.out.println("Enter your width : " );
        String name2= RectanglePerimeter.nextLine();
        length = Double.parseDouble(name);
        width = Double.parseDouble(name2);
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);


        
    }
}