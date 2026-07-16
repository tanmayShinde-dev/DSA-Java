public class lastOcc{

    public static int lastOcc(int arr[], int key, int i){
        
        if(i == arr.length){
            return -1;
        }
       
        int isfound = lastOcc(arr, key, i+1);

        if(isfound != -1){
            return isfound;
        }        

        if(key == arr[i]){
            return i;
        }

        return -1;
    }

    public static void main(String args[]){

        int arr[] = {1,3,4,5,6,7,5,5};

        System.out.print(lastOcc(arr, 5, 0));
    }
}