package me.mustafaesattemel;

//Video 11-12-13 - Loops
public class Work6 {
    public static void main(String[] args) {
        for (int i = 0 ; i<5 ; i++){
            System.out.println(i);
        }

        int i = 0;
        while(i<5){
            System.out.println(i);
            i++;
        }

        i = 0;
        do {
            System.out.println(i);
            i++;
        }while (i<5);
    }
}
