package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberHashingFaster {
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
        for(int i:arr){
            mp.put(i,mp.getOrDefault(i,0)+1);
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
