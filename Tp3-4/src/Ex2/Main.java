package Ex2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class Employee{
    // 1. Attributs
    private String Matricule;
    private String Nom;
    private String Prenom;
    private int AnneeNaissance;
    private int AnneeEmbauche;
    private double Salaire;

    // 2. Getters and Setters
    public void setMatricule(String Matricule) {
        this.Matricule = Matricule;
    }
    public String getMatricule() {
        return Matricule;
    }
    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    public String getNom() {
        return Nom;
    }
    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }
    public String getPrenom() {
        return Prenom;
    }
    public void setAnneeNaissance(int AnneeNaissance) {
        this.AnneeNaissance = AnneeNaissance;
    }
    public int getAnneeNaissance() {
        return AnneeNaissance;
    }
    public void setAnneeEmbauche(int AnneeEmbauche) {
        this.AnneeEmbauche = AnneeEmbauche;
    }
    public int getAnneeEmbauche() {
        return AnneeEmbauche;
    }
    public void setSalaire(double Salaire) {
        this.Salaire = Salaire;
    }
    public double getSalaire() {
        return Salaire;
    }

    // 3. Constructeur
    public Employee(String Matricule , String Nom , String Prenom , int AnneeNaissance , int AnneeEmbauche , double Salaire) {
        this.Matricule = Matricule;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.AnneeNaissance = AnneeNaissance;
        this.AnneeEmbauche = AnneeEmbauche;
        this.Salaire = Salaire;
    };

    // 4. Methode : getAnciennete() retourne le nombre d'annees d'ancienneté de l'employé
    public int getAnciennete(){
        LocalDate now = LocalDate.now();
        return Period.between(LocalDate.of(this.AnneeEmbauche, 1, 1),
                LocalDate.of(now.getYear(), now.getMonth(), now.getDayOfMonth())).getYears();
    }

    // 5. Methode : getAge()
    public int getAge(){
        LocalDate now = LocalDate.now();
        return Period.between(LocalDate.of(this.AnneeNaissance, 1, 1),
                LocalDate.of(now.getYear(), now.getMonth(), now.getDayOfMonth())).getYears();
    }

    // 6. Methode : AugmentationDuSalaire()
    public void AugmentationDuSalaire() {
        int anciennete = getAnciennete();
        if (anciennete < 5) {
            this.Salaire *= 1.02;  // 2%
        } else if (anciennete < 10) {
            this.Salaire *= 1.05; // 5%
        } else {
            this.Salaire *= 1.10; // 10%
        }
    }

    // 7. Methode : Afficher()
    public void Afficher(){
        System.out.println("-----------------------------------------------------");
        System.out.println("Matricule : " + Matricule
        + "\nNom : " + Nom
        + "\nPrenom : " + Prenom
        + "\nAnneeNaissance : " + AnneeNaissance
        + "\nAnneeEmbauche : " + AnneeEmbauche
        + "\nSalaire : " + Salaire
        + "\nAncienneté : " + getAnciennete()
        + "\nAge : " + getAge()
        );
        System.out.println("-----------------------------------------------------");
    }
}

public class Main {
    public static Employee Saisir(Scanner scanner) {
        System.out.print("Entrez le matricule de l'employé : ");
        String matricule = scanner.nextLine();
        System.out.print("Entrez le nom de l'employé : ");
        String nom = scanner.nextLine();
        System.out.print("Entrez le prénom de l'employé : ");
        String prenom = scanner.nextLine();
        int anneeNaissance;
        while (true) {
            try {
                System.out.print("Entrez l'année de naissance de l'employé : ");
                anneeNaissance = Integer.parseInt(scanner.nextLine());
                if (anneeNaissance >= 1900 && anneeNaissance <= LocalDate.now().getYear()) {
                    break;
                } else
                    System.out.println("L'année de naissance doit être entre 1900 et l'année actuelle");
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer une année valide");
            }

        }
        int anneeEmbauche;
        while (true) {
            try{
                System.out.print("Entrez l'année d'embauche de l'employé : ");
                anneeEmbauche = Integer.parseInt(scanner.nextLine());
                if(anneeEmbauche >= 1900 && anneeEmbauche <= LocalDate.now().getYear()){
                    break;
                }else{
                    System.out.println("L'année d'embauche doit être entre 1900 et l'année actuelle");
                }
            }catch (NumberFormatException e){
                System.out.println("Veuillez entrer une année valide");
            }
        }
        System.out.println("Entrez le salaire de l'employé");
        double salaire = scanner.nextDouble();
        scanner.nextLine();

        return new Employee (matricule,nom,prenom,anneeNaissance,anneeEmbauche,salaire);
    }

    public static void main(String[] args) {
        Employee Employee1 = new Employee ( "AAAAA01", "Gogh" , "Van" , 1978 , 2014 , 70000.00);
        Employee1.Afficher();

        Employee1.AugmentationDuSalaire();
        Employee1.Afficher();


        Scanner scanner = new Scanner(System.in);

        Employee Employee2 = Saisir(scanner);
        Employee2.Afficher();

        Employee2.AugmentationDuSalaire();
        Employee2.Afficher();

    }
}
