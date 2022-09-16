package me.mustafaesattemel;

import java.util.Scanner;

//Video 10 - Conditions - Switch
public class Work5 {
    public static void main(String[] args) {
        String userInput = "";
        Scanner scan = new Scanner(System.in);
        userInput = scan.nextLine();

        switch (userInput){
            case "elma":
                System.out.println("An apple");
                break;
            case "armut":
                System.out.println("A pear");
                break;
            default:
                System.out.println("I can only eat apple and pear");
        }
    }
}
