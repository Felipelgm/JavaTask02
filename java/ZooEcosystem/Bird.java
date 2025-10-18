package ZooEcosystem;

public class Bird extends Animal {

    @Override
    public void eat() {
        System.out.println(" Eats seeds, fruits");
    }

    @Override
    public void makeSound() {
        System.out.println("Use the syrinx to make sound");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void displayInformation() {
        System.out.println("Describe an Bird");

    }
}
