import java.util.ArrayList;
import java.util.Arrays;

public class practice {

    public static int minDistance(ArrayList<String> list, String word1, String word2){

        int lastIndex1 = -1;
        int lastIndex2 = -1;
        int res = Integer.MAX_VALUE;

        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals(word1)){
                lastIndex1 = i;

                if(lastIndex2 != -1){
                    res = Math.min(res, Math.abs(lastIndex1 - lastIndex2));
                }
            }

            if(list.get(i).equals(word2)){
                lastIndex2 = i;

                if(lastIndex1 != -1){
                    res = Math.min(res, Math.abs(lastIndex1 - lastIndex2));
                }
            }
        }

        return res;
    }
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>( Arrays.asList("geeks", "for", "geeks", "contribute", "practice"));
        String word1 = "geeks";
        String word2 = "practice";

        System.out.println("Min Distance is: "+ minDistance(list, word1, word2));
    }
}
