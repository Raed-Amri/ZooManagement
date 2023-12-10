package Entity;

public class Ecole {

    private Etudiant[] etudiants;
    private int nombreMaxEtudiants;
    private int nombreEtudiantActuels;
    private String nom;

    public Ecole() {
        this.nombreMaxEtudiants = 500;
        this.etudiants = new Etudiant[nombreMaxEtudiants];
        this.nombreEtudiantActuels = 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void ajouteEtudiant(Etudiant etudiant) {
        if (nombreEtudiantActuels < nombreMaxEtudiants) {
            etudiants[nombreEtudiantActuels] = etudiant ;
            nombreEtudiantActuels ++;
            System.out.println("Etudiant ajouté avec succés à l'école");
        }
        else {
            System.out.println("Ecole déja pleine, impossible d'ajouter");
        }
    }

    public int rechercherEtudiant(Etudiant e) {
        for ( int i = 0; i < nombreEtudiantActuels; i++) {
            if (etudiants[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }


}
