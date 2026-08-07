public class StringMergeSort {

    // Compare two strings alphabetically
    public static boolean isAlphabeticallySmaller(String str1, String str2) {
        return str1.compareTo(str2) < 0;
    }

    // Merge two sorted arrays
    public static String[] merge(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        String[] arr3 = new String[m + n];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1
        while (i < m) {
            arr3[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2
        while (j < n) {
            arr3[k++] = arr2[j++];
        }

        return arr3;
    }

    // Merge Sort
    public static String[] mergeSort(String[] str, int lo, int hi) {

        if (lo == hi) {
            String[] A = { str[lo] };
            return A;
        }

        int mid = lo + (hi - lo) / 2;

        String[] left = mergeSort(str, lo, mid);
        String[] right = mergeSort(str, mid + 1, hi);

        return merge(left, right);
    }

    public static void main(String[] args) {

        String[] arr = {
                "sun",
                "earth",
                "mars",
                "mercury"
        };

        String[] sorted = mergeSort(arr, 0, arr.length - 1);

        for (String s : sorted) {
            System.out.println(s);
        }
    }
}