
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   static ArrayList<book> livres = new ArrayList<>();

    static Scanner ser = new Scanner(System.in);

    public static void Ajouter() {



        book books = new book();
        System.out.println("Entre l'Isbn: ");
        int Isbn = ser.nextInt();
        ser.nextLine();
        System.out.println("Entre le titre: ");
        String titre = ser.nextLine();
        System.out.println("Entre l'auteur: ");
        String auteur = ser.nextLine();
        System.out.println("Entre la disponibilté (vrai/faux)");
        boolean dispo = ser.nextBoolean();
        livres.add(books);
    }
    public static void Afficher(){
        for(int i=0;i<livres.size();i++) {
            System.out.println(livres.get(i).toString());
        }
    }

    public static void main(String[] args) {
        int choix;
        do {
            System.out.println("Menu: ");
            System.out.println(" 1-Ajouter");
            System.out.println(" 2-Afficher");
            System.out.println(" 3-Modifier");
            System.out.println(" 4-Supprimer");
            System.out.println(" 5-quitter");
            System.out.println(" choisissez une option");
            choix = ser.nextInt();

            switch (choix) {
                case 1:
                    Ajouter();
                    break;
                case 2:
                    Afficher();
                    break;
                case 3:
                    System.out.println("au revoir !!");

            }
        } while (choix != 3);
    }
}