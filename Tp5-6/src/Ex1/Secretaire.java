package Ex1;

public class Secretaire extends Personne{
    private String numeroBureau;
    private static int nbSecretaire = 0;

    public Secretaire(String nom, String prenom , String rue , String ville , String numeroBureau){
        super(nom, prenom, rue, ville);
        this.numeroBureau = numeroBureau;
        nbSecretaire++;
    }

    public static int getNbSecretaire(){
        return nbSecretaire;
    }

    @Override
    public void ecrirePersonne(){
        System.out.println("Secretaire : " + this );
    }

    @Override
    public String toString(){
        return super.toString() + "\nBureau : " + this.numeroBureau;
    }
}
