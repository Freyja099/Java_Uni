package Ex6;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String displayPoint() {
        return "(" + x + ", " + y + ")";
    }
}

public class Ex6 {
    public static void main(String[] args) {

        Point[][] matriceDePoints;


        matriceDePoints = new Point[2][];

        matriceDePoints[0] = new Point[2];
        matriceDePoints[1] = new Point[3];


        Point p1, p2, p3, p4, p5;


        p1 = new Point(10, 15);
        p2 = new Point(11, 16);
        p3 = new Point(12, 17);
        p4 = new Point(13, 18);
        p5 = new Point(14, 19);


        matriceDePoints[0][0] = p1;
        matriceDePoints[0][1] = p2;
        matriceDePoints[1][0] = p3;
        matriceDePoints[1][1] = p4;
        matriceDePoints[1][2] = p5;


        System.out.println("Matrice des points :");

        for (int i = 0; i < matriceDePoints.length; i++) {
            System.out.print("Tableau " + (i+1) + ": ");
            for (int j = 0; j < matriceDePoints[i].length; j++) {
                System.out.print(matriceDePoints[i][j].displayPoint() + " ");
            }
            System.out.println();
        }
    }
}
