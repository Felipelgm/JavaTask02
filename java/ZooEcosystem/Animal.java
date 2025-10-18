package ZooEcosystem;

public abstract class Animal implements AnimalBehavior {


    @Override
    public void sleep() {
        System.out.println("is sleeping ZZZzzzZZZ");
    }

    @Override
    public abstract void eat();

    @Override
    public abstract void makeSound();

    public abstract void displayInformation();

}
