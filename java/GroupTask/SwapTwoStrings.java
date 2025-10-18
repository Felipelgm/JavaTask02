package GroupTask;

public class SwapTwoStrings {

    public static void main(String[] args) {

        String a = "Dog";
        String b = "Cat";

        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println("a = " + a + ", b = " + b);

    }
}
