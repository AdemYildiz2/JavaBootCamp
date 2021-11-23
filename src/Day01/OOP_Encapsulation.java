package Day01;

public class OOP_Encapsulation {

     private String name;
     private double salary;

    public String getName(){

        return name=name;
    }

    public void setName(String name){
        if(name.isEmpty()){
            throw new RuntimeException("Name can not be empty");
        }
        this.name=name;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {
        if(salary<=0){
            throw new RuntimeException("Salary can not be negative or zero");
        }
        this.salary = salary;
    }

}
