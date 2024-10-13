import java.util.ArrayList;

public class Cruiseship{

    ArrayList<Passenger> passengers;//You must declare the passengers first

    public Cruiseship(){
          passengers = new ArrayList<>();//innitializing the ArrayList
    }
    /*This method adds the inputed passenger P
    * to the ArrayList passengers
    */
   public void addPassanger(Passenger P) {
       passengers.add(P);
       //Add passenger object to the list 
   }
   /*This method returns the number of 
   * passengers in the list.
   */
   public int getNumPassangers(){
       return passengers.size();
   }
   //Returns the size of the ArrayList
    
}