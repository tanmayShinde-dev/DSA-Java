public class binString{

    public static void binString(int n, String str, int lastPos){

        if(n==0){

            System.out.println(str);
            return;

        }

        binString(n-1, str+"0", 0);

        if(lastPos==0){

            binString(n-1, str+"1", 1);

        }

    }

    public static void main(String args[]){

        String str="";

        binString(3, str, 0);

    }
}