public class Passenger{
    String name;
    int passengerage;
    Boolean isFirstcalss;

    public Passenger(String name, int passengerage, Boolean isFirstcalss){
        this.name = name;
        this.passengerage = passengerage;
        this.isFirstcalss = isFirstcalss;
    }

    public String getName(){
        return name ;
         }

    public int getPassengerage(){
        return passengerage;
    }

    public Boolean getIsFirstcalss(){
        return isFirstcalss;
    }


}

