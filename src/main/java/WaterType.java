public class WaterType extends Pokemon {

    public int attackLevel;

    public WaterType(String name, int attackLevel) {
        super(name);
        this.attackLevel = attackLevel;
    }

    @Override
    public void attack()
    {
        System.out.println("Water blast attack from " + super.name + "... blast!!! attack level: " + attackLevel);
    } 

}