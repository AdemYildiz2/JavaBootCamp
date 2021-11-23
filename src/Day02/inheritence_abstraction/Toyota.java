package Day02.inheritence_abstraction;

public final class Toyota extends Car { // Toyota Is A car(Is A relationship)

    public Toyota(int year, String model, String color, double price) { //we has to call cons from parent and initialize it here or in test class (CarShop)
        super(year, "Toyota", model, color, price);
    }

    @Override
    public void start() {

        System.out.println("Twist the key");
    }
}
