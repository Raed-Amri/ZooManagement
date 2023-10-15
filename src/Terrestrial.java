public class Terrestrial extends Animal{
    private int nbrLegs;

    public Terrestrial(String habitat, int nbrLegs) {
        super(habitat);
        this.nbrLegs = nbrLegs ;
    }

    public int getNbrLegs(){
        return nbrLegs;
    }
}
