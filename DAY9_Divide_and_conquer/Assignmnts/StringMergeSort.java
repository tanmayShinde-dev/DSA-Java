public class mergeSort{

  

    }
    public static String[] merge(String arr1[], String arr2[]){
        int m = arr1.length;
        int n = arr2.length;
        
        String arr3[] = new String[m+n];

        int i = 0;
        int j = 0;
        int k = 0;

        while( i<m && j<n){
            if(isAlphabetecallySmaller(arr1[i], arr2)[j]){
                arr3[k++] = arr1[i++];
            }
            else{
                arr3[k++] = arr2[j++];
            }
        }

        // left remains
        while(i<=m){
            
        }
    }

    public static String[] mergeSort( String str[], int lo, int hi ){

       if (hi == lo){
        String A[] = str[lo];
        return A;
       }

       int mid = low + (hi-lo)/2;

        String arr1 = mergeSort(str, lo, mid);
        String arr2 = mergeSort(str, mid+1, hi);

        String arr3 = merge(arr1, arr2);

        return arr3;

    }

    public static void main(String args[]){

        int arr[]={7,6,5,4,5,5,5,5,5,3,2};
        mergeSort(arr,0,arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+",");
        }


    }
}