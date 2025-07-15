import java.util.HashSet;

public class basicset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);
        // System.out.println(set);
        System.out.println(set.contains(50));
        System.out.println(set.size());
        System.out.println(set.remove(-8));

        Object[] arr = set.toArray();
    }
}