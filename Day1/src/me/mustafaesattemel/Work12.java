package me.mustafaesattemel;

//Video 22 | Friends Numbers
public class Work12 {
    public static void main(String[] args) {
        //220 - 284
        int friend1 = 220;
        int friend2= 284;
        int calc1 =0;
        int calc2 = 0;

        for(int i=1;i<friend1;i++){
            if(friend1%i==0){
                calc2+=i;
            }
        }
        for (int i = 1; i < friend2; i++) {
            if(friend2%i==0){
                calc1+=i;
            }
        }
        System.out.println((calc2==friend2&&calc1==friend1) ? "Yesss" : "Oh nO");

    }
}
