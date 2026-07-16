public class printSumOfnNat{

    public static int printSum(int n){

        if(n==1){
            return 1;
        }
        return printSum(n-1) + n;
    }

    public static void main(String args[]){

        System.out.print(printSum(5));

    }
}