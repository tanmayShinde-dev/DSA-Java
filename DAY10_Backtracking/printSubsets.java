public class printSubsets {

    public static void findSubsets(String str, int i, String ans) {

        // Base Case
        if (i == str.length()) {

            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // NO Choice (Don't include current character)
        findSubsets(str, i + 1, ans);

        // YES Choice (Include current character)
        findSubsets(str, i + 1, ans + str.charAt(i));
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, 0, "");
    }
}