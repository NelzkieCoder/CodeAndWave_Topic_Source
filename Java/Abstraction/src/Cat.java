public class Cat extends Animal {

    public Cat() {
        this.name = "Cat";
    }

    @Override
    protected void MakeNoise() {
        System.out.println("Meow Meow");
    }

}
