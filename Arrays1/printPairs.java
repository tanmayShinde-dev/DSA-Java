import java.util.*;

public class printPairs{
    

        public static void printPairs(int arr[]){
        int tp=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total no. of pairs:"+tp);
    }

    public static void printSubarrays(int arr[]){
        int ts=0;
        for (int i=0; i<arr.length; i++){
            int start=i;
            for(int j=i; j<arr.length; j++){
                int end=j;
                for(j=start; j<=end; j++){
                    System.out.print(arr[j]+" ");
                }
                ts++;
                System.out.println();
            }
        }
         System.out.println("Total no. of subarrays are: "+ts);
    }

    public static void printSubarraysSum(int arr[]){
        int ts=0;
        int largestSum=0;
        int sum=0;
        for (int i=0; i<arr.length; i++){
            int start=i;
            for(int j=i; j<arr.length; j++){
                int end=j;
                for(j=start; j<=end; j++){
                    System.out.print(arr[j]+" ");
                sum= sum + arr[j];
                }
                 if(largestSum<sum){
                    largestSum=sum;
                }
                
                ts++;
                System.out.println();
                System.out.println("Sum of this subArray is:"+sum);
                sum=0;
            }
        }
         System.out.println("Largest sum of subArrays is: "+largestSum);
         System.out.println("Total no. of subarrays are: "+ts);
    }





  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int arr1[]={1,2,3,4,5,6,7,};
    printPairs(arr1);
    printSubarraysSum(arr1);

    
}
}