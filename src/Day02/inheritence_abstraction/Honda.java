package Day02.inheritence_abstraction;

public final class Honda extends Car { // Honda Is A car

    public Honda(int year, String model, String color, double price) {
        super(year, "Honda", model, color, price);
    }

    @Override
    public void start() {

        System.out.println("Twist the key");
    }
}
