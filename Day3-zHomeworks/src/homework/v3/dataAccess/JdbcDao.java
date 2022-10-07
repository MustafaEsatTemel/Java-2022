package homework.v3.dataAccess;

public class JdbcDao implements IBaseDao{
    @Override
    public void add() {
        System.out.println("Course added using JDBC.");
    }
}
