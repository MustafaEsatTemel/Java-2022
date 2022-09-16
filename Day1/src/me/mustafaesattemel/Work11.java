package me.mustafaesattemel;
//Video 21 | Perfect numbers
public class Work11 {
    public static void main(String[] args) {
        int isPerfect = 7;
        int isEqual = 0;
        for (int i=1;i<isPerfect;i++){
            if(isPerfect%i==0){
                isEqual+=i;
            }
        }
        System.out.println((isPerfect==isEqual)?"YESSS" :"Oh NO");
    }
}
