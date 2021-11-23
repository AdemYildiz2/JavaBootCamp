package Day02;

import Day02.inheritence_abstraction.BMW;
import Day02.inheritence_abstraction.Car;
import Day02.inheritence_abstraction.Toyota;

public class polymorphism {

    public static void main(String[] args) {

        //reference type =  object type -> it is already has up casting
        Car car1 = new Toyota(2019,"Charmy","Black",25000);
        Car car2 = new BMW(2020,"X6","Red",45000);

        //drive(), start are in parent class(in reference type)
        //so we can call directly
        car2.drive();
        car2.start();

        //car2.massage();--> massage() method is in child class(in object type)
        //so we need down casting to reach
        ((BMW)car2).massage();
    }
}
