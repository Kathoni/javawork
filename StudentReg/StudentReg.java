
public class StudentReg {

    public static void main(String[] args) {
        System.out.println("\n=========using new Course==========");
        Student dan = new Student("G127/001/2023", "Daniel Nzioki", new Course("SCI220", "Programming in Python")); //pass object new Course
        Student kip = new Student("G127/2234/2023", "Kipkirui Jang", new Course("SCI303", "Web Programming"));
        System.out.print("\n___________________________\n");
        System.out.println(dan.printD());
        System.out.println("_____________________________");
        System.out.println(kip.printD());
        System.out.println("\n================================");
        System.out.println("=====CREATE OBJECT FIRST========");
        Course a = new Course("SCI220","Programming in Python");
        Course b = new Course("SCI303","Web Programming");
        //System.out.println("================================");
        Student dann = new Student("G127/001/2023","Daniel Nzioki", a); //pass objectnew Course
        System.out.println(dann.printD());
        System.out.println("_____________________________");
        Student kipp = new Student("G127/2234/2023","Kipkirui Jang",b);
        System.out.println(kipp.printD());
        System.out.println("================================");



    }
}
