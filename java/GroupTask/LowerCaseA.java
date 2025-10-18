package GroupTask;

import java.util.Arrays;
import java.util.List;

public class LowerCaseA {
    public static void main(String[] args) {

        List<String> aWords = Arrays.asList("Almond", "Boots", "Alpes", "Anaconda", "Car");

        List<String> filtered = aWords.stream()
                .filter(s -> s.startsWith("A"))
                .map(String::toLowerCase)
                .toList();

        System.out.println(filtered);

    }
}
