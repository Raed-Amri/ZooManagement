package Entity;

public class Etudiant3eme extends Etudiant {
    private String branche;
    private double moyenne;

    public Etudiant3eme(String branche, double moyenne) {
        this.branche=branche;
        this.moyenne=moyenne;
    }

    public Etudiant3eme(int id, String nom, String prenom, double moyenne, String branche){
        super(id, nom, prenom, moyenne);
        this.branche=branche;
    }
    public String getBranche(){
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    @Override
    public void ajouterUneAbsence() {
        moyenne -=0.5;
        if (moyenne < 0) {
            moyenne = 0;
        }
    }
    public double getMoyenne(){
        return  moyenne;
    }

}
