package actions;

public class User {
     String name;
     String designation;
     int age;
     double salary;

    public User(String name){
        this.name = name;

    }
    public User(String name, int age){
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
