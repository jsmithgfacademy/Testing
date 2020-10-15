
/**
 * This class, CatTalk USES class Cat
 * 
 * Complete the main method:
 * 
 * Create 2 instances of Cat using the Cat constructor
 * cat 1 should be named "Winter" and be 7 years old
 * cat 2 should be named "Tilly" and be 10 years old
 * 
 * Write code using the Cat class methods to show this:
 * 
 * Winter says meow
 * Tilly says meow, meow
 *
 * @author J. Smith
 * @version October 2020
 */
public class CatTalk
{
    public static void main (String [] args)
    {
        Cat winter = new Cat ("Winter", 7);
        Cat tilly = new Cat ("Tilly", 10);
        String wname = winter.getName();
        System.out.print(wname + " says");
        winter.meow();
        String tname = tilly.getName();
        System.out.print(tname + " says");
        tilly.meow();
        tilly.meow();
    }
}
