public class armstrong {
    public static boolean isArmstrong(int n) {
        int ld=0;
        int count=0;
        int temp=n;
        int total=0;
        while(temp>0){
            count ++;
           temp=temp/10;
        }
        temp=n;
        while(temp>0){
            ld=temp%10;
            int cube=(int)Math.pow(ld, count );
           total += cube;
            temp=temp /10;
        }
       return total==n;
    }

    public static void main(String args[]){
        int num = 9474;

        System.out.print(isArmstrong(num));

    }
}