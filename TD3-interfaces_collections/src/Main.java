public class Main {
    public static void main(String[] args) {

        EspritHashSet h=new EspritHashSet();
        Enseignant e= new Enseignant(2,"kazen","Boulares");
        Enseignant e2= new Enseignant(3,"zohamed","Boulares2");
        Enseignant e3= new Enseignant(1,"meres","Boulares3");

        h.ajouterEnseignant(e);
        h.ajouterEnseignant(e2);
        h.ajouterEnseignant(e3);



        h.displayEnseignants();

        System.out.println("///////////////////////////////////////////////////////////////////");
        System.out.println("///////////////////////////////////////////////////////////////////");

        EspritTreeSet h2=new EspritTreeSet();

        h2.ajouterEnseignant(e);
        h2.ajouterEnseignant(e2);
        h2.ajouterEnseignant(e3);

        h2.displayEnseignants();

        System.out.println("///////////////////////////////////////////////////////////////////");
        System.out.println("///////////////////////////////////////////////////////////////////");

        //trie decroissant par id

        System.out.println("Trie par id dec");
        System.out.println(h2.TrierParIdDec());



        //trie croissant par nom

        System.out.println("Trie par nom croissant");
        System.out.println(h2.TrierParNomCroissant());





    }



}