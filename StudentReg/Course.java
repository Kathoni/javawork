public class Course{
    String UnitCode;
    String UnitTitle;

    //the first method
    
    public Course(String UnitCode, String UnitTitle){
        this.UnitCode = UnitCode;
        this.UnitTitle = UnitTitle;

    }
    public void setUnitCode(String newUnitCode){
        this.UnitCode = newUnitCode;
    }
    public void setUnitTitle(String newUnitTitle){
        this.UnitTitle = newUnitTitle;
    }
    public String getUnitCode(){

        return this.UnitCode;
    }
    public String getUnitTItle(){

        return this.UnitTitle;
    }
}