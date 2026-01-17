import java.util.*;

public class isPowOf2{

    public static boolean isPowOf2(int n){
        return (n & (n-1)) == 0;
    }

    public static void main(String args[]){ 

            int num = 7;
            System.out.print(isPowOf2(num));

    }
}