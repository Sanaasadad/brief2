public class book {
    private String titre, auteur;
    private boolean dispo;
    private int Isbn;

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



