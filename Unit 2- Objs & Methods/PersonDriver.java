public class PersonDriver {
    
    public static void main() {
    Person Annie;
    Person Robot;
    Person StupidBaby;
    
    Annie = new Person("Annie", 15, true);
    Robot = new Person("Robbie", 10000000, false);
    StupidBaby = new Person("Kys", 0, true);
    
    Annie.birthday();
    Robot.funeral();
    StupidBaby.birthday();
    }
    
}