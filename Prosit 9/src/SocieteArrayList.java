import java.util.*;
public class SocieteArrayList implements IGestion<Employe> {



    List<Employe> employelist = new ArrayList();


    @Override
    public void ajouterEmploye(Employe employe) {
        employelist.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (int i=0 ;i<employelist.size();i++){
            if(employelist.get(i).getNom().equalsIgnoreCase(nom)) return true ;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employelist.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employelist.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe e: employelist) {
            System.out.println(e);

        }

    }

    public void displayEmploye2() {
        Iterator<Employe> it =employelist.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employelist);

    }
    public void trierEmployeParNom() {
        Collections.sort(employelist, new Employe());

    }
    public void trierEmployeParprenom() {
        Collections.sort(employelist, new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return (o1.getPrenom().compareTo(o2.getPrenom()));
            }
        });

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employe> copdep = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return (o1.getNom_de_departement().compareTo(o2.getNom_de_departement()));
            }
        };
        Comparator<Employe> copgrade = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return (o1.getGrade()- o2.getGrade());
            }
        };

        Collections.sort(employelist,copdep.thenComparing(copgrade));
    }
}