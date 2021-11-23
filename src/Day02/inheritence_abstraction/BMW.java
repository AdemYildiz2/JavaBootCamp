package Day02.inheritence_abstraction;

public class BMW extends Car implements LuxuryCar{ // BMW Is A car

    public BMW(int year, String model, String color, double price) {
        super(year, "BMW", model, color, price);
    }

    @Override
    public void start() {
        System.out.println("push the start button ");

    }

    @Override
    public void massage() {

    }
}
