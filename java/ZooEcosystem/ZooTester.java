package ZooEcosystem;

public class ZooTester {
    public static void main(String[] args) {
        Lion simba = new Lion("Black", 2 );
        simba.eat();
        simba.makeSound();
        simba.sleep();
        simba.displayInformation();
        System.out.println("");

        Elephant dumbo = new Elephant(5.5);
        dumbo.eat();
        dumbo.makeSound();
        dumbo.sleep();
        dumbo.displayInformation();
        System.out.println(" ");

        Parrot zeCarioca = new Parrot("Green", "Yellow");
        zeCarioca.eat();
        zeCarioca.makeSound();
        zeCarioca.sleep();
        zeCarioca.displayInformation();
        System.out.println();

        Eagle careca = new Eagle(20,70 );
        careca.eat();
        careca.makeSound();
        careca.sleep();
        careca.displayInformation();
        System.out.println();


    }
}
