public class FireType extends Pokemon {

    public int attackLevel;

    public FireType(String name, int attackLevel) {
        super(name);
        this.attackLevel = attackLevel;
    }

    @Override
    public void attack()
    {
        System.out.println(super.name + " attacks with FlameThrower!!!! attack level: " + attackLevel);
    } 

}