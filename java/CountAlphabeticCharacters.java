public class CountAlphabeticCharacters {
    public static void main(String[] args) {

        String alpha = "Java is complicate 90000";
        int many = 0;

        for (char m : alpha.toCharArray()) {
            if (Character.isLetter(m)) many++;
        }

        System.out.println("Alpha characters = " + many);
    }
}
