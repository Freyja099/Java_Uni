package Ex3;

import java.util.ArrayList;
import java.util.List;

public class ListeDeDocument{
    private List<Document> documents;

    public ListeDeDocument() {
        this.documents = new ArrayList<>();
    }

    public void ajouterDocument(Document document) {
        this.documents.add(document);
    }

    public void tousLesAuteurs() {
        System.out.println("Liste des auteurs (et numéros de documents) : ");
        for (Document document : documents) {
            if (document instanceof Livre) {
                Livre livre = (Livre) document;
                System.out.println("Numéro: " + document.getNumeroEnregistrement() + ", Auteur: " + livre.getAuteur());

            } else {
                System.out.println("Numéro: " + document.getNumeroEnregistrement() + ", Auteur: N/A");
            }
        }
    }

    public void tousLesDocuments() {
        System.out.println("Liste de tous les documents : ");
        for (Document document : documents) {
            System.out.println(document.toString());
        }
    }
}