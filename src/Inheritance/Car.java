package Inheritance;

public class Car extends Machine {
    public void windShield()
    {
        System.out.println("Windshield wipping");
    }


    public void start()
    {

        super.start();
        System.out.println(super.name);
        System.out.println("Inheritance.Car started");

    }



    public static void main(String[] args) {
        Car car1 = new Car();
        car1.start();
        car1.stop();


    }


}
