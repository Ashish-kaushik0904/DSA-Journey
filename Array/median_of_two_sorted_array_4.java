public class median_of_two_sorted_array_4 {
    public static double findMedian(int arr1[], int arr2[]) {

    int i = 0;
    int j = 0;

    int total = arr1.length + arr2.length;

    int prev = 0;
    int curr = 0;

    for (int k = 0; k <= total / 2; k++) {

      prev = curr;

      if (i < arr1.length &&
          (j >= arr2.length || arr1[i] < arr2[j])) {

        curr = arr1[i];
        i++;

      } else {

        curr = arr2[j];
        j++;
      }
    }

    if (total % 2 != 0) {
      return curr;
    }

    return (prev + curr) / 2.0;
  }

  public static void main(String args[]) {
    int arr1[] = { 1, 2, 3, 9, 11 };
    int arr2[] = { 3, 5, 7, 8 };

    System.out.println(findMedian(arr1, arr2));
  }
}



// Extra soln when we first store element into new merged element then find median

// public class median_of_two_sorted_array_4 {

//   public static double display(int arr1[], int arr2[]) {

//     int i = 0;
//     int j = 0;
//     int k = 0;
//     int len = arr1.length + arr2.length;

//     int merge[] = new int[len];

//     while (i < arr1.length && j < arr2.length) {
//       if (arr1[i] < arr2[j]) {
//         merge[k] = arr1[i];
//         k++;
//         i++;
//       } else {
//         merge[k] = arr2[j];
//         k++;
//         j++;
//       }
//     }

//     while (i < arr1.length) {
//       merge[k] = arr1[i];
//       k++;
//       i++;
//     }

//     while (j < arr2.length) {
//       merge[k] = arr2[j];
//       k++;
//       j++;
//     }

//     // Find Median
//       double median = 0;
//       if(merge.length%2 != 0){
//           median = merge[(merge.length/2)];
//       }
//       else{
//         median = (merge[(merge.length/2)-1] + merge[(merge.length/2)])/2.0;
//       }

//       return median;
//   }

//   public static void main(String args[]) {
//     int arr1[] = { 1, 2, 4, 9, 11 };
//     int arr2[] = { 3, 5, 7, 8 };

//     System.out.println(display(arr1, arr2));
//   }
// }
