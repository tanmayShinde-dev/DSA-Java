public class sorting{

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            boolean count=false;
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                    count=true;
                }
                if(!count){
                    return;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        
    }

    public static void main(String args[]){

        int arr1[] ={9,8,7,6,5,2,3,4};
        int arr2[] ={1,2,3,4,5,6,7};

        // bubbleSort(arr2);
        selectionSort(arr1);
        printArray(arr1);


    }
}