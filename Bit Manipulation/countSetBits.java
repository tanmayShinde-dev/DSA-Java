import java.util.*;

public class countSetBits{

    public static int countSetBits(int n){
       int count=0;
       while(n>0){
        count++;
        n=n>>1;
       }
       return count;
    }

    public static void main(String args[]){ 

            int num = 1;
            System.out.print(countSetBits(num));

    }
}