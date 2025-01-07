package Ex2;

public class Cercle extends ObjetGraphique {
    private double rayon;

    public Cercle() {
        this(0, 0, 1.0);
    }

    public Cercle(int x, int y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    public Cercle(Cercle c) {
        this(c.x, c.y, c.rayon);
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public void affiche() {
        System.out.println("Cercle [x=" + x + ", y=" + y + ", rayon=" + rayon + "]");
    }
}