public class countInvInSortArr{

    public static int merge(int arr[], int left, int right, int mid){

        int i = left;
        int j = mid;
        int k = 0;
        int invCount = 0;
        int temp[] = new int[right-left+1];

        while(i<mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
                invCount+=(mid-i);
            }

        }

        while(i<mid){
            temp[k++] = arr[i++];
        }
        while(j<=right){
            temp[k++] = arr[j++];
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }

        return invCount;

    }

    public static int MergSortCountInv(int arr[], int left, int right){
        int invCount = 0;
        if(left<right){
            int mid = left+(right-left)/2;

            invCount+= MergSortCountInv(arr,left,mid);
            invCount+= MergSortCountInv(arr, mid+1, right);
            invCount+= merge(arr, left, right, mid+1);
        }

        return invCount;

    }

    public static void main(String[] args) {

        int arr[] = {5, 3, 2, 4, 1};

        System.out.println("Inversion Count = " + MergSortCountInv(arr, 0, arr.length-1));
    }

}