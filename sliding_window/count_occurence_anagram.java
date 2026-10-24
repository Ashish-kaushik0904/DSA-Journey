package sliding_window;

import java.util.HashMap;

public class count_occurence_anagram {
    public static int countAnagrams(String str, String pattern) {

        HashMap<Character, Integer> map = new HashMap<>();

        int k = pattern.length();
        int count = 0;
        int ans = 0;
        int i = 0;
        int j = 0;

        // Step 1: Store the frequency of each character in pattern
        for (int x = 0; x < k; x++) {
            char ch = pattern.charAt(x);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Count distinct characters in the pattern
        count = map.size();

        // Step 3: Apply the sliding window technique
        while (j < str.length()) {

            // Step 4: Process the character entering the window
            char right = str.charAt(j);

            if (map.containsKey(right)) {

                map.put(right, map.get(right) - 1);

                // All required occurrences of this character are matched
                if (map.get(right) == 0) {
                    count--;
                }
            }

            // Step 5: Check when the window size reaches k
            if (j - i + 1 == k) {

                // All distinct character frequencies are matched
                if (count == 0) {
                    ans++;
                }

                // Step 6: Remove the leftmost character
                char left = str.charAt(i);

                if (map.containsKey(left)) {

                    // If its frequency was zero, removing it breaks a match
                    if (map.get(left) == 0) {
                        count++;
                    }

                    map.put(left, map.get(left) + 1);
                }

                // Move the left pointer forward
                i++;
            }

            // Move the right pointer forward
            j++;
        }

        // Step 7: Return total anagram occurrences
        return ans;
    }

    public static void main(String[] args) {

        String str = "forxxorfxdofr";
        String pattern = "for";

        System.out.println(countAnagrams(str, pattern));
    }
}
