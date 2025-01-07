package Ex2;

public class Rectangle extends ObjetGraphique {
    private double largeur;
    private double hauteur;

    public Rectangle() {
        this(0, 0, 1.0, 1.0);
    }

    public Rectangle(int x, int y, double largeur, double hauteur) {
        super(x, y);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public Rectangle(Rectangle r) {
        this(r.x, r.y, r.largeur, r.hauteur);
    }

    public double getHauteur() {
        return hauteur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setTaille(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public void affiche() {
        System.out.println("Rectangle [x=" + x + ", y=" + y + ", largeur=" + largeur + ", hauteur=" + hauteur + "]");
    }
}