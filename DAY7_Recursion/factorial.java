public class factorial{

    public static int printFactorial(int n){
        if(n==1){
            return 1;
        }
        return printFactorial(n-1) * n ;
        
    }

    public static void main(String args[]){
        System.out.print(printFactorial(5));
    }
}