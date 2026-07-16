public class largestValue{

    public static int largestValue(int arr[]){
        int largest= Integer.MIN_VALUE;
        int i;
        for(i=0; i<arr.length; i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){
        int arr1[]={101,22,33,44,55,66,77};
        System.out.print("largest Element in the given array is:"+ largestValue(arr1));

    }
}