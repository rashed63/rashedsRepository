package learnwithjohn;

public class BuildingFormating {


    public static void main(String[] args) {

        //inefficient coding
        String info = "";
        info += "My name is Rashed.";
        info += " ";
        info += " I am a Poor Programmer ha ha ha";
        System.out.println(info);

        //using String Builder object. More efficient
        StringBuilder buildingString = new StringBuilder();
        buildingString.append("My name is Mahfuzur");
        buildingString.append(" ");
        buildingString.append("i am enjoying programming");
        System.out.println(buildingString);
        //can also print with the down printing command
        //System.out.println(buildingString.toString());
    }
}
