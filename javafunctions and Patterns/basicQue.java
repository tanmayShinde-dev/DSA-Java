public class t6{

    public static int AVG(int a, int b, int c){
            int avg =(a+b+c)/3;
             return avg;
        }

    public static boolean isEven(int no) {
            if (no%2==0){
                return true;
            }
            else{
                return false;
            }
    }    

    public static boolean isPalindrome(int n){
        int nn=0;
        int num= n;

        while(n>0){
            int lastDigit= n%10;
            nn = lastDigit + (nn *  10 );
            n = n/10;
        }
        return num==nn;
    }

    public static int sumOfDigits(int num){
        int sum=0;
        int no=num;
        int lastDigit;
        while(no>0){
            lastDigit=no%10;
            sum=sum + lastDigit;
            no=no/10;
        }
        return sum;
    }


        public static void main(String args[]) {

        int i, j;
        char ch= 'A';

        for(i=1; i<=5; i++){

            for(j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }


    }
}

public class t2{
    public static void main(String arg[]){
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
            System.out.println();
        }
    }
}


public class t1{
    public static void main(String args[]){
        int n = 10;
        for(int line = 1; line<= n; line++){
            for(int star= 1; star<= n-line+1 ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
    public static void main(String args[]){

        System.out.println(AVG(10, 40, 10));

        System.out.println(isEven(105));

        System.out.println(isPalindrome(122231));

        System.out.print(sumOfDigits(33333));
    
    }

}


import java.util.*;

public class java1 {
    public static void main (String args[]){
        float a, b, c, avg, side;
        a = 10;
        b = 20;
        c = 30;
        avg = (a+b+c)/3;
        System.out.println(avg);

        Scanner sc = new Scanner(System.in);
        side = sc.nextFloat();
        float area = side * side;
        System.out.println(area);

        float pen, pencil, eraser, totalPrice, withGST, GST;
        pen = sc.nextFloat();
        pencil = sc.nextFloat();
        eraser = sc.nextFloat();

        totalPrice = pen + pencil + eraser;
        System.out.println(totalPrice);
        GST = 0.18f * totalPrice;
        withGST = totalPrice + GST;
        System.out.println(withGST);




        
        
    }
}

public class t4{
    public static void main(String args[]) {

        int i, j;

        for(i=1; i<=5;i++){
            for(j=1; j<=5-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
public class t5{
    public static void main(String args[]) {

        int i, j;

        for(i=1; i<=5; i++){
            for(j=1; j<=5-i+1; j++){
                System.out.print("*");
            };
            System.out.println();
        };


    }
}