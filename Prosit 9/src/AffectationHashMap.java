import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    HashMap<Employe,Departement> affectation = new HashMap<>();
    public void ajouterEmployeDepartement(Employe e, Departement d){
        affectation.put(e,d);
    }
    public void afficherEmployesEtDepartements(){
        for (Map.Entry<Employe,Departement> entry : affectation.entrySet()
        ) {
            System.out.println("key"+entry.getKey());
            System.out.println("value"+entry.getValue());

        }
    }
    public void afficherEmployesEtDepartements2(){
        for (Employe e : affectation.keySet()){
            System.out.println(e);
            System.out.println(affectation.get(e));
        }
    }
    public void supprimerEmploye (Employe e){
        affectation.remove(e);
    }
    public void supprimerEmployeetDepartement (Employe e,Departement d){
        affectation.remove(e,d);
    }

    public void afficherEmployes(){
        for (Employe e : affectation.keySet()){
            System.out.println(e.getNom());
        }

    }
    public void afficherDepartements(){
        for (Employe e : affectation.keySet()){
            System.out.println(affectation.get(e).getNom_de_departement());
        }
    }
    public boolean rechercherEmploye (Employe e){
        return affectation.containsKey(e);
    }
    public boolean rechercherDepartement (Departement d){
        return affectation.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap(){
        TreeMap<Employe,Departement> tm = new TreeMap(new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                return e1.getId() - e2.getId();
            }
        });
        tm.putAll(affectation);
        return tm ;
    }


}
