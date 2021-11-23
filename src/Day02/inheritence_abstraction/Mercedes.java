package Day02.inheritence_abstraction;

public final class Mercedes extends Car implements LuxuryCar{

    public Mercedes(int year, String model, String color, double price) {
        super(year, "Mercedes", model, color, price);
    }
    public void start(){
        System.out.println("Push the start button");
    }

    @Override
    public void massage() {

    }
}
