package Ex4;

import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre d'étudiants dans la classe : ");
        int nombreEtudiants = scanner.nextInt();
        scanner.nextLine();

        // * Création du tableau de notes
        double[] notes = new double[nombreEtudiants];

        // * Lecture des notes
        System.out.println("Entrez les notes des étudiants : ");
            for (int i = 0; i < nombreEtudiants; i++) {
                System.out.print("Note de l'étudiant " + (i + 1) + " : ");
                notes[i] = scanner.nextDouble();
                scanner.nextLine();

                while (notes[i] < 0 || notes[i] > 20) {
                    System.out.println("Note invalide. Veuillez entrer une note entre 0 et 20.");
                    System.out.print("Note de l'étudiant " + (i + 1) + " : ");
                    notes[i] = scanner.nextDouble();
                    scanner.nextLine();
                }
            }

        // * Calcul de la moyenne
        double moyenne = calculerMoyenne(notes);
        System.out.println("La moyenne de la classe est : " + moyenne);

        // * Détermination du nombre d'étudiants au-dessus de la moyenne
        int nombreEtudiantsAuDessus = compterEtudiantsAuDessus(notes, moyenne);
        System.out.println("Nombre d'étudiants ayant une note supérieure à la moyenne : " + nombreEtudiantsAuDessus);

        scanner.close();
    }

    // * Méthode pour calculer la moyenne
    public static double calculerMoyenne(double[] notes) {
        if (notes.length == 0) return 0;
        double somme = 0;
        for (double note : notes) {
            somme += note;
        }
        return somme / notes.length;
    }

    // * Méthode pour compter le nombre d'étudiants au-dessus de la moyenne
    public static int compterEtudiantsAuDessus(double[] notes, double moyenne) {
        int count = 0;
        for (double note : notes) {
            if (note > moyenne) {
                count++;
            }
        }
        return count;

    }
}
