package homework.v3.dataAccess;

public class HibernateDao implements IBaseDao {
    @Override
    public void add() {
        System.out.println("Course added using hibernate.");
    }
}
