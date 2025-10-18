package GroupTask;

public class Palindrome {
    public static void main(String[] args) {

        String word = "repaper";
        String reversed = new StringBuilder(word).reverse().toString();
        if (word.equalsIgnoreCase(reversed))
            System.out.println(word + " is a palindrome");
        else
            System.out.println(word + " is not a palindrome");
    }
}
