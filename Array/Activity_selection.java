import java.util.ArrayList;

public class Activity_selection{
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        int maxAct = 0;
        ArrayList<Integer> list = new ArrayList<>();

        // 1st activity
        maxAct = 1;
        list.add(0);
        int lastEnd = end[0];

        for(int i=1; i<start.length; i++){
            if(start[i] >= lastEnd){
                // Activity Select
                maxAct++;
                list.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("Max Activity: "+ maxAct);
        for(int i=0; i<list.size(); i++){
            System.out.print("A"+list.get(i)+" ");
        }
    }
}