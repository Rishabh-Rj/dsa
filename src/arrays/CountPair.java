package arrays;
import java.util.*;
public class CountPair {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter" + n + " elemenets of array ");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        System.out.println("Enter target ");
        int target= sc.nextInt();

        int pairs= pairsum(arr,target, n);
        int triplets= tripletsum(arr,target,n);
        System.out.println("Number of pairs " + pairs);
        System.out.println("Number of triplets " + triplets);
    }

    public static int pairsum(int []arr, int target, int n){
        int pairs=0;
        for(int i=0;i<n;i++){          //loop to fix one element and then nested loop to traverse and add other elements to check if sum is equal to target
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    pairs++;
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
        return pairs;
    }


    public static int tripletsum(int []arr, int target, int n){
        int pairs=0;
        for(int i=0;i<n;i++){          //loop to fix one element and then nested loop to traverse and add other elements to check if sum is equal to target
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){

                    if(arr[i]+arr[j]+arr[k]==target){
                        pairs++;
                        System.out.println(arr[i]+","+arr[j]+ ","+ arr[k]);

                    }
                }
            }
        }
        return pairs;
    }
}
