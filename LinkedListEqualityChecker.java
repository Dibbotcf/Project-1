import java.util.LinkedList;

public class LinkedListEqualityChecker {

    /**
     * Checks equality of two LinkedLists element by element.
     */
    public static <T> boolean areEqual(LinkedList<T> list1, LinkedList<T> list2) {
        if (list1.size() != list2.size()) return false;

        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList<String> listA = new LinkedList<>();
        LinkedList<String> listB = new LinkedList<>();

        listA.add("apple");
        listA.add("banana");
        listA.add("cherry");

        listB.add("apple");
        listB.add("banana");
        listB.add("cherry");

        System.out.println("Are lists equal? " + areEqual(listA, listB));

        listB.removeLast();
        listB.add("date");

        System.out.println("Are lists equal after modification? " + areEqual(listA, listB));
    }
}
