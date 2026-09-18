import java.util.*;

public class chocola_problem {

    public static void cost(Integer hor[], Integer ver[]){
        Arrays.sort(hor, Collections.reverseOrder());
        Arrays.sort(ver, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while(h < hor.length && v < ver.length){

            if(ver[v] <= hor[h]){ // Horizontal Cut
               cost += hor[h]*vp;
               hp++;
               h++;
            }
            else{  // Vertical Cut
                cost += ver[v]*hp;
                vp++;
                v++;
            }
        }

        while(h < hor.length){
            cost += hor[h]*vp;
            hp++;
            h++;
        }

        while(v < ver.length){
            cost += ver[v]*hp;
            vp++;
            v++;
        }

        System.out.println("Min. cost is: "+ cost);
    }
    public static void main(String args[]){
        Integer hor[] = {4,2,1};
        Integer ver[] = {4,3,2,1,1};

        cost(hor, ver);
    }
}
