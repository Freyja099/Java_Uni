package Ex4;

import java.util.Vector;

public class Rectangle extends Figure {
    private int longueur;
    private int largeur;


    public Rectangle(int abscisse, int ordonnee, int couleur, int longueur, int largeur) {
        super(abscisse, ordonnee, couleur);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public int getLongueur() {
        return longueur;
    }
    public int getLargeur() {
        return largeur;
    }

    @Override
    public String toString() {
        return "Rectangle : [Abscisse : " + getAbscisse() + ", Ordonnée : " + getOrdonnee() + ", Couleur : " + getCouleur() + ", Longueur : " + longueur + ", Largeur : " + largeur + "]";
    }
    public static Vector<Figure> getInstances() {
        Vector<Figure> rectangleInstances = new Vector<>();
        for (Figure figure : Figure.getInstances()) {
            if (figure instanceof Rectangle) {
                rectangleInstances.add(figure);
            }
        }
        return rectangleInstances;
    }
}