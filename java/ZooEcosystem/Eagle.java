package ZooEcosystem;

public class Eagle extends Bird{

    int age;
    int speed;

    public Eagle (int age, int speed) {
        this.age = age;
        this.speed = speed;
    }

    @Override
    public void eat() {
        System.out.println("fish and small mammals");
    }

    @Override
    public void makeSound() {
        System.out.println(" high-pitched whistling");
    }

    @Override
    public void displayInformation() {
        System.out.println("Eagle age is: "+age+" and her speed is: "+speed+"KM/h.");
    }
}
