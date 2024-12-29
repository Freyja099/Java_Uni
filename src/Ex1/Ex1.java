package Ex1;

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double prixHT , prixTTC , montantRemise , montantFinal;
        double tauxTVA = 0.186;

        System.out.println("Entrer le prix hors taxe : ");
        prixHT = scanner.nextDouble();

        prixTTC = prixHT * (tauxTVA + 1);

        double tauxRemise = calculerTauxRemise(prixTTC);
        montantRemise = prixTTC * tauxRemise;
        montantFinal = prixHT - montantRemise;

        System.out.println("Prix hors taxe : " + prixHT + "DHs");
        System.out.println("Taux de TVA : " + (tauxTVA * 100) + " % ");
        System.out.println("Prix TTC : " + prixTTC + "DHs");
        System.out.println("Taux de remise : " + (tauxRemise * 100) + " % ");
        System.out.println("Montant de la remise : " + montantRemise + "DHs");
        System.out.println("Montant final = " + montantFinal + "DHs");

        scanner.close();

    }

    // Le taux de remise en fonction du prix TTC
    public static double calculerTauxRemise(double prixTTC) {
        double tauxRemise;

        if (prixTTC < 1000)
            tauxRemise = 0.0;
        else if (prixTTC >= 1000 && prixTTC < 2000)
            tauxRemise = 0.01;
        else if (prixTTC >= 2000 && prixTTC < 5000)
            tauxRemise = 0.03;
        else
            tauxRemise = 0.05;

        return tauxRemise;
    }
}