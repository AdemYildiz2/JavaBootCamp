package Day02.inheritence_abstraction;

public class CarShop { //CarShop Has A Tesla

    public static void main(String[] args) {

        Toyota toyota = new Toyota(2019,"Charmy","Black",25000);
//        toyota.make = "honday"; these variable final so we can not change
//        toyota.year = 2030

        Honda honda = new Honda(2018,"Accord","Blue",28000);

        Tesla tesla = new Tesla (2001,"Model 3","White",40000);

        BMW bmw = new BMW(2020,"X6","Red",45000);

        Mercedes mercedes = new Mercedes(2019,"GL","Gray",50000);

        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(mercedes);
        System.out.println(tesla);
        System.out.println(bmw);


        System.out.println("-------------------------------------");
        toyota.start();

        System.out.println("-------------------------------------");
        honda.start();

        System.out.println("-------------------------------------");
        bmw.start();

        System.out.println("-------------------------------------");
        mercedes.start();

        System.out.println("-------------------------------------");
        tesla.start();

    }
}
