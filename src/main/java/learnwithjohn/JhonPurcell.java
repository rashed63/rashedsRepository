package learnwithjohn;
class Person{
    String name;
    int age;
    void speak(){
        System.out.println("my name is "+ name);
    }
    int calculateYearsToRetirement(){
        int yearsLeft = (65 - age);
        return yearsLeft;
    }
    public void talk(String text){
        System.out.println(text);
    }
}
public class JhonPurcell {
    public static void main(String[] args) {
        Person human1 = new Person();
        human1.name = "Rashed";
        human1.age = 26;
        human1.speak();
        human1.calculateYearsToRetirement();
        int years = human1.calculateYearsToRetirement();
        System.out.println("You will retire in " + years + " years");
        String hobby = "i love coding";
        human1.talk(hobby);
    }
}
