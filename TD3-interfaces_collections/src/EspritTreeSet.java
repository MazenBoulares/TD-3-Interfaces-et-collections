import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class EspritTreeSet implements GestionEnseignant {

    TreeSet<Enseignant> h = new TreeSet<>();

    public void ajouterEnseignant(Enseignant e) {
        h.add(e);

    }


    public boolean rechercherEnseignant(Enseignant e) {
        return h.contains(e);
    }

    public void supprimerEnseignant(Enseignant e) {
        h.remove(e);
    }


    public void displayEnseignants() {
        System.out.println(h);
    }

    public TreeSet<Enseignant> TrierParIdDec() {

        //ma redefintion de methode compare to dans eseignant fais le tri croissant par id


        TreeSet<Enseignant> aux = new TreeSet<Enseignant>((Collections.reverseOrder()));

        aux.addAll(h);

        return aux;


    }


    public TreeSet<Enseignant> TrierParNomCroissant() {

        //ma redefintion de methode compare to dans eseignant fais le tri croissant par id


        TreeSet<Enseignant> aux = new TreeSet<Enseignant>(new TriIdDec());

        aux.addAll(h);

        return aux;


    }


}
