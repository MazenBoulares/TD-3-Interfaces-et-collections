public class Enseignant implements Comparable<Enseignant> {

    private int id;
    private String nom;

    private String prenom;

    public Enseignant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Enseignant() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    @Override
    public String toString() {
        return "Enseignant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Enseignant)
            return ((Enseignant)obj).id == this.id;
        else
            return false;


    }


    @Override
    public int compareTo(Enseignant o) {
        return this.id-o.id;
    }
}
