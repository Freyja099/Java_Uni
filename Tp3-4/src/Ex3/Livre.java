package Ex3;

public class Livre extends Document {
    private String auteur;
    private int nombrePages;

    public Livre(String numeroEnregistrement, String titre, String auteur, int nombrePages) {
        super(numeroEnregistrement, titre);
        this.auteur = auteur;
        this.nombrePages = nombrePages;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    @Override
    public String toString() {
        return "Livre [numeroEnregistrement=" + super.getNumeroEnregistrement() + ", titre=" + super.getTitre() + ", auteur=" + auteur + ", nombrePages=" + nombrePages + "]";
    }
}
