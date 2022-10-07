package homework.v2;

public class Calculator{

    private String username;

    public Calculator(String username){
        sum(0,4);
        this.username = username;
    }
    public void sum(int a , int b){
        System.out.println(username+" Answer int : "+(a+b));
    }

    public void sum(double a , double b){
        System.out.println((username+" Answer double : "+(a+b)));
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
