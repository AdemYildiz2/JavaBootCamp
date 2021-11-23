package Day01;

//to test OOP classes
public class Test {
    public static void main(String[] args) {

        OOP_Encapsulation obj = new OOP_Encapsulation();

        //1- if our variables in OOP_Encaptulation class are public or default, no restriction
//        obj.name="";
//        obj.salary=-1000;
//        System.out.println("obj.salary = " + obj.salary);

        //2- if we encapsulate with variable and put restriction in setter method
        obj.setName("");
        obj.setSalary(-1000);

        //throws the exception that we put in our setter
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());

    }

}
