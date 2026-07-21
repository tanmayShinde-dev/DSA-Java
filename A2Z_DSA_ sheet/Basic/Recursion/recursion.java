public class recursion {

    static void printHello(int n) {

        if (n == 0) {
            return;
        }

        System.out.println("Hello");

        printHello(n - 1);
    }

    static void printName(int n) {

        if (n == 0) {
            return;
        }

        System.out.println("Tanmay");

        printName(n - 1);
    }

    static void print(int i, int n) {
    if (i > n) return;

    System.out.println(i);
    print(i + 1, n);
    }

    static void print(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);

        print(n - 1);
    }

    static int printSum(int n) {
    if (n == 1) {
        return 1;
    }

    return n + printSum(n - 1);
    }

    static int fact(int n) {
    if (n == 1 || n == 0) {
        return 1;
    }

    return n * fact(n - 1);
}

static void reverse(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverse(arr, left + 1, right - 1);
    }

     static boolean isPalindrome(String str, int left, int right) {

        if (left >= right) {
            return true;
        }

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        return isPalindrome(str, left + 1, right - 1);

     }
         static int fib(int n) {

        if (n <= 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
    

    


    public static void main(String[] args) {

    printHello(5);

    printName(5);

    int n = 5;

    print(1, n);

    print(5);

    System.out.println(printSum(5));

    System.out.println(fact(5));

    int[] arr = {1, 2, 3, 4, 5};

    reverse(arr, 0, arr.length - 1);

    for (int num : arr) {
        System.out.print(num + " ");
    }

    System.out.println();

    String str = "madam";

    System.out.println(isPalindrome(str, 0, str.length() - 1));

    int fibNum = 6;

    System.out.println(fib(fibNum));
}
}