public class NoToDig {

    static String digits[] = {
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine"
    };

    public static void printDigits(int number) {

        // Base case
        if (number == 0) {
            return;
        }

        // Get thelast digit
        int lastDigit = number % 10;

        // Recursive call
        printDigits(number / 10);

        // Print the digit in words
        System.out.print(digits[lastDigit] + " ");
    }

    public static void main(String[] args) {

        int number = 1230;

        if (number == 0) {
            System.out.println("zero");
        } else {
            printDigits(number);
        }
    }
}