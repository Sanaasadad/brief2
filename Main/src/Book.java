public class Book {
    private String titre, auteur;
    private boolean dispo;
    private String Isbn;

    public Book(String titre, String auteur, boolean dispo, String isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.dispo = dispo;
        Isbn = isbn;
    }

    public Book() {

    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    @Override
    public String toString() {
        return "book{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", dispo=" + dispo +
                ", Isbn=" + Isbn +
                '}';
    }
}



