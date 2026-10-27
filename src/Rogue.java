public class Rogue extends Character{

    boolean invisible;
    boolean hasTarget;

    public Rogue(String name, int level){
        super(name, level, 80, 70);
        boolean invisible = false;
        boolean hasTarget = false;
    }

    //Rogue deals single target damage
    @Override
    public void basic() {

    }

    //Rouge turns invisible
    //(1 skill point) (becomes untargetable)

    //(Alternate)
    //Rouge declares a target and deals enhanced damage on that target with any attack
    //(1 skill point)
    @Override
    public void skill() {

    }

    //Rouge does 3 separate coordinated attacks on singular targets
    //(1 skill point)
    @Override
    public void special() {

    }

    //
    @Override
    public void ultimate() {

    }
}
