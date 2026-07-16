import java.util.*;

public class findGcd{

    public static int findGcd(int n1, int n2) {
         int gcd =1;

         for(int i=Math.min(n1,n2); i>0; i--){           //brute force
            if(n1%i==0 &&n2%i==0){
                return i;
            }
         }
         return gcd;
    }


    public static int findGcd(int n1, int n2) {
         int gcd =1;

         while(n1>0 && n2>0){
            if(n1>n2){
                n1=n1%n2;                                 //EUCLEIAN ALGORITHM
            }else{
                n2=n2%n1;
            }
         }
         if(n1>n2){
            return n1;
         }else{
            return n2;
         }
    }

    public static void main(String[] args) {
        int n1 = 20, n2 = 15;

        // Find the GCD of n1 and n2
        int gcd = findGcd(n1, n2);

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}