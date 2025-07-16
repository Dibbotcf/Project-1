import java.util.ArrayList;
import java.util.Collections;

public class KthSmallestElement {

    /**
     * Returns the kth smallest element from the list.
     * Assumes 1-based indexing for k.
     */
    public static Integer findKthSmallest(ArrayList<Integer> list, int k) {
        if (list == null || k <= 0 || k > list.size()) {
            throw new IllegalArgumentException("Invalid input");
        }
        // Sort the list to access the kth smallest element
        Collections.sort(list);
        return list.get(k - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 7, 10, 4, 3, 20, 15);

        int k = 3;
        System.out.println(k + "th smallest element is: " + findKthSmallest(numbers, k));
    }
}
