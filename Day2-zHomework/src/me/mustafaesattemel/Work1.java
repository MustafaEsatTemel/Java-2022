package me.mustafaesattemel;

//Video 24-26
public class Work1 {

    public static void main(String[] args) {
        sayHi();
        calculate(3,5);
        System.out.println(calculate(new int[]{2,3,4}));
        System.out.println(calculate(5,6,7));

    }

    public static void sayHi(){
        System.out.println("Hi dudeeeee.");
    }

    public static void calculate(int i, int b){
        System.out.println("Answer : "+(i+b));
    }

    public static int calculate(int... b){
        int answer = 0;
        for (int a : b){
            answer+=a;
        }
        return answer;
    }

}
