package me.mustafaesattemel;

//Video 9 - Find the bigger
public class Work4 {
    public static void main(String[] args) {
        int []ourArray = {5,9,56,81,7,3};
        int theBiggest = 0;
        for (int i = 0; i<ourArray.length ; i++){
            if (theBiggest<=ourArray[i]){
                theBiggest=ourArray[i];
            }

        }
        System.out.println(theBiggest);


    }
}
