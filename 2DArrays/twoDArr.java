import java.util.*;




public class twoDArr{

    public static void Searching(int arr[][], int key){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==key){
                    System.out.print(i+","+j);
                    return;
                }
            }
        }
        System.out.print("not found");
        return;
    }  

    public static int largestNum(int arr[][]){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]>largest){
                    largest=arr[i][j];
                }
            }
        }
        return largest;
    }  


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]= sc.nextInt();
            }
        }

      

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

            System.out.print(matrix[i][j]+" ");
            
            }
            System.out.println();
        }

        System.out.print(largestNum(matrix));
        Searching(matrix, 22);



    }
}