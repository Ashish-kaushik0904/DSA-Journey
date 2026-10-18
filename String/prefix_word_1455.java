// public class prefix_word_1455 {

//     public static int isPrefix(String str, String searchWord){

//         String[] arr = str.split(" ");
        
//          for(int i=0; i<arr.length; i++){
//              if(arr[i].startsWith(searchWord)){
//                 return i+1;
//              }
//          }

//          return -1;
//     }
//     public static void main(String args[]){
//         String str = "this problem is an easy problem";
//         String searchWord = "pro";

//         System.out.println(isPrefix(str, searchWord));
//     }
// }


// Way 2:- ****************************************************************

public class prefix_word_1455 {
    public static int isPrefixOfWord(String sentence, String searchWord) {

        String[] arr = sentence.split(" ");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() < searchWord.length()) {
                continue;
            }

            boolean match = true;

            for (int j = 0; j < searchWord.length(); j++) {

                if (arr[i].charAt(j) != searchWord.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return i + 1;
            }
        }

        return -1;
    }

    public static void main(String args[]){
        String sentence = "i love reading books";
    String searchWord = "boo";

    System.out.println(isPrefixOfWord(sentence, searchWord));
    }
}