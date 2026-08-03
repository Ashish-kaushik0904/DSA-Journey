
// Way 1 ***********************************************************************
// public class index_of_substring_occurrence {

//    public static int strStr(String haystack, String needle) {

//       if (needle.length() == 0)
//          return 0;

//       // sadbuts** (bss yhi taak check krna hai first character iske agge hoga bhi to substring puri nhi hogi).
//       for (int i = 0; i <= haystack.length() - needle.length(); i++) {

//          int j = 0;

//          while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
//             j++;
//          }

//          if (j == needle.length())
//             return i;
//       }

//       return -1;
//    }

//    public static void main(String args[]) {
//       String s1 = "sadbutsad";
//       String s2 = "sad";

//       System.out.println(strStr(s1, s2));
//    }
// }


// Way 2 ******************************************************************
public class index_of_substring_occurrence_28 {

   public static int length(String s1, String s2) {
      for (int i = 0; i < s1.length() - s2.length() + 1; i++) {
         if (s1.charAt(i) == s2.charAt(0)) {
            if (s1.substring(i, s2.length() + i).equals(s2)) {
               return i;
            }
         }
      }
      return -1;
   }

   public static void main(String args[]) {
      String s1 = "sadbutsad";
      String s2 = "sad";

      System.out.println(length(s1, s2));
   }
}
