package Entity;

public class EtudiantAlternance extends Etudiant {
    private int salaire;

    public EtudiantAlternance(){

    }

    @Override
    public void ajouterUneAbsence() {
        salaire -= 50;
        if (salaire < 0) {
            salaire = 0;
        }

    }

    public EtudiantAlternance(int id, String nom, String prenom, double moyenne, int salaire){
        super(id, nom, prenom, moyenne);
        this.salaire=salaire;
    }
    public int getSalaire(){
        return salaire;
    }
    public void setSalaire(int salaire){
        this.salaire=salaire;
    }


    @Override
    public String toString() {
        return "EtudiantAlternance{" +
                "salaire=" + salaire +
                '}';
    }
}
