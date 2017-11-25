public class Abstraction {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.CanEat();
        dog.CanSleep();
        dog.CanReproduce();
        dog.MakeNoise();


        Cat cat = new Cat();
        cat.CanEat();
        cat.CanSleep();
        cat.CanReproduce();
        cat.MakeNoise();

        Bird bird = new Bird();
        bird.MakeNoise();
        bird.CanEat();
        bird.CanReproduce();
        bird.CanEat();
        bird.fly();  // BAAM! birds can fly


    }
}
