public class prefix_word_1455 {

    public static int isPrefix(String str, String searchWord){

        String[] arr = str.split(" ");
        
         for(int i=0; i<arr.length; i++){
             if(arr[i].startsWith(searchWord)){
                return i+1;
             }
         }

         return -1;
    }
    public static void main(String args[]){
        String str = "this problem is an easy problem";
        String searchWord = "pro";

        System.out.println(isPrefix(str, searchWord));
    }
}
