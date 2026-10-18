import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three_sum_15 {

   public static List<List<Integer>> threeSum(int arr[]) {

      Arrays.sort(arr);
      List<List<Integer>> list = new ArrayList<>();

      // we need to traverse i, 2 element before last element
      for (int i = 0; i < arr.length - 2; i++) {

         // When we move i, if i+1 == i then again move i duplicate i not consider again
         if (i > 0 && arr[i] == arr[i - 1]) {
            continue;
         }

         int j = i + 1;
         int k = arr.length - 1;

         while (j < k) {
            int sum = arr[i] + arr[j] + arr[k];

            if (sum < 0) {
               j++;
            } else if (sum > 0) {
               k--;
            } else {
               list.add(Arrays.asList(arr[i], arr[j], arr[k]));
               while (j < k && arr[j] == arr[j + 1]) {
                  j++;
               }
               while (j < k && arr[k] == arr[k - 1]) {
                  k--;
               }

               j++;
               k--;
            }
         }

      }
      return list;
   }

   public static void main(String args[]) {
      int arr[] = { -1, 0, 1, 2, -1, -4 };

      System.out.println(threeSum(arr));
   }
}
