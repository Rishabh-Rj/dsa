package streams;

import java.util.List;
import java.util.stream.Collectors;

public class CommonElement {
    public static void main(String[] args) {
        // Define two lists
        List<String> item1 = List.of("apple", "banana", "orange");
        List<String> item2 = List.of("pomegranate", "banana", "kiwi");

        // Find common elements
        List<String> result = item1.stream()
                .filter(s -> item2.contains(s))  // Filter elements in item1 that are in item2
                .collect(Collectors.toList()); // Collect them into a list


        List<String> result2= item2 .stream().filter(a-> a.length()<=4).collect(Collectors.toList());
        System.out.println("Result 2 "+result2);

        // Print the result
        System.out.println("Common elements: " + result);
    }
}