import java.util.HashSet;

public class ArrayIntersection {
    public static void findIntersection(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : a) {
            set.add(num);
        }

        for (int num : b) {
            if (set.contains(num)) {
                System.out.print(num + " ");
                set.remove(num); // avoid duplicates
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {2, 3, 4};

        System.out.print("Intersection: ");
        findIntersection(a, b);
    }
}