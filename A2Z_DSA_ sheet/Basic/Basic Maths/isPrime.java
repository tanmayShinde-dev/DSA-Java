import java.util.*;

public class isPrime {
    


    // public static boolean isPrime(int N){
        
    //     for(int i =2; i<N; i++){
    //         if(N%i==0){                              //BRUTE FORCE
    //             return false;
    //         }
    //     }
    //     return false;

    // }




    public static boolean isPrime(int N){
        int count=0;
        for(int i=1; i<=Math.sqrt(N); i++){
                if(N%i==0){
                    count++;                         //OPTIMAL 
                    if(i!=(N/i)){
                        count++;
                    }
                }
        }
        return count==2;
    }




        public static void main(String[] args) {

        System.out.print(isPrime(107));

    }
}




