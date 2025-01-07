package Ex3;

public class ArticleElectromenager extends Article implements VendablePiece, Solde {
    private int stock;

    public ArticleElectromenager(String nom, String fournisseur, double prixAchat, double prixVente) {
        super(nom, fournisseur, prixAchat, prixVente);
        this.stock = 0;
    }

    public void remplirStock(int quantite) {
        this.stock += quantite;
    }

    @Override
    public double vendre(int quantite) {
        if (quantite > stock) {
            System.out.println("Stock insuffisant pour " + nom);
            return 0;
        }
        stock -= quantite;
        return quantite * prixVente;
    }

    @Override
    public void lanceSolde(double pourcentage) {
        prixVente -= prixVente * (pourcentage / 100);
    }

    @Override
    public void termineSolde(double pourcentage) {
        prixVente += prixVente * (pourcentage / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", Stock: " + stock;
    }
}
