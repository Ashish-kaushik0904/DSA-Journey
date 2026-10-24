package sliding_window;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class maximum_239 {
    public static int[] windowMax(int arr[], int k) {
        Deque<Integer> dq = new LinkedList<>();
        int result[] = new int[arr.length - k + 1];
        int index = 0;

        for (int j = 0; j < arr.length; j++) {
            // 1:- Remove element Which are outside the window
            while (!dq.isEmpty() && dq.peekFirst() <= j - k) {
                dq.pollFirst();
            }

            // 2:- Remove all smaller element before insert new element
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[j]) {
                dq.pollLast();
            }

            // Push in dequeue
            dq.offerLast(j);

            // When window size hit
            if (j >= k - 1) {
                result[index] = arr[dq.peekFirst()];
                index++;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };

        System.out.print(Arrays.toString(windowMax(arr, 3)));
    }
}
