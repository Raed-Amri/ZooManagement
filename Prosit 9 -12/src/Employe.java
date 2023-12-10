import java.util.Comparator;

public class Employe implements Comparable<Employe> , Comparator<Employe> {
    private int id ;
    private String nom ;
    private String prenom ;
    private String nom_de_departement ;
    private int grade ;
    public Employe() {

    }
    public Employe(int id ,String nom ,String prenom ,String nom_de_departement, int grade){
        this.id=id;
        this.nom=nom;
        this.nom_de_departement=nom_de_departement;
        this.prenom=prenom;
        this.grade=grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setNom_de_departement(String nom_de_departement) {
        this.nom_de_departement = nom_de_departement;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public String getNom() {
        return nom;
    }

    public String getNom_de_departement() {
        return nom_de_departement;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public int compare(Employe o1, Employe o2) {
        return (o1.nom.compareTo(o2.nom));
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false ;
        if (obj instanceof Employe e){
            return this.id== e.id && this.nom.equals(e.nom);
        }
        return false;
    }

    @Override
    public String toString() {
        return "id" +id +"nom" + nom + "prenom" + prenom +"nom_de_departement"
                +nom_de_departement +"grade" + grade ;
    }

    @Override
    public int compareTo(Employe o) {

        return (this.id - o.getId());

    }
}