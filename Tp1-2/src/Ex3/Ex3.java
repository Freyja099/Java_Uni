package Ex3;
import java.util.Scanner;

class Compte{
    private String ClientName;
    private double balance;

    public Compte(String nomClient , double solde){
        this.ClientName = nomClient;
        this.balance = solde;
    }

    // * Verser
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println( " Versement de " + amount + " à été effectué");
        }
        else
            System.out.println("Impossible de verser un montant négatif");
    }

    // * Débiter
    public void withdraw(double amount){
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println(" Débit de " + amount + " à été effectué" );
        }
        else if (amount > balance && amount > 0)
            System.out.println(" Votre solde est insuffisants de faire cette opération \n Solde : " + balance);

        else
            System.out.println(" Veuillez entrer un montant positif ");
    }

    public void DisplayStateAccount(){
        System.out.println("Nom Client : " + this.ClientName + " \n Balance : " + this.balance);
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Compte compte = null;

        int choice;

        do {
            System.out.println("----------------MENU----------------");
            System.out.println(" 1- Crée un compte");
            System.out.println(" 2- Faire un versement ");
            System.out.println(" 3- Faire un débit ");
            System.out.println(" 4- Afficher l'état de mon compte");
            System.out.println(" 0- Quitter");
            System.out.println(" Choisissez une option : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (compte == null) {
                        System.out.println(" Entrer le nom du client ");
                        String ClientName = scanner.nextLine();

                        compte = new Compte(ClientName, 0);
                        System.out.println(" Compte crée pour " + ClientName);
                    } else
                        System.out.println("Le compte existe déjà");
                    break;

                case 2:
                    if (compte == null)
                        System.out.println(" Veuillez créer un compte d'abord ");
                    else {
                        System.out.println("Entrer le montant à verser : ");
                        double montant = scanner.nextDouble();
                        scanner.nextLine();
                        compte.deposit(montant);
                    }
                    break;

                case 3:
                    if (compte == null)
                        System.out.println(" Veuillez créer un compte d'abord ");
                    else {
                        System.out.println("Entrer le montant à débiter");
                        double montant = scanner.nextDouble();
                        scanner.nextLine();
                        compte.withdraw(montant);
                    }
                    break;

                case 4:
                    if (compte == null)
                        System.out.println(" Veuillez créer un compte d'abord ");
                    else {
                        compte.DisplayStateAccount();
                    }
                    break;

                case 0:
                    break;

                default:
                    System.out.println(" choix invalide ! ");

            }

        }while (choice != 0);

        scanner.close();

    }
}

