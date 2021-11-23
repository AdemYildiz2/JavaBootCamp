package Day01;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        int [] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        //arr[3] = 40; //it is not possible because size is fixed

        System.out.println(Arrays.toString(arr));

        Integer [] arr2 = {1,2,3,};
        String [] arr3 = {"A","B","C"};

        int [][] arr2D = {{1,2},{3,4,5}};

        System.out.println("----------------------------------");
        //Arrays.sort() method
        int [] a1 = {1,2,3};
        int [] a2 = {3,2,1};

        Arrays.sort(a1);
        Arrays.sort(a2);

        System.out.println(Arrays.equals(a1,a2));

        System.out.println("----------------------------------");
        //Loop in the array
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();

        System.out.println("----------------------------------");

        char[] ch1 = {'A','B','C','D'};

        for (int i = 0; i < ch1.length; i++) {
            System.out.print(ch1[i]);
        }

        System.out.println();

        System.out.println("----------------------------------");
        //for each loop
        for (char each : ch1) {
            System.out.print(each);
        }








    }
}
