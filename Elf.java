public class Elf extends Creature {
    int age;

    public Elf(String name, String story, int age) {
        super(name, story);
        this.age = age;
    }

    public Elf() {
        super();
        this.age = 42;
    }

    // getter
    public int getAge() {
        return age;
    }

    // setter
    public void setAge(int age) {
        this.age = age;
    }

    public void info() {
        super.info();
        System.out.println("Elfo !");
    }

    @Override
    public String toString() {
        return super.toString() +
                "ETA: " + this.age + "\n";
    }
}
