public class stairCaseSearch{

    public static boolean stairCaseSearchTR(int arr[][], int key){     //TOPRIGHT
        int row=0;
        int col=arr[0].length-1;
        while(row<=arr.length-1 && col>=0){
            if(key==arr[row][col]){
                System.out.println("key present at cell"+" ("+row+","+col+")");
                return true;
            }
            if(key>arr[row][col]){
                row++;
            }
            else if(key<arr[row][col]){
                col--;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static boolean stairCaseSearchBL(int arr[][], int key){     //BOTTOMLEFT
        int row=arr.length-1;
        int col=0;
        while(row>=0 && col<arr[0].length){
            if(key==arr[row][col]){
                System.out.println("key present at cell"+" ("+row+","+col+")");
                return true;
            }
            if(key>arr[row][col]){
                col++;
            }
            else if(key<arr[row][col]){
                row--;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,9},
                        {11,22,33,44},
                        {55,66,77,88}};
        int matrix2[][]={{1,2,3,},
                        {4,5,6},
                        {7,8,9}};               

        // spiralPrint(matrix2);

        stairCaseSearchTR(matrix, 9);
        stairCaseSearchBL(matrix, 9);

    }
}