import java.util.Arrays;

class unionOfSortArrays {

    public static int[] unionArray(int[] nums1, int[] nums2) {

        int i = 0, j = 0, k = 0;

        int[] temp = new int[nums1.length + nums2.length];

        // Traverse both arrays
        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] <= nums2[j]) {

                // Add only if it is not a duplicate
                if (k == 0 || temp[k - 1] != nums1[i]) {
                    temp[k++] = nums1[i];
                }
                i++;

            } else {

                // Add only if it is not a duplicate
                if (k == 0 || temp[k - 1] != nums2[j]) {
                    temp[k++] = nums2[j];
                }
                j++;
            }
        }

        // Copy remaining elements of nums1
        while (i < nums1.length) {

            if (k == 0 || temp[k - 1] != nums1[i]) {
                temp[k++] = nums1[i];
            }
            i++;
        }

        // Copy remaining elements of nums2
        while (j < nums2.length) {

            if (k == 0 || temp[k - 1] != nums2[j]) {
                temp[k++] = nums2[j];
            }
            j++;
        }

        // Return only the filled part of temp
        return Arrays.copyOf(temp, k);
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 7};

        int[] ans = unionArray(nums1, nums2);

        System.out.println(Arrays.toString(ans));
    }
}


/*
import java.util.ArrayList;

public class Main {

    public static ArrayList<Integer> unionArray(int[] nums1, int[] nums2) {

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] <= nums2[j]) {

                // Add only if not a duplicate
                if (ans.size() == 0 || ans.get(ans.size() - 1) != nums1[i]) {
                    ans.add(nums1[i]);
                }
                i++;

            } else {

                // Add only if not a duplicate
                if (ans.size() == 0 || ans.get(ans.size() - 1) != nums2[j]) {
                    ans.add(nums2[j]);
                }
                j++;
            }
        }

        // Add remaining elements of nums1
        while (i < nums1.length) {

            if (ans.size() == 0 || ans.get(ans.size() - 1) != nums1[i]) {
                ans.add(nums1[i]);
            }
            i++;
        }

        // Add remaining elements of nums2
        while (j < nums2.length) {

            if (ans.size() == 0 || ans.get(ans.size() - 1) != nums2[j]) {
                ans.add(nums2[j]);
            }
            j++;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 3, 4, 5};
        int[] nums2 = {2, 3, 5, 6};

        ArrayList<Integer> ans = unionArray(nums1, nums2);

        System.out.println(ans);
    }
}
*/