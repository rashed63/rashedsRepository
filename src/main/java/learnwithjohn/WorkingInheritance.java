package learnwithjohn;

public class WorkingInheritance {
    public static void main(String[] args) {
    Machine lamborgini = new Machine();
    lamborgini.start();
    lamborgini.stop();
    Car car1 = new Car();
    car1.start();
    car1.wipeWindShield();
    car1.carType();
    }
    //this class is the mother class of Car and Machine Class
    //Car is an extended class of machine
    //this project is a good example of inheritace

}
