public class Student{
    String regNo;
    String FullNames;
    Course Course; //object of type Course(Aggregation)

    public Student(String regNo, String FullNames, Course Course){
        this.regNo = regNo;
        this.FullNames = FullNames;
        this.Course = Course;
     }
     public void setregNo( String newregNo){
        this.regNo = newregNo ;
     }
     public void setFullNames(String newFullNames){
        this.FullNames = newFullNames;
     }
     public void setCourse(Course newCourse){
        this.Course = newCourse;
     }
     public String getregNo(){
        return this.regNo;
     }
     public String getFullNames(){
        return this.FullNames;
     }
     public Course getCourse(){
        return this.Course;
     }

     @Override
     
     public String toString(){
        return "REG NO: " +
        this.regNo +
        "\n FULL NAMES: " +
        this.FullNames +
        "\n COURSE: " +
        this.Course.toString();
     }
}