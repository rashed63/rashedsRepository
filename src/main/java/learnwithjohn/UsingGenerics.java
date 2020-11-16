package learnwithjohn;

import java.util.ArrayList;

public class UsingGenerics {
    public static void main(String[] args) {
        //Simple example of using generics
        ArrayList<String> list = new ArrayList<String>();
        list.add("Horse");
        list.add("Lion");
        list.add("Deer");
        String animal = list.get(0);
        System.out.println(animal);
    }
}
