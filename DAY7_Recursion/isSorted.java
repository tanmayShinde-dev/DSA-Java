public class isSorted{

    public static boolean isSort(int arr[], int i){
        
        if(i==arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSort(arr, i+1);
    }

    public static void main(String args[]){
        int arr [] = {1,2,3,4,5,6};
        int arr1 [] = {7,6,5,4,3,3};
        System.out.print(isSort(arr1, 0));
    }
}