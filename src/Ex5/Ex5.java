package Ex5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            // * Lecture de la taille du tableau

            System.out.print("Entrez la taille du tableau : ");
            int taille = scanner.nextInt();
            scanner.nextLine();

            // * Création du tableau
            int[] tableau = new int[taille];

            // * Lecture des éléments du tableau
            System.out.println("Entrez les éléments du tableau :");
            for (int i = 0; i < taille; i++) {
                System.out.print("Élément " + (i + 1) + " : ");
                tableau[i] = scanner.nextInt();
                scanner.nextLine();
            }

            int maximum = trouverMaximum(tableau);

            System.out.println("Le maximum du tableau est : " + maximum);

            scanner.close();
        }

        // * Méthode pour trouver le maximum d'un tableau
        public static int trouverMaximum(int[] tableau) {
            if (tableau.length == 0) {
                throw new IllegalArgumentException("Le tableau ne doit pas être vide");
            }
            int max = tableau[0]; // * Initialize the array with the first element
            for (int i = 1; i < tableau.length; i++) {
                if (tableau[i] > max) {
                    max = tableau[i];
                }
            }
            return max;
        }

}
