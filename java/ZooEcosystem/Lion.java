package ZooEcosystem;

public class Lion extends Mammal {

    String color;
    int size;

    public Lion (String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public void eat() {
        System.out.println("The lion eats meat.");
    }

    @Override
    public void makeSound() {
        System.out.println("Roarrrrrr");
    }

    @Override
    public void displayInformation() {
        System.out.println("Lion color: "+color+", size: "+size+".");
    }
}


