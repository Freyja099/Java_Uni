package Ex3;

public class ArticlePrimeur extends Article implements VendableKilo {
    private double stock;

    public ArticlePrimeur(String nom, String fournisseur, double prixAchat, double prixVente) {
        super(nom, fournisseur, prixAchat, prixVente);
        this.stock = 0.0;
    }

    public void remplirStock(double quantite) {
        this.stock += quantite;
    }

    @Override
    public double vendre(double quantite) {
        if (quantite > stock) {
            System.out.println("Stock insuffisant pour " + nom);
            return 0;
        }
        stock -= quantite;
        return quantite * prixVente;
    }

    @Override
    public String toString() {
        return super.toString() + ", Stock: " + stock + "kg";
    }
}
