package Hashing;
import java.util.*;
//Given an array of integers: [1, 2, 1, 3, 2] and we are given some queries:
// [1, 3, 4, 2, 10]. For each query, we need to find out how many times the number appears
// in the array. For example, if the query is 1 our answer would be 2, and if the query is 4
// the answer will be 0.

public class NumberHashing {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Read the size of the input array
        System.out.println("Enter size of array ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter array elements ");
            // Read the input array elements
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Precompute the frequency of each number using HashMap
            HashMap<Integer, Integer> mp = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int key = arr[i];
                int freq = 0;
                if (mp.containsKey(key)) {
                    freq = mp.get(key); // Fetching the current frequency
                }
                freq++;
                mp.put(key, freq); // Inserting/updating the frequency in the map
            }

        // Iterate over the map:

        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            System.out.println(it.getKey() + "->" + it.getValue());
        }


            // Read the number of queries
            System.out.println("Enter no. of queries ");
            int q = sc.nextInt();

            System.out.println("Enter each query whose frequency you want to check in array: ");
            while (q-- > 0) {   // q-- until 0
                int number = sc.nextInt();     // even if enter input in same line it seperates by space and computers each

                // Fetch and print the frequency of the queried number
                if (mp.containsKey(number)) {
                    System.out.println("Frequency of "+ number +": "+ mp.get(number));
                } else {
                    System.out.println("Frequency of "+ number + " : 0");
                }
            }
        }
    }


