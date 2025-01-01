package Ex3;

public class Bibliotheque{
    public static void main(String[] args) {
        // Création de documents
        Livre livre1 = new Livre("AAAA", "The Brothers Karamazov:", " Dostoyevsky ", 840);
        Dictionnaire dico1 = new Dictionnaire("BBBB", "Larousse", "Français", 2);
        Document document1 = new Document("CCCC", "Science");

        // Création d'une liste de documents
        ListeDeDocument liste = new ListeDeDocument();

        // Ajout des documents à la liste
        liste.ajouterDocument(livre1);
        liste.ajouterDocument(dico1);
        liste.ajouterDocument(document1);

        // Test des méthodes de ListeDeDocuments
        liste.tousLesAuteurs();
        System.out.println("----------------------------------------------------");
        liste.tousLesDocuments();
    }
}
