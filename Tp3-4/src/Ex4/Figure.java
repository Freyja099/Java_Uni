package Ex4;

import java.util.Vector;

public class Figure {
    private int abscisse;
    private int ordonnee;
    private int couleur;

    private static Vector<Figure> instances = new Vector<>();

    public Figure(int abscisse, int ordonnee, int couleur) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
        this.couleur = couleur;
        instances.add(this);
    }

    public int getAbscisse() {
        return abscisse;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    public int getCouleur() {
        return couleur;
    }

    public static Vector<Figure> getInstances() {
        return instances;
    }
    @Override
    public String toString() {
        return "Figure : [Abscisse : " + abscisse + ", Ordonnée : " + ordonnee + ", Couleur : " + couleur + "]";
    }
}