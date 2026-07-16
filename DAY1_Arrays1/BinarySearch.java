import java.util.*;

public class BinarySearch{
    public static int binarySearch(int arr[], int key){ 
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        return -1;
    }

        public static void reverse(int arr[]){
        int first=0;
        int last=arr.length-1;
        int temp;

        while(first<last){
            temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }




  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int arr1[]={1,2,3,4,5,6,7,};
    int key = sc.nextInt();
    int a= binarySearch(arr1, key);
    if(a==-1){
        System.out.println("key not found");
    }
    else{
        System.out.println("key is at index:"+ a);
    }

    reverse(arr1);
    int i;
    for(i=0; i<arr1.length;i++){
        System.out.print(arr1[i]+" ");
    }
}
}