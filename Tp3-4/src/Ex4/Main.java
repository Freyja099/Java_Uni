package Ex4;

import java.util.Vector;
public class Main {

    public static void main(String[] args) {
        // Création d'instances
        Figure f1 = new Figure(10, 20, 1);
        Carre c1 = new Carre(30, 40, 2, 15);
        Rectangle r1 = new Rectangle(50, 60, 3, 20, 10);
        Carre c2 = new Carre(70,80,4,10);
        Rectangle r2=new Rectangle(90,100,5,15,30);

        System.out.println("Tous les objets instanciés (Figure):");
        for(Figure figure : Figure.getInstances()){
            System.out.println(figure);
        }

        System.out.println("\nObjets de type Carré:");
        for (Figure carre : Carre.getInstances()){
            System.out.println(carre);
        }
        System.out.println("\nObjets de type Rectangle:");
        for(Figure rectangle : Rectangle.getInstances()){
            System.out.println(rectangle);
        }


    }
}