package Ex1;

public abstract class Personne {
    protected String nom;
    protected String prenom;
    protected String rue;
    protected String ville;
    protected static int nbPersonnes = 0;

    public Personne (String nom, String prenom, String rue, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.ville = ville;
        nbPersonnes++;
    }

    public static void nbPersonnes(){
        System.out.println("Nombre de personnes : " + nbPersonnes);
    }

    public void modifierPersonne(String rue , String ville){
        this.rue = rue;
        this.ville = ville;
        this.ecrirePersonne();
    }

    @Override
    public String toString() {
        return nom + " " + prenom + ", " + rue + " " + ville;
    }
    public abstract void ecrirePersonne();
}


