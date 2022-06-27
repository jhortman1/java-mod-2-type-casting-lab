public class Pokemon {
    protected String name;

    public Pokemon(String name)
    {
        this.name = name;
    }     

    public void sayHi()
    {
        System.out.println("Hi my name is " + name + " and I am a Pokemon.");
    }

    public void attack()
    {
        System.out.println(name + " attacks!!!");
    }
}