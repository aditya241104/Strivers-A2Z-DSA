package SimpleHashing;

import java.util.HashMap;
import java.util.Map;

public class frequencyelement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 3, 1, 3, 3,1,1,1,1,1,3,3,3,3,3,3,3};

        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1); // Fix here
        }

        int maxFreq = 0;
        int result = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > maxFreq || (value == maxFreq && key < result)) {
                maxFreq = value;
                result = key;
            }
        }

        System.out.println("Most frequent element: " + result+" repeated "+ maxFreq+" times");
    }
}
