package sorting;

public class bubbleSort{
    public static void main(String[] args) {
        int arr[]= new int[]{1,2,3,4,5};
        int temp;
        boolean swapped;
        int n = arr.length;

        for(int i=0;i<n;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                System.out.println("Already sorted");
                break;
            }
        }
        System.out.println("Sorted Array ");
        for(int i: arr){
            System.out.println(i);
        }
    }
}