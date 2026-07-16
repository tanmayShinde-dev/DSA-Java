public class tillingProb{

    public static int tillingProb(int n){
        
        if(n==0 || n==1){
            return 1;
        }

        //vertically first
        int fnm1 = tillingProb(n-1);

        //horizantally
        int fnm2 = tillingProb(n-2);

        int totalWays = fnm1 + fnm2;

        return totalWays;
       
    }

    public static void main(String args[]){


        System.out.print(tillingProb(5));

    }
}