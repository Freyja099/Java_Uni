package Ex3;

public abstract class Article {
    protected double prixAchat;
    protected double prixVente;
    protected String nom;
    protected String fournisseur;

    public Article(String nom, String fournisseur, double prixAchat, double prixVente) {
        this.nom = nom;
        this.fournisseur = fournisseur;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
    }

    public double rendement() {
        return (prixVente - prixAchat) / prixAchat * 100;
    }

    @Override
    public String toString() {
        return "Article: " + nom + ", Fournisseur: " + fournisseur + ", Prix Achat: " + prixAchat + ", Prix Vente: " + prixVente + ", Rendement: " + rendement() + "%";
    }
}
