public class Bird extends Animal implements HasWings {

    public Bird() {
        this.name = "Bird";
    }

    @Override
    protected void MakeNoise() {
        System.out.println("tweet tweet tweet ");
    }
    @Override
    public void fly() {
        System.out.println("Birds is flying");    // The fly() definition
    }



}
