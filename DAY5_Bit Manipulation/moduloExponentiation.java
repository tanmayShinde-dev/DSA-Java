public class moduloExponentiation{

public static int moduloExponentiation(int a, int n, int m){
    
    int ans = 1;
    while(n>0){
        if((n&1) != 0){
            ans=(ans*a) % m;
        }
        a=(a*a) % m;
        n=n>>1;
    }
    return ans;
}

public static void main(String args[]){

 System.out.print(moduloExponentiation(2, 3, 2));

}

}