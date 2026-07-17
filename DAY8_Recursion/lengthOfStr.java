public class lengthOfStr {
public static int length(String str, int idx) {
if(str.length() == idx) {
return 0;
}

int count= 1;

return count + length( str, idx+1);

}

 public static int length(String str) {
        if (str.length() == 0) {
            return 0;
        }                                                 //works tooooooooo!

        return 1 + length(str.substring(1));
    } 

public static void main(String[] args) {
String str = "abcde";
System.out.println(length(str));
}
}