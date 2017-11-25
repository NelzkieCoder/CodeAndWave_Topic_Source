public class Pegasus extends Animal implements HasHorn, CanFly {
    public Pegasus() {
        this.name = "Pegasus";
    }

    @Override
    protected void MakeNoise() {
        System.out.println("A pegasus sound maybe? who knows");
    }

    @Override
    public void fly() {
        System.out.println("pegasus can fly");
    }

    @Override
    public void OneHorn() {
        System.out.println("Horn on its forehead");
    }
}
