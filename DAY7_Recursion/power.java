public class power{

    public static int pow(int n, int p){
        
        if(p==0){
            return 1;
        }
       
        return n * pow(n, p-1);
    }

    public static int optPow(int n, int p){

        if(p==0){
            return 1;
        }
        int halfPower = optPow(n, p/2);
        int halfPoweredSq = halfPower * halfPower;

        if (p % 2 !=0){
            halfPoweredSq = n * halfPoweredSq;
        }

        return halfPoweredSq;

    }

    public static void main(String args[]){

        System.out.println(pow(12,2));

        System.out.println(pow(5,4));

    }
}