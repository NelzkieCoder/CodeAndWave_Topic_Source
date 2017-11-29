public abstract class Animal {

    public String name = "Animal";

    protected void CanEat(){
        System.out.println( name + " can eat");
    }
    protected void CanSleep(){
        System.out.println(name + " can sleep");
    }
    protected void CanReproduce(){
        System.out.println(name + " can reproduce");
    }


    protected void sleep(){
        System.out.println(name+" is going to sleep");
    }

    protected abstract void MakeNoise();   // the added abstract method

}
