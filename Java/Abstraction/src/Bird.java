public class Bird extends Animal implements CanFly {

    public Bird() {
        this.name = "Bird";
    }

    @Override
    protected void MakeNoise() {
        System.out.println("tweet tweet tweet ");
    }
    @Override
    public void fly() {
        System.out.println("Birds can fly");    // The fly() definition
    }

}
