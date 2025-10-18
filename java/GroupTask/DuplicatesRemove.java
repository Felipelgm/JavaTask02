package GroupTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class DuplicatesRemove {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "A", "C", "B"));
        List<String> unique = new ArrayList<>(new LinkedHashSet<>(list));

        System.out.println("Without duplicates: " + unique);
    }
}
