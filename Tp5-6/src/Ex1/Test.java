package Ex1;

public class Test {
    public static void main(String[] args) {
        Secretaire s = new Secretaire("Said", "Abidi", "Rue Elamal", "Casablanca", "A123");
        s.ecrirePersonne();

        Enseignant e = new Enseignant("Ahmed", "Sbihi", "Rue Bel Air", "Fès", "Informatique");
        e.ecrirePersonne();

        Etudiant e1 = new Etudiant("Samir", "Merras", "Rue Saules", "Oujda", "Licence Informatique");
        e1.ecrirePersonne();
        Etudiant e2 = new Etudiant("Hamid", "Nissani", "Rue d’Olivier", "Taza", "DUT Informatique");
        e2.ecrirePersonne();

        e.modifierPersonne("Rue du Grenadier", "Rabat");
        s.modifierPersonne("Rue Taounat", "Safi");

        Personne.nbPersonnes();
        System.out.println("Nombre de secrétaires : " + Secretaire.getNbSecretaire());
        System.out.println("Nombre d'enseignants : " + Enseignant.getNbEnseignants());
        System.out.println("Nombre d'étudiants : " + Etudiant.getNbEtudiant());
    }
}
