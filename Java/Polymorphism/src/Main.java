public class Main {

    public static void main(String[] args) {
        Bird b = new Bird();
        Cat c = new Cat();
        Dog d = new Dog();
        GodSaidGoToSleep(b,c,d);

        Pegasus p = new Pegasus();
        GodSaidToFly(b,p);



        Animal bb = new Bird();
        bb.CanSleep();
        bb.CanReproduce();
        bb.CanEat();



    }


    public static void GodSaidGoToSleep(Animal... animals){
        for (Animal animal: animals) {
            animal.sleep();   // baam! they're now going to sleep
        }
    }

    public static void GodSaidToFly(HasWings... objects){
        for (HasWings objectThatHasWings: objects) {
            objectThatHasWings.fly(); // Baam! they're now flying on your command
        }

    }
}
