
/**
 * Write a description of class TopLevel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TopLevel
{
    public static void startHere()
    {
        TestHello.sayWhat(); // call to static method
        int abs = Math.abs(-1);
        TestHello instance1 = new TestHello();
        instance1.sayHi(); // call class method       
    }
}
