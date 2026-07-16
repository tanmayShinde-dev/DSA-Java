public class print{
    public static int Avg(int a, int b, int c){
        int avg = ((a + b + c)/3);
        return avg;
    }
    public static boolean isEven(int a){
        if((a % 2)==0){
            return true;
        }
    
            return false;
        
    }

    public static void isPalindrome(int orgNo){
        int temp = orgNo;
        int revNo = 0;
        while(orgNo>0){
            int lastDigit = orgNo%10;
            revNo = revNo * 10 + lastDigit;
            orgNo = orgNo / 10;
        }

        if(temp==revNo){
            System.out.print("is palindrome");
        }
        else{
            System.out.print("is not palindrome");
        }
    }

    public static void main(String args[]){
        isPalindrome(110111);
    }
}