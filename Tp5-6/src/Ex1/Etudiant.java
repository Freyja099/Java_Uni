package Ex1;

public class Etudiant extends Personne{
    private String diplomeEnCours;
    private static int nbEtudiant = 0;

    public Etudiant(String nom, String prenom, String rue, String ville , String diplomeEnCours) {
        super(nom, prenom, rue, ville);
        this.diplomeEnCours = diplomeEnCours;
        nbEtudiant++;
    }

    public static int getNbEtudiant() {
        return nbEtudiant;
    }

    @Override
    public void ecrirePersonne(){
        System.out.println("Etudiant : " + this);
    }

    @Override
    public String toString() {
        return super.toString() + " diplome : " + diplomeEnCours;
    }
}

