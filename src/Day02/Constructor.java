package Day02;

class A{
    public A(int a){ // constructor cannot be inherited
        System.out.println("A");
    }
}

class B extends A{ // child class MUST call parent class' constructor

    public B(){
        super(10);
        System.out.println("B");

    }

}

public class Constructor {

    public static void main(String[] args) {

        new B();

    }


}