package Ex3;

public class Document {
    private String numeroEnregistrement;
    private String titre;

    public Document(String numeroEnregistrement, String titre) {
        this.numeroEnregistrement = numeroEnregistrement;
        this.titre = titre;
    }

    public String getNumeroEnregistrement() {
        return numeroEnregistrement;
    }

    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return "Document [numeroEnregistrement=" + numeroEnregistrement + ", titre=" + titre + "]";
    }
}
