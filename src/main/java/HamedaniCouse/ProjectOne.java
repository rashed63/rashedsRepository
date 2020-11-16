package HamedaniCouse;

import java.text.Format;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class ProjectOne {
public static void printingAge(){

    int myAge = 27;
    int herAge = myAge;
    System.out.println(herAge);

}
public static void getTime(){
    Date timeNow = new Date();
    System.out.println(timeNow);

}
public static void stringVariables() {
    String message = ("Hello World" + "!!");
    System.out.println(message.replace('!', '*'));
}
public static void playingWithArray(){
    int numbers[] = {2,3,5,7,1};
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));
}
public static void implicitCasting(){

//examples of implicit casting
   String x = "10.99";
   float y = Float.parseFloat(x) + 10.99F;
   System.out.println(y);
    //float price = 10.99f;
    //double tomato = price + 3;
    //System.out.println(tomato);

}
public static void magicCode(){
    int[] numbers = {5,7,14,20,30};
    for(int i = 0; i<5;i++){
        System.out.println(i +"             " + numbers[i]);
    }
}
public static void mathBoresMe(){
    //to get random numbers
    int result = (int)Math.round(Math.random()*100);
    System.out.println(result);
}
public static void getCurrency(){
    //this method called method chaining
    String currency = NumberFormat.getCurrencyInstance().format(12345678.32);

    //percent one done in a normal way causing an extra line of code
    NumberFormat percent = NumberFormat.getPercentInstance();
    String result = percent.format(.20);
    System.out.println(result);
    System.out.println(currency);

}
public static void readingFromTheTerminal(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Name :: ");
    String name = scanner.nextLine().toUpperCase();
    System.out.println("You Are "+ name);
    //System.out.print("AGE::");
    //byte age = scanner.nextByte();
    //System.out.println("Your Age is  " + age);
}
    public static void main(String[] args) {
        //printingAge();
        //getTime();
        //stringVariables();
        //playingWithArray();
        //implicitCasting();
        //mathBoresMe();
        //magicCode();
        //getCurrency();
        readingFromTheTerminal();
    }


}
