public class CowelsCount {
    public static void main(String[] args) {

        String text = "documentation";
        int count = 0;
        text = text.toLowerCase();

        for (char c : text.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }

        System.out.println("Vowel count: " + count);
    }


}
