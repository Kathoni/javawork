public class Person{
    String firstname;
    String lastname;
    public Person(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public void setFirstname(String newfirstname){
        this.firstname = newfirstname;
    }
    public void setLastname(String newlastname){
        this.lastname = newlastname;
    }
    @Override
    public String toString(){
        return firstname + " " + lastname;
    }
}