import java.util.ArrayList;
import java.util.HashMap;

public class three_digit_even_nums {
    public static int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> set = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < digits.length; i++) {
            if (map.containsKey(digits[i])) {
                int count = map.get(digits[i]);
                map.put(digits[i], count + 1);
            } else {
                map.put(digits[i], 1);
            }
        }

        for (int i = 100; i <= 999; i += 2) {
            int x = i;
            int c = x % 10;
            x /= 10;
            int b = x % 10;
            x /= 10;
            int a = x;

            HashMap<Integer, Integer> tmap = new HashMap<>(map);

            if (tmap.containsKey(a)) {
                int afreq = tmap.get(a);
                tmap.put(a, afreq - 1);
                if (tmap.get(a) == 0)
                    tmap.remove(a);

                if (tmap.containsKey(b)) {
                    int bfreq = tmap.get(b);
                    tmap.put(b, bfreq - 1);
                    if (tmap.get(b) == 0)
                        tmap.remove(b);

                    if (tmap.containsKey(c)) {
                        set.add(i);
                    }
                }
            }
        }

        // System.out.println(set);

        int[] ans = new int[set.size()];
        for (int i = 0; i < set.size(); i++) {
            ans[i] = set.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] digits = { 2, 1, 3, 0 };

        int[] ans = findEvenNumbers(digits);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
