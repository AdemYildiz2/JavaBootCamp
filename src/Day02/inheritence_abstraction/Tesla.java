package Day02.inheritence_abstraction;

public final class Tesla extends Car implements LuxuryCar{ // Tesla Is A car

    public Tesla(int year, String model, String color, double price) {

        super(year, "Tesla", model, color, price);
    }


    public void start() {
        System.out.println("Say start ");
    }

    @Override
    public void massage() {

    }
}
