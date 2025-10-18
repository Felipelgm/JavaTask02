package ZooEcosystem;

public class Mammal extends Animal {


    @Override
    public void eat() {
        System.out.println(" Feed from milk");
    }

    @Override
    public void makeSound() {
        System.out.println(" Use a larynx to make sound");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void displayInformation() {
        System.out.println("Describe an Mammal");
        
    }
}
