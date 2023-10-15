public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String habitat, float swimmingSpeed) {
        super(habitat);
        this.swimmingSpeed = swimmingSpeed ;
    }
    public float getSwimmingSpeed() {
        return swimmingSpeed ;
    }
}
