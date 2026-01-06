import java.util.Arrays;
import java.util.Collections;

public class bubble {

    public static void bubbleSort(int arr[]){
        for(int turns=0; turns<arr.length-1; turns++ ){      //turns<arr.length-1
            boolean count=false;
            for(int j=0; j<arr.length-1-turns; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count=true;
                }
            }
            if (!count){
                System.out.print("Array is already sorted");
                return;               
            }
        }
    }

    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos=i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[i];
                arr[i]=arr[minPos];
                arr[minPos]=temp;
        }
    }

    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int prev=i-1;
            int curr = arr[i];
            while(prev>=0 && curr<arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest=Math.max(arr[i], largest);
        }

        int count[] = new int[largest+1];

        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i =0; i<count.length; i++){
            while(count[i]>0){
                arr[j]=i;
                count[i]--;
                j++;
            }
        }
    }

    public static void main(String args[]){
        int arr[]={9,8,57,6,55,54,3,52,1};
        // Arrays.sort(arr,Collections.reverseOrder());
        // Arrays.sort(arr,0,4,Collections.reverseOrder());
        countingSort(arr);
        for(int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
    }
}