import java.util.HashSet;

public class EspritHashSet implements GestionEnseignant{

    HashSet<Enseignant> h= new HashSet<>();

    public void ajouterEnseignant(Enseignant e){
        h.add(e);

    }



    public boolean rechercherEnseignant (Enseignant e){
        return h.contains(e);
    }

    public void supprimerEnseignant (Enseignant e){
        h.remove(e);
    }


    public void displayEnseignants(){
        System.out.println(h);


    }




}
