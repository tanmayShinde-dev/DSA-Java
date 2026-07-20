public class mergeSort{

    public static void merge(int arr[], int si, int mid, int ei){
        int i = si;
        int j = mid+1;
        int k = 0;
        int temp[]=new int[ei-si+1];

        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        //left remains
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right remains                   // equivalent to temp[k]=arr[j]
        while(j<=ei){                     // k++; j++;
            temp[k++]=arr[j++];
        }

        for(i=si, k=0; k<temp.length; i++,k++){
            arr[i]=temp[k];
        }

    }

    public static void mergeSort( int arr[], int si, int ei){

        if(si>=ei){
            return;
        }

        int mid = (si+ei)/2;

        //left
        mergeSort(arr, si, mid);
        //right
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);


    }

    public static void main(String args[]){

        int arr[]={7,6,5,4,5,5,5,5,5,3,2};
        mergeSort(arr,0,arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+",");
        }


    }
}