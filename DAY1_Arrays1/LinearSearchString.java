public class LinearSearchString {

    public static int linearSearch(String arr[], String key) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {   // use equals() for String comparison
                return i;
            }
        }
        return -1;
    }



    public static void main(String args[]) {

        String arr1[] = {"Apple", "Banana", "Mango", "Orange", "Grapes"};
        String key = "Mango";

        int a = linearSearch(arr1, key);

        if (a == -1) {
            System.out.print("Key not found");
        } else {
            System.out.print("Key found at index: " + a);
        }
    }
}
