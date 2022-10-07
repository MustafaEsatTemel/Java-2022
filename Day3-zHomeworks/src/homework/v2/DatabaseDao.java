package homework.v2;

public abstract class DatabaseDao {
   abstract void add();
   public void save(){
       System.out.println("Default saver.");
   }

   //Inner Classes
   class Esad{
      String name = "esad";
   }

   static class MESAD{
       static String name = "elma";
   }
}
