public class SpiralMatCode{

public static void spiralPrint(int arr[][]){
    int startRow=0;
    int endRow=arr.length-1;
    int startCol=0;
    int endCol=arr[0].length-1; 

    while(startRow<=endRow && startCol<=endCol){
    //top
    for(int i=startCol; i<=endCol; i++){
        System.out.print(arr[startRow][i]+",");
    }

    //Right
    for(int i=startRow+1; i<=endRow; i++){
        System.out.print(arr[i][endCol]+",");
    }

    //bottom
    for(int i=endCol-1; i>=startCol; i--){
        if(startRow==endRow){
            break;
        }
        System.out.print(arr[endRow][i]+",");
    }

    //left
    for(int i=endRow-1; i>=startRow+1; i--){
        if(startCol==endCol){
            break;
        }
        System.out.print(arr[i][startCol]+",");
    }

    startRow++;
    endRow--;
    startCol++;
    endCol--;
    }

}

    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,9},
                        {11,22,33,44},
                        {55,66,77,88}};
        int matrix2[][]={{1,2,3,},
                        {4,5,6},
                        {7,8,9}};               

        spiralPrint(matrix2);
    }
}