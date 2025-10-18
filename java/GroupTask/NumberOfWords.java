package GroupTask;

public class NumberOfWords {
    public static void main(String[] args) {

        String frase = "Java is hard! But after you learn, is fun!";
        String[] words = frase.trim().split("\\W+"); // Split on non-word chars
        System.out.println("Number of Words: " + words.length);
    }
}
