public class Warrior extends Character{

    private int tauntValue;
    boolean taunt;

    public Warrior(String name, int level){
        super(name, level, 120, 45);
        this.tauntValue = 0;
        this.taunt = false;

    }

    //Warrior deals single target damage
    @Override
    public void basic() {

    }

    //Warrior receives taunt and a large shield
    //(1 skill point)
    @Override
    public void skill() {

    }

    //Warrior makes blast attack that deals heavy damage to the main target and minor damage to the adjacent
    //(1 skill point) (consumes health)
    @Override
    public void special() {

    }

    //Warrior makes a full AoE attack and heals themself
    @Override
    public void ultimate() {

    }
}
