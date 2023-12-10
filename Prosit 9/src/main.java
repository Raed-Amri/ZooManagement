//import entities.*;
//import interfaces.IGestion;
//import interfaces.IDepartement;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) { // psvm
        Employe e1 = new Employe(12,"rrr","gggg","IT",33);
        Employe e2 = new Employe(142,"ffr","gee","IT",3433);
        Employe e3 = new Employe(312,"irr","gggg","IT",363);
        SocieteArrayList sal =new SocieteArrayList();
        sal.ajouterEmploye(e1);
        sal.ajouterEmploye(e2);
        sal.ajouterEmploye(e3);
        sal.displayEmploye2();
        sal.rechercherEmploye(e3);


        Departement rh = new Departement(12,"RH",33);
        Departement r4 = new Departement(14,"IT",32);
        Departement rd = new Departement(14,"RD",32);
        Departement com = new Departement(15,"COM",30);
        DepartementHashSet listDepartement = new DepartementHashSet();
        listDepartement.ajouterDepartement(rh);
        listDepartement.ajouterDepartement(rd);
        listDepartement.ajouterDepartement(com);
        listDepartement.ajouterDepartement(r4);
        listDepartement.rechercherDepartement(rh);
        listDepartement.supprimerDepartement(rd);
        System.out.println(listDepartement.trierDepartementById());
        TreeSet<Departement> mytreest = new TreeSet<>();
        listDepartement.displayDepartement();

        AffectationHashMap affectation = new AffectationHashMap();
        affectation.ajouterEmployeDepartement(e1,rh);
        affectation.ajouterEmployeDepartement(e2,rh);
        affectation.ajouterEmployeDepartement(e3,rd);

        affectation.afficherEmployesEtDepartements();
        affectation.afficherEmployesEtDepartements2();


    }
}
