import java.util.*;

public class Shortest_Word_Distance_243 {

   public static int count(ArrayList<String> s, String word1, String word2) {
      int lastindexword1 = -1;
      int lastindexword2 = -1;
      int res = Integer.MAX_VALUE;

      for (int i = 0; i < s.size(); i++) {
         if (s.get(i).equals(word1)) {
            lastindexword1 = i;

            if (lastindexword2 != -1) {
               res = Math.min(res, Math.abs(lastindexword1 - lastindexword2));
            }
         }

         if (s.get(i).equals(word2)) {
            lastindexword2 = i;

            if (lastindexword1 != -1) {
               res = Math.min(res, Math.abs(lastindexword1 - lastindexword2));
            }
         }
      }

      return res;
   }

   public static void main(String args[]) {
      ArrayList<String> list = new ArrayList<>(Arrays.asList("geeks", "for", "geeks", "contribute", "practice"));
      System.out.println(count(list, "geeks", "practice"));
   }
}


// Brute Force **********************************************

// import java.util.*;

// public class practice{

//    public static int count(ArrayList<String> s, String word1, String word2){

//       int findiss = Integer.MAX_VALUE;
//       ArrayList<Integer> w1 = new ArrayList<>();
//       ArrayList<Integer> w2 = new ArrayList<>();

//        for(int i=0; i<s.size(); i++){
//           if(s.get(i) == word1){
//             w1.add(i);
//           }

//           if(s.get(i) == word2){
//             w2.add(i);
//           }
//        }

//        for(int i=0; i<w1.size(); i++){
//          for(int j=0; j<w2.size(); j++){
//             int currdiff = Math.abs(w1.get(i) - w2.get(j));

//             findiss = Math.min(currdiff, findiss);
//          }
//        }
//        return findiss;
//    }
//    public static void main(String args[]){
//       ArrayList<String> list = new ArrayList<>(Arrays.asList("geeks", "for", "geeks", "contribute", "practice"));
//       System.out.println(count(list, "geeks", "practice"));
//    }
// }