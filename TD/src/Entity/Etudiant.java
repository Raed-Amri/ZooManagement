package Entity;

public abstract class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private double moyenne;

    public Etudiant(){

    }
    Etudiant(int id, String nom, String prenom, double moyenne){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.moyenne=moyenne;
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
    public double getMoyenne(){
        return moyenne;
    }
    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (null == obj) return false;
        if(obj.getClass() == Etudiant.class){
            Etudiant etudiant=(Etudiant) obj;
            return id == etudiant.id && nom.equals(etudiant.nom);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", moyenne=" + moyenne +
                '}';
    }

    public abstract void ajouterUneAbsence();

}
