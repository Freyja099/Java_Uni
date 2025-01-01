package Ex4;

import java.util.Vector;

public class Carre extends Figure {
    private int longueurCote;

    public Carre(int abscisse, int ordonnee, int couleur, int longueurCote) {
        super(abscisse, ordonnee, couleur);
        this.longueurCote = longueurCote;
    }

    public int getLongueurCote() {
        return longueurCote;
    }

    @Override
    public String toString() {
        return "Carre : [Abscisse : " + getAbscisse() + ", Ordonnée : " + getOrdonnee() +
                ", Couleur : " + getCouleur() + ", LongueurCote : " + longueurCote +"]";
    }


    public static Vector<Figure> getInstances() {
        Vector<Figure> carreInstances = new Vector<>();
        for (Figure figure : Figure.getInstances()) {
            if (figure instanceof Carre) {
                carreInstances.add(figure);
            }
        }
        return carreInstances;
    }
}