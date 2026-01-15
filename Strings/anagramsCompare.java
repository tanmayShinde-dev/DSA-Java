import java.util.*;

public class anagramsCompare{

    public static boolean anagramsCompare(String a, String b){

        a=a.toLowerCase();
        b=b.toLowerCase();

        if(a.length()==b.length()){
            char[] chararr1 = a.toCharArray(); 
            char[] chararr2 = b.toCharArray();

            Arrays.sort(chararr1);
            Arrays.sort(chararr2);

            boolean result=Arrays.equals(chararr1, chararr2);

           return result;


        }
        else{
            return false;
        }
    }

    public static void main(String args[]){
             String name="earth";
             String fame="htrae"; 
             boolean pep=(anagramsCompare(name,fame));
             System.out.println(pep);
    }
}