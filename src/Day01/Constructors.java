package Day01;
import java.time.LocalDate;

//keep in mind!!
// if you create multiple class in one file/class
//your file name must be same with public class name (public class Constructors)
//Any other class must have default access modifier ( class person)

class Person {

    public String name;
    public char gender;
    public LocalDate dateOfBirth;//LocalDate--> year-month-day
                                 //LocalTime-->  Hours-minutes-seconds
                                 //LocalDateTime--> year-month-day  Hours-minutes-seconds
    public static boolean isHuman;


    public Person(String name, char gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}

public class Constructors {

    public static void main(String[] args) {

        Person person1 = new Person("Ahmet",'M', LocalDate.of(1990,5,1));

        System.out.println("person1 = " + person1);
        System.out.println(person1.dateOfBirth);
        System.out.println(Person.isHuman);     // static can be called with class name

        Person person2 = new Person("Ahmet",'M', LocalDate.of(1991,5,1));
        Person person3 = new Person("Aaron",'M', LocalDate.of(1992,5,1));

        System.out.println("person2 = " + person2);
        System.out.println("person3 = " + person3);



    }
}
