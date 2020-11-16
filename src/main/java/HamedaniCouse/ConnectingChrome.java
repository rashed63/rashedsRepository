package HamedaniCouse;

import org.openqa.selenium.WebDriver;

import java.util.Scanner;

public class ConnectingChrome {
    public static void ownCode() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter User Id :");
        String userId = input.nextLine();
        if (userId.length() < 7) {
            System.out.print("your user id is: " + userId);
        }
        else {
            System.out.print("Enter valid User Id :");
            userId = input.nextLine();
        }
    }

        public static void main (String[]args){
            ownCode();
        }

}
