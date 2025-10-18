package ZooEcosystem;

public class Parrot extends Bird {

    String color1;
    String color2;

    public Parrot (String color1, String color2) {
        this.color1 = color1;
        this.color2 = color2;
    }

    @Override
    public void eat() {
        System.out.println("fresh vegetables, fruits");
    }

    @Override
    public void makeSound() {
        System.out.println(" from gurgles and trills to whistles");
    }

    @Override
    public void displayInformation() {
        System.out.println("The parrot colors are: "+color1+" and "+color2+".");
    }
}
