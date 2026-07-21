public class searchInSortRot{

    public static int search(int arr[], int targ, int si, int ei){
        
        if(si>ei){
            return -1;
        }

        int mid = si + (ei-si)/2;

        if(arr[mid] == targ){
            return mid;
        }

        if(arr[si]<=arr[mid]){
         // left
            if(arr[si]<=targ && targ<arr[mid]){

               return search(arr, targ, si, mid-1);

            }
            else{
               return search(arr, targ, mid+1, ei);
            }
        }
        // right
        else{
            if(arr[mid]<targ && targ<=arr[ei]){

               return search(arr, targ, mid+1, ei);

            }
            else{
               return search(arr, targ, si, mid-1);
            }
        }
        

    }

    public static void main(String args[]){

        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(search(arr, target, 0, arr.length-1));


    }
}