
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   static ArrayList<Book> livres = new ArrayList<>();
   static Scanner ser = new Scanner(System.in);

    public static void Ajouter() {

        System.out.println("Entre l'Isbn: ");
        String Isbn = ser.next();
        System.out.println("Entre le titre: ");
        String titre = ser.next();
        ser.nextLine();
        System.out.println("Entre l'auteur: ");
        String auteur = ser.nextLine();
        System.out.println("Entre la disponibilté (true/false)");
        boolean dispo = ser.nextBoolean();

        livres.add(new Book(titre, auteur, dispo, Isbn));
    }
    public static void Afficher() {
        for (int i = 0; i < livres.size(); i++) {
            System.out.println(livres.get(i).toString());
        }
    }
    public static void Rechercher() {
        System.out.println(" Entre l'isbn: ");
        String Isbn = ser.next();
        for (Book livres : livres) {
            if (livres.getIsbn().equals(Isbn)) {
                System.out.println(livres);
            }
        }
    }
    public static void Supprimer(){
        System.out.println("Entre l'Isbn:");
        String Isbn = ser.next();
        for(int i = 0; i< livres.size();i++){
            Book livre = livres.get(i);
            if(livre.getIsbn().equals(Isbn)){
                livres.remove(i);
                System.out.println("livre supprimé.");
                return;
            }
        }
        System.out.println("livre non trouvé");
    }

    public static void main(String[] args) {
        Book book = new Book();
        int choix;
        do {
            System.out.println("Menu: ");
            System.out.println(" 1-Ajouter");
            System.out.println(" 2-Afficher");
            System.out.println(" 3-Rechercher");
            System.out.println(" 4-Supprimer");
            System.out.println(" 5-Modifier");
            System.out.println(" 6-quitter");
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
                    Rechercher();
                    break;
                case 4:
                    Supprimer();
                    break;
                case 5:
                    System.out.println("au revoir !!");
                    break;

            }
        } while (choix != 4);
    }
}