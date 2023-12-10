package Entity;

public abstract class Etudiant {
    protected int identifiant;
    protected String nom,prenom;
    protected float moyenne;


    public Etudiant(int identifiant,String nom,String prenom,float moyenne){
        this.identifiant=identifiant;
        this.nom=nom;
        this.prenom=prenom;
        this.moyenne=moyenne;
    }

    //Getters and Setters
    public int getIdentifiant(){
        return identifiant;
    }
    public void setIdentifiant(int identifiant){
        this.identifiant=identifiant;
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

    public float getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    //constructor
    public Etudiant(){

    }

    //equals
    @Override
    public boolean equals(Object o){
        if(o instanceof Etudiant e){
            return(this.identifiant==e.identifiant && this.nom.equals(e.nom));
        }
        return false;
    }

    //ToString
    @Override
    public String toString(){
        return "Etudiant: identifiant "+ identifiant
                +" nom: "+ nom
                +" prenom: "+ prenom
                +" moyenne: "+ moyenne;
    }

    public abstract void ajouterUneAbsence();



}
