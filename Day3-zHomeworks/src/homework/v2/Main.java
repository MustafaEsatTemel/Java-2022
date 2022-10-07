package homework.v2;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator("esad");
        c.sum(1,2.0);

        DatabaseDao.Esad a = new SqlServerDao().new Esad();
        System.out.println(a.name);
    }
}
