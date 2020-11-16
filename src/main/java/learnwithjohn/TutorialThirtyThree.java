package learnwithjohn;

class Meechine{
   public void start(){
       System.out.println("Machine Started.");
   }
   }
    class Camera extends Meechine{
    public void start(){
        System.out.println("Camera Started");
    }
    public void snap(){
        System.out.println("Photo Taken");
    }
    }
public class TutorialThirtyThree {

    public static void main(String[] args) {
        Meechine machine1 = new Meechine();
        Camera camera1 = new Camera();
        machine1.start();
        camera1.start();
        camera1.snap();

        //Polymorphism
        Meechine machine2 = new Camera();
        machine2.start();
        //Upcasting:
        Meechine machine3 = camera1;
        machine3.start();

        //Downcasting
        Meechine machine4 = new Camera();
        Camera camera2 = (Camera)machine4;
        //john showed camera2 as downcasting.
        //but i feel from machine 4 to be able to call camera snap method is
        //real purpose of downcasting....to be able to use machine4 as an obj o camera...(i guess)
        //camera2.start();
        //camera2.snap();

        ((Camera) machine4).snap();

    }
}
