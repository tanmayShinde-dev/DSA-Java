public class Assignment{

    public static int printFrequency(int arr[][], int num){
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==num){
                    count++;
                }
            }
        }
        return count;
    }

    public static void SecondRowSum(int arr[][]){
        int i=1;
        int sum=0;
        for(int j=0; j<arr[0].length; j++){
            sum+=arr[i][j];
        }
        System.out.println(sum);
    }

    public static int[][] printTranspose(int arr[][]){
        int trans[][]= new int[arr[0].length][arr.length];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                trans[j][i]=arr[i][j];
            }
        }
        return trans;
    }



    public static void main(String args[]){
    int matrix[][]={{1,7,3,},
                    {4,5,7},
                    {7,8,9}};
    int matrix1[][]={{1,7,3,},
                    {4,5,7}
                    };

    System.out.println(printFrequency(matrix,7));
    SecondRowSum(matrix); 
    int result[][] = printTranspose(matrix1);      
    for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }         
}
}