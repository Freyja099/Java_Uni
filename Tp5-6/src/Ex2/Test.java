package Ex2;

public class Test {
    public static void main(String[] args) {
        ObjetGraphique[] objets = new ObjetGraphique[3];

        objets[0] = new Rectangle(10, 20, 50.0, 100.0);
        objets[1] = new Bouton(30, 40, 60.0, 20.0, "OK");
        objets[2] = new Cercle(15, 25, 10.0);

        for (ObjetGraphique obj : objets) {
            obj.affiche();
        }
    }
}
