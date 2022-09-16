package me.mustafaesattemel;

//Video 19 | isPrime
public class Work9 {
    public static void main(String[] args) {
        int prime = 29;
        boolean isPrime =true;

        for (int i =2; i<prime; i++){
            if(prime%i==0){
                isPrime = false;
            }
        }
        System.out.println(isPrime);
    }
}
