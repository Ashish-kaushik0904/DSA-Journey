public class length_of_last_word_58 {
     public static int length(String s){
      String res = s.trim();
      int count = 0;

      for(int i=res.length()-1; i>=0; i--){
         if(res.charAt(i) != ' '){
             count++;
         }
         else{
            break;
         }
      }

      return count;
   }
   public static void main(String args[]){
      String str = "  the moon is blue  ";
      System.out.println(length(str));
   }
}
