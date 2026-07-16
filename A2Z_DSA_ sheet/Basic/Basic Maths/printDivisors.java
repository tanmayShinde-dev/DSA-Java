import java.util.*;

public class printDivisors {
    // Function to print all divisors
    // public static void printDivisors(int N) {
         
    //     for(int i=1; i<=N; i++){                    //BRUTE FORCE
    //         if(N%i==0){
    //             System.out.print(i + ", ");
    //         }
    //     }

    // }


    public static void printDivisors(int N){
        for(int i=1; i<Math.sqrt(N); i++){
            if(N%i==0){
                System.out.print(i+" ");
                if(i!=(N/i)){
                    System.out.print(N/i+" ");         //OPTIMAL APPROACH
                }
            }
        }
    }


        public static void main(String[] args) {

        printDivisors(6);

    }
}




