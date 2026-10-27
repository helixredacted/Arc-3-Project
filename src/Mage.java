import java.util.Random;

public class Mage extends Character{
    Random rand = new Random();

    String[] tomeList = {"fire", "ice", "poison", "electric"};
    int min = 0;
    int max = tomeList.length - 1;

    private String startingTome;
    private String currentTome;

    public Mage(String name, int level){
        super(name, level, 100, 55);
        this.startingTome = tomeList[rand.nextInt((max - min) + 1)+ min];
    }

    //Mage deals single target damage
    @Override
    public void basic() {

    }

    //Mage switches the elemental type of their tome
    //(1 skill point)
    @Override
    public void skill() {

    }

    //Mage uses elemental abilities dependent on the active tome
    //(1 skill point)
    @Override
    public void special() {

    }

    @Override
    public void ultimate() {

    }
}
