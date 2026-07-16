public class linearS{

    public static int linearSearch(int arr[], int key){
        int i;
        for(i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            } 
            
        }
         return -1;
    }
    public static void main(String args[]){

        int arr1[]={11,22,33,44,55,66,77};
        int key=55;
        int a=linearSearch(arr1, key);
        if(a==-1){
            System.out.print("key not found");
        }else {
            System.out.print("Key forund at index:"+ a);
        }
    }
}