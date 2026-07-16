public class remDup{

    public static void removeDup(int idx, String str, StringBuilder newStr, boolean map[]){

        if(idx==str.length()){

            System.out.println(newStr);
            return;

        }

        char currChar = str.charAt(idx);

        if(map[currChar-'a']==true){
            removeDup(idx+1,str,newStr,map);
        }
        else{
            map[currChar-'a'] = true;
            newStr.append(currChar);
            removeDup(idx+1,str,newStr,map);
        }

    }

    public static void main(String args[]){

        StringBuilder newStr = new StringBuilder();
        boolean map[] = new boolean[26];

        removeDup(0, "aappnnaacoollege",newStr, map );

    }
}
