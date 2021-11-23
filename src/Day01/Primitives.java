package Day01;

public class Primitives {
    public static void main(String[] args) {

        byte a = 100;
        short b = (short) a; // implicit casting
        int c = b;
        long d = c;
        float f = d;
        double g =f;


        byte x = (byte)g; // explicit casting
        int y = (int)g;


        char ch = 'T';
        boolean result = true;
        boolean result2 = false;

        boolean result3 = 10 < 20;

    }

}

