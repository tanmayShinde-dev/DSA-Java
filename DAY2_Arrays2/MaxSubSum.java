public class MaxSubSum{
    public static int maxSubSum(int arr[]){
        int i,j,k;
        int currSum=0;
        int largestSum=Integer.MIN_VALUE;
        for(i=0; i<arr.length; i++){
            for(j=i; j<arr.length;j++){
                int end=j;
                currSum=0;
                for(k=i; k<=end; k++){
                    
                    currSum=currSum+arr[k];
                }
                if(currSum>largestSum){
                    largestSum=currSum;
                }
                
                  
            }
        }
        return largestSum;
    }


    public static int maxSubSumPrefix(int arr[]){
        int i,j,k;
        int currSum=0;
        int largestSum=Integer.MIN_VALUE;
        int prefix[]= new int[arr.length];
        prefix[0]= arr[0];

        for(i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(i=0; i<arr.length; i++){
            int start=i;
            for(j=i; j<arr.length; j++){
                int end=j;
                currSum=start==0? prefix[end] : prefix[end]-prefix[start-1];

                if (currSum>largestSum){
                    largestSum=currSum;
                }
            }
        }
        return largestSum;
    }


    public static void kadanesAlg(int arr[]){
        int i;
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(i=0;i<arr.length; i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms= Math.max(cs, ms);
        }
        System.out.println("our maximum subArray Sum is: "+ ms);
    }

    public static int kadanesAlgINT(int arr[]){
        int i;
        int cs = arr[0];
        int ms = arr[0];
        for(i=1; i<arr.length; i++){
            cs = Math.max(arr[i], cs+arr[i]);
            ms = Math.max(cs, ms);
        }
        return ms;
    }

    public static void main(String args[]){
        int arr1[]={1,-2,6,-1,3};
        System.out.println("largest subArray sum is:"+ maxSubSum(arr1));
        System.out.println("largest subArray sum is:"+ maxSubSumPrefix(arr1));
        kadanesAlg(arr1);
        System.out.println("largest subArray sum is:"+ kadanesAlgINT(arr1));
    }
}