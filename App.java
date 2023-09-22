import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Che tipo di creatura desideri? \n Elf (E) oppure Orc (O) ?");
        String input = sc.nextLine();

        // sc.close();

        Creature creatura;

        System.out.println("NOME: ");
        String name = sc.nextLine();
        // creatura.setName(name);

        System.out.println("STORIA: ");
        String story = sc.nextLine();
        // creatura.setStory(story);

        if (input.equals("E")) {
            System.out.println("ETA: ");
            int age = sc.nextInt();
            // creatura.setAge(age);

            creatura = new Elf(name, story, age);
        } else {
            // System.out.println("POTENZA: ");
            // LivelloOrc power = sc.nextInt();
            // creatura.setPower(power);

            creatura = new Orc(name, story, LivelloOrc.HIGH); // da cambiare
        }
        creatura.info();
        System.out.println(creatura.toString());
    }

}

// super. serve a chiamre prima il metodo del padre e poi quello da
// reimplementare
// vale anche per i costruttori