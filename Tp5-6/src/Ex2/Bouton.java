package Ex2;

public class Bouton extends Rectangle {
        private String text;

        public Bouton() {
            this(0, 0, 1.0, 1.0, "");
        }

        public Bouton(int x, int y, double largeur, double hauteur, String text) {
            super(x, y, largeur, hauteur);
            this.text = text;
        }

        public Bouton(Bouton b) {
            this(b.x, b.y, b.getLargeur(), b.getHauteur(), b.text);
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        @Override
        public void affiche() {
            System.out.println("Bouton [x=" + x + ", y=" + y + ", largeur=" + getLargeur() + ", hauteur=" + getHauteur() + ", text=\"" + text + "\"]");
        }
    }
