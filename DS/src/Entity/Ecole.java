package Entity;

import java.util.Arrays;

public class Ecole {
    private String nom;
    private Etudiant[] etudiants;
    private int nbr_etudiants=0;
    final int MAX_ETUDIANTS = 500;

    public Ecole(String nom) {
        this.nom = nom;
        this.etudiants = new Etudiant[MAX_ETUDIANTS];
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int rechercherEtudiant(Etudiant e){
        for (int i=0;i<nbr_etudiants;i++){
            if(etudiants[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    public void ajouterEtudiant(Etudiant e) throws EtudiantExistException {
        if (rechercherEtudiant(e) == -1) {
            etudiants[nbr_etudiants] = e;
            nbr_etudiants++;
        } else {
            throw new EtudiantExistException("Cet étudiant existe déjà");
        }
    }

    public float calculateMoyenne3A(){
        int somme =0;
        int nbr3A = 0;
        for(Etudiant e: etudiants) {
            if(e instanceof Etudiant3eme E3e){
                somme += E3e.getMoyenne();
                nbr3A++;
            }
        }
        return somme/nbr3A;
    }

    public float calculateMoySalaireAlt(){
        float sum = 0;
        int nbr3Alt = 0;
        for(Etudiant e :etudiants) {
            if(e instanceof EtudiantAlternance Ealt) {
                sum += Ealt.getSalaire();
                nbr3Alt ++;
            }
        }
        return sum / nbr3Alt ;
    }

    public void supprimerEtudiant(Etudiant e){

        for(int i=0;i<nbr_etudiants;i++) {
            etudiants[i] = etudiants[i+1];
        }
        etudiants[nbr_etudiants] = null;
        nbr_etudiants --;
    }


    public void changerEcole(Etudiant etd, Ecole e) {
        int position = rechercherEtudiant(etd);
        if (position != -1) {
            try {
                e.ajouterEtudiant(etd);
            } catch (EtudiantExistException ex) {
                System.out.println(ex.getMessage());
            }
            for (int i = position; i < nbr_etudiants; i++) {
                etudiants[i] = etudiants[i + 1];
                etudiants[nbr_etudiants] = null;
                nbr_etudiants--;
            }
        } else {
            System.out.println("Cet étudiant n'éxiste pas");
        }
    }


    @Override
    public String toString() {
        return "Ecole{" +
                "nom='" + nom + '\'' +
                ", etudiants=" + Arrays.toString(etudiants) +
                '}';
    }


}

