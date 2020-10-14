
/**
 * class Cat represents a 
 * pet cat object and stores
 * some information about the cat.
 *
 * @author J. Smith
 * @version October 2020
 */
public class Cat
{
    private String name;
    private int age;

    /**
     * Construct a cat with the given name and age
     */
    public Cat(String petName, int age)
    {
        this.name = petName;
        this.age = age;
    }

    public void meow ()
    {
        System.out.println("meow");
    }
    
    public String getName ()
    {
        return name;
    }
}
