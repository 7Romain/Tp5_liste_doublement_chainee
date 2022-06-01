package fr.oz;

/**
 * Hello world!
 *
 */
public class App {

    static String phrase[] = { "Les", "listes", "doublement chaînée", "en", "Java", "ce n'est qu'une", "question", "de",
            "références" };

    public static void main(String[] args) {
        Chaine chaineDouble = new Chaine();
        for (String i : phrase) {
            System.out.println(i);
            chaineDouble.ajouterMaillon(i);

        }
        chaineDouble.afficherChaineRetour();
    }
}
