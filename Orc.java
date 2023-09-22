public class Orc extends Creature {
    LivelloOrc power;

    public Orc(String name, String story, LivelloOrc power) {
        super(name, story);
        this.power = power;
    }

    public Orc() {
        super();
        this.power = LivelloOrc.LOW;
    }

    // Getter
    public LivelloOrc getPower() {
        return power;
    }

    // Setter
    public void setPower(LivelloOrc power) {
        this.power = power;
    }

    public void info() {
        super.info();
        System.out.println("Orco !");
    }

    @Override
    public String toString() {
        return super.toString() +
                "NOME: " + this.power + "\n";
    }
}
