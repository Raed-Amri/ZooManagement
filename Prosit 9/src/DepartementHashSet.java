
import java.util.*;

public class DepartementHashSet implements IDepartement<Departement> {

    HashSet<Departement> DhashSet = new HashSet();
    @Override
    public void ajouterDepartement(Departement departement) {
        DhashSet.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        Iterator<Departement> De = DhashSet.iterator();
        while (De.hasNext()){
            if (De.next().getNom_de_departement().equals(nom)) return true ;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return DhashSet.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        DhashSet.remove(departement);
    }

    @Override
    public void displayDepartement() {
        Iterator<Departement> De = DhashSet.iterator();
        while (De.hasNext()){
            System.out.println(De.next());
        }

    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet treesetD = new TreeSet<>(DhashSet);
        return treesetD;
    }
//    @Override
//    public TreeSet<Departement> trierDepartementById() {
//
//        TreeSet<Departement> td = new TreeSet<>(new Comparator<Departement>() {
//            @Override
//            public int compare(Departement o1, Departement o2) {
//                return o1.getId()- o2.getId();
//            }
//        });
//        td.addAll(DhashSet);
//        return td ;
//    }
}
