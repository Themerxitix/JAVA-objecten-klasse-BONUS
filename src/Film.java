public class Film
{
    private String titel;
    private String regisseur;
    private String releasedatum;
    private String genre;

    public Film(String titel, String regisseur, String releasedatum, String genre) {
        this.titel = titel;
        this.regisseur = regisseur;
        this.releasedatum = releasedatum;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Film {" +
                "titel='" + titel + '\'' +
                ", regisseur='" + regisseur + '\'' +
                ", releasedatum='" + releasedatum + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
