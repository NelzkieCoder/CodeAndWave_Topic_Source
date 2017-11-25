

public class Dog extends Animal {
    public Dog() {
        this.name = "Dog";
    }

    @Override
    protected void MakeNoise() {
        System.out.println("Woof Woof");
    }
}
