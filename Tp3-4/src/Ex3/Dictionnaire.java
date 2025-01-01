package Ex3;

public class Dictionnaire extends Document{
    private String langue;
    private int nombreTomes;

    public Dictionnaire(String numeroEnregistrement, String titre, String langue, int nombreTomes) {
        super(numeroEnregistrement, titre);
        this.langue = langue;
        this.nombreTomes = nombreTomes;
    }

    public String getLangue() {
        return langue;
    }

    public int getNombreTomes() {
        return nombreTomes;
    }

    @Override
    public String toString() {
        return "Dictionnaire [numeroEnregistrement=" + super.getNumeroEnregistrement() +
                ", titre=" + super.getTitre() + ", langue=" + langue + ", nombreTomes=" + nombreTomes + "]";
    }
}