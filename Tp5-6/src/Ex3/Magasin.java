package Ex3;

public class Magasin {
    private double depense;
    private double revenu;

    private ArticleElectromenager[] electromenagers;
    private ArticlePrimeur[] primeurs;

    public Magasin(int capaciteElectromenagers, int capacitePrimeurs) {
        this.electromenagers = new ArticleElectromenager[capaciteElectromenagers];
        this.primeurs = new ArticlePrimeur[capacitePrimeurs];
    }

    public void ajouterElectromenager(ArticleElectromenager article, int index) {
        if (index < electromenagers.length) {
            electromenagers[index] = article;
            depense += article.prixAchat;
        }
    }

    public void ajouterPrimeur(ArticlePrimeur article, int index) {
        if (index < primeurs.length) {
            primeurs[index] = article;
            depense += article.prixAchat;
        }
    }

    public double rendement() {
        return (revenu - depense) / depense * 100;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Magasin:\n");
        sb.append("Depense: ").append(depense).append(", Revenu: ").append(revenu).append(", Rendement: ").append(rendement()).append("%\n");

        sb.append("Electroménagers:\n");
        for (ArticleElectromenager a : electromenagers) {
            if (a != null) sb.append(a).append("\n");
        }

        sb.append("Primeurs:\n");
        for (ArticlePrimeur p : primeurs) {
            if (p != null) sb.append(p).append("\n");
        }

        return sb.toString();
    }
}