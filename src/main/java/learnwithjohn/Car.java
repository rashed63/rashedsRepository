package learnwithjohn;

public class Car extends Machine {
    public void start(){
        super.start();
        System.out.println("Lamborghini");
    }
    public void wipeWindShield(){
        System.out.println("Wiping Windshield Started");

    }
    public void carType(){
        System.out.println("Car type is "+ name);
    }
}
