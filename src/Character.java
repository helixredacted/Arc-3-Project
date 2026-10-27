public abstract class Character {
    protected String name;
    protected int level;
    protected double EXP = 0;
    protected double health;
    protected double speed;

    public Character(String name, int level, double health, double speed) {
        this.name = name;
        this.level = level;
        this.health = health + 10 * level;
        this.speed = speed;
    }


    public abstract void basic();
    public abstract void skill();
    public abstract void special();
    public abstract void ultimate();


}
