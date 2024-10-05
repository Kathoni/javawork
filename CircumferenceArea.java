public class CircumferenceArea{
    public static void main(String[] args) {

        double radius, area, circumference ;

        final double PI= 3.145;
         radius =100;

        area = PI * radius * radius;

        circumference = 2 * PI * radius;
        System.err.println("The radius is: " +radius);
        System.err.println("The area is: " +area);
        System.err.println("The circumference is: " +circumference );

    }
}