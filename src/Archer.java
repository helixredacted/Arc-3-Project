public class Archer extends Character{

    private int arrows;
    private int charge;

    public Archer(String name, int level){
        super(name, level, 95, 65);
        this.arrows = 8;
        this.charge = 0;
    }

    //Ranger deals single target damage
    @Override
    public void basic() {

    }

    //Ranger charges his arrow up to 3 times multiplying damage to a single target
    //(1 - 3 skill points)
    @Override
    public void skill() {

    }
    //Ranger uses arrows to make an arrow rain randomly hitting enemies
    //(1 skill point) (consumes arrows)
    @Override
    public void special() {

    }

    //
    @Override
    public void ultimate() {

    }
}
