public class Creature {

    private String name;
    private String story;

    public Creature(String name, String story) {
        this.name = name;
        this.story = story;
    }

    public Creature() {
        // this.name = "Nome di default";
        // this.story = "Storia di default";
        this("Nome di default", "Storia di default"); // Chiamo costruttore con parametri
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getStory() {
        return story;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public void info() {
        System.out.print("\nHai creato un ");
    }

    @Override
    public String toString() {
        return "NOME: " + this.name + "\n" +
                "STORIA: " + this.story + "\n";
    }
}