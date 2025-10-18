package ZooEcosystem;

public class Elephant extends Mammal {

    Double weight;

    public Elephant (double weight) {
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("The Elephant eats leafs");
    }

    @Override
    public void makeSound() {
        System.out.println("trumpeting sounds");
    }

    @Override
    public void displayInformation() {
        System.out.println("Elephant weight is "+weight+" tons");
    }
}
