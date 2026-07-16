public class fibonacci{

    public static int fib(int n){
        if(n==1 || n==0){
            return n;
        }

    return fib(n-1) + fib(n-2);

    }

    public static void main(String args[]){
        for(int i=0; i<=10; i++){
            System.out.print(fib(i) +",");
        }

        System.out.println();
        System.out.println(fib(30));
        
    }
}
// Key idea to remember
// The function keeps calling itself until it reaches the base cases (fib(0) or fib(1)).
// After reaching the base cases, the function returns upward, adding the values at each level.
// This process continues until the original call (fib(5)) gets its final answer.