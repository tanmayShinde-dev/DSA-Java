public class findPermutation {

    public static void findPermutation(String str, String ans) {

        // Base Case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Try every character as the next character
        for (int i = 0; i < str.length(); i++) {

            // Current character
            char curr = str.charAt(i);

            // Remove current character from the string
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // Recursive call
            findPermutation(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {

        String str = "abc";

        findPermutation(str, "");
    }
}