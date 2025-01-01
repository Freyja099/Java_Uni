package Ex1;
import java.util.Scanner;
class Livre {
    // 1. Les attributs
    private String Titre;
    private String Auteur;
    private double Prix;

    // 2. Getters and Setters
    public void setTitre(String Titre){
        this.Titre = Titre;
    }
    public String getTitre(){
        return Titre;
    }

    public void setAuteur(String Auteur){
        this.Auteur = Auteur;
    }
    public String getAuteur(){
        return Auteur;
    }

    public void setPrix(double Prix){
        this.Prix = Prix;
    }
    public double getPrix(){
        return Prix;
    }

    // 3. Constructeur Surchargé
    public Livre(String Titre, String Auteur, double Prix){
        this.Titre = Titre;
        this.Auteur = Auteur;
        this.Prix = Prix;
    }

    // 4. Méthode Afficher
    public void Afficher(){
        System.out.println("Titre: " + Titre + " Auteur: " + Auteur + " Prix: " + Prix +"$");
    }
}

public class Main{

    public static Livre Saisir(Scanner scanner){
        System.out.println("Veuillez entrer un titre : ");
        String titre = scanner.nextLine();
        System.out.println("Veuillez entrer un Auteur : ");
        String auteur = scanner.nextLine();
        System.out.println("Veuillez entrer un prix : ");
        double prix = scanner.nextDouble();
        scanner.nextLine();
        Livre livre = new Livre(titre, auteur, prix);
        return livre;
    }

    public static void main(String[] args) {
        Livre livre = new Livre("White Nights", "Fyodor Dostoevsky", 6.99);
        Scanner scanner = new Scanner(System.in);
        Livre livre2 = Saisir(scanner);

        livre.Afficher();
        System.out.println("***************************************************");
        livre2.Afficher();

    }
}