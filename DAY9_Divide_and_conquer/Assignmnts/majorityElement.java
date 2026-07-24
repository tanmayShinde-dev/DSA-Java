public class majorityElement{
    
    public static int majority(int arr[], int lo, int hi){
    if(lo==hi){
        return arr[lo];
    }

    int mid = lo+(hi-lo)/2;

    int left = majority(arr, lo, mid);
    int right = majority(arr, mid+1, hi);

    if(left == right){
        return left;
    }

    int leftCount = count(arr,left,lo,hi);
    int rightCount = count(arr,right,lo,hi);

    return leftCount<rightCount? right:left;

}

public static int count(int arr[], int num, int si, int ei){
    int count =0;
    for(int i = si; i<=ei; i++){
        if(arr[i]==num){
            count+=1;
        }
    }
    return count;
}

public static int majorityElement(int arr[]){
    return majority(arr, 0, arr.length-1);
}

public static void main(String args[]) { 
int nums[] = {2,2,1,1,1,1,1,1,1,2,2,3,3,3,3,2,2,2,5,5,5,5,5,5,5,5,5,5,5,2,2,2,2,2,2,2,3,3,3,3,3,};
System.out.println(majorityElement(nums));
}

}