package Day02;

import java.io.FileInputStream;

public class ExceptionsPractice {

    public void m(){
       // super.finalize();
    }

    public static void main(String[] args) throws InterruptedException {

        //UNCHECKED EXCEPTION
        //EX-1
        String str = null; //no object

        //System.out.println(str.toLowerCase()); //no object but I still call instance method of str object

        //EX-2
        /*
        System.out.println(9/0); //-> STATEMENT

        System.out.println("Test completed"); //Can NOT print because of STATEMENT
        */

        //Solution of EX2 -->JUST ONE WAY: Try catch
        try{
            System.out.println(9/0);

        }catch (RuntimeException e){

            e.printStackTrace(); //after execution all the codes, gives the full details of th exception that was occurred
        }

           System.out.println("Test completed");

        //CHECKED EXCEPTION
        //Ex-1=
        //FileInputStream file = new FileInputStream(""); //we want to place location of file
        //EX-2
        //Thread.sleep(300); -->iT IS known exception/checked exception can be HANDLING 2 WAYS

       // Solution of EX2
        /* way-1
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
          System.out.println("Test2 completed");
         */

        //way-2
        Thread.sleep(300);
        System.out.println("Test2 completed");
        System.out.println("----------------------------");

        try {
            System.out.println("cybertek".charAt(2000));
            System.out.println("Try block");
        }catch (RuntimeException e){
            System.out.println("Catch Block");
            System.exit(0); // terminates everything
        }finally {
            System.out.println("Finally block");
        }

        System.out.println("Hello");

        System.out.println("---------------------------------");

        String s = "Toyota"; //Garbage collector calls finalize method from this object(s/toyota) to collect this object
        s = "BMW";

        System.out.println(s);

        System.out.println("------------------------------------------");




    }


    public static void method1() throws InterruptedException {  // caller has to handle the exception

        Thread.sleep(3000);

        System.out.println("Hello");

        Thread.sleep(3000);

        System.out.println("How are you");

    }

    public static void method2(){

        try {
            method1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public static void method3(){
        //   method1();
        method2();

        //    Thread.sleep(3000);

    }



}
