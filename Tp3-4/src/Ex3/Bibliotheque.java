package Ex3;

public class Bibliotheque{
    public static void main(String[] args) {
        Livre livre1 = new Livre("AAAA", "The Brothers Karamazov:", " Dostoyevsky ", 840);
        Dictionnaire dico1 = new Dictionnaire("BBBB", "Larousse", "Français", 2);
        Document document1 = new Document("CCCC", "Science");

        ListeDeDocument liste = new ListeDeDocument();

        liste.ajouterDocument(livre1);
        liste.ajouterDocument(dico1);
        liste.ajouterDocument(document1);

        liste.tousLesAuteurs();
        System.out.println("----------------------------------------------------");
        liste.tousLesDocuments();
    }
}
