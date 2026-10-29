import java.util.Arrays;
import java.util.Comparator;

public class Activity_selection{
    public static int check(int start[], int finish[]){

        int n = start.length;

        int[][] activity = new int[n][2];

        for (int i = 0; i < n; i++) {
            activity[i][0] = start[i];
            activity[i][1] = finish[i];
        }

        // Sort by finishing time
        Arrays.sort(activity, Comparator.comparingInt(a -> a[1]));

        int count = 1;
        int lastEnd = activity[0][1];

        for (int i = 1; i < n; i++) {
            if (activity[i][0] > lastEnd) {
                count++;
                lastEnd = activity[i][1];
            }
        }

        return count;
    }
    public static void main(String args[]){
        int start[] = {1, 3, 0, 5, 8, 5};
        int finish[] = {2, 4, 6, 7, 9, 9};

        System.out.println(check(start, finish));
    }
}