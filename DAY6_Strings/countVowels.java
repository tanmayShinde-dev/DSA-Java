import java.util.*;

public class countVowels{
                  //String
    public static int countVowels(String str){
    int i=0;
    int count=0;
    while(i<str.length()){
        if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
            count++;
            i++;
        }
        else{
            i++;
        }
    }
    return count;
        
    }

    public static void main(String args[]){
             String name="hi! I am tanmay "; 
             int pep=(countVowels(name));
             System.out.println(pep); 
    }
}