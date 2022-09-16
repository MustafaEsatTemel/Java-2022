package me.mustafaesattemel;
//Video 20 | Thick - Thin letters
public class Work10 {
    public static void main(String[] args) {
        char[] thick = {'A','I','O','U'};
        char checkValue = 'e';

        for(int i =0 ; i < thick.length ; i++){
            if(Character.toUpperCase(checkValue)==thick[i]){
                System.out.println("Thickkk");
                break;
            }
        }
    }
}
