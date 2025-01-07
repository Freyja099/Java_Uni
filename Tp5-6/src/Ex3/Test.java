package Ex3;

public class Test {
    public static void main(String[] args) {
        Magasin magasin = new Magasin(2, 2);

        ArticleElectromenager laveLinge = new ArticleElectromenager("Lave-linge", "Samsung", 300, 500);
        laveLinge.remplirStock(10);
        magasin.ajouterElectromenager(laveLinge, 0);

        ArticlePrimeur pommes = new ArticlePrimeur("Pommes", "Fermier Local", 1.5, 3.0);
        pommes.remplirStock(100);
        magasin.ajouterPrimeur(pommes, 0);

        laveLinge.vendre(3);
        pommes.vendre(20.5);

        laveLinge.lanceSolde(10);
        laveLinge.vendre(2);

        System.out.println(magasin);
    }
}
