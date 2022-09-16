package me.mustafaesattemel;

//Video 23 | Find the numbers
public class Work13 {
    public static void main(String[] args) {
        int youCantFoundMe= 5;
        boolean didYouFound = false;
        int[] numbers = {1,2,3,4,5};

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==youCantFoundMe){
                didYouFound = true;
            }
        }
        System.out.println(didYouFound);
    }
}
