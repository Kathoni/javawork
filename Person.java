public class Person {
    String name;
    String secondname;
    int age;
    public Person(String name, String secondname, int age) {
        this.name = name;
        this.secondname = secondname;
        this.age = age;
    }

    public String getName() {
        return name ;
    }

    public String getSecondname() {
        return secondname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return name + " \n" 
        + secondname + "\n "
         + age;
    }


}