public class Equal_Point_in_Brackets {

   public static int count(String str) {
      int opcount = 0;
      int clcount = 0;
      char[] ch = str.toCharArray();

      for (char i : ch) {
         if (i == ')') {
            clcount++;
         }
      }

      for (char i = 0; i < ch.length; i++) {
         if (i == '(') {
            opcount++;
         } else {
            clcount--;
         }

         if (opcount == clcount) {
            return i + 1;
         }
      }
      return 0;
   }

   public static void main(String args[]) {
      String str = "(())))(";
      System.out.println(count(str));
   }
}