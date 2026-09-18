// Way 1 (Brute Force)

/* public class Container_With_Most_Water_11 {

    public static int most_water(int heigth[]){
        int max_wtr = 0;
        for(int i=0; i<heigth.length; i++){
            for(int j=0; j<heigth.length; j++){
                int ht = Math.min(heigth[i], heigth[j]);
                int wd = j-i;

               int curr_wtr = ht*wd;
                max_wtr = Math.max(max_wtr, curr_wtr);
            }
        }

        return max_wtr;
    }
    public static void main(String args[]){
        int heigth[] = {1,8,6,2,5,4,8,3,7};

        System.out.println(most_water(heigth));
    }
}*/

// Way 2 (Optimal Two pointer Approach)

public class Container_With_Most_Water_11 {

    public static int most_water(int heigth[]){
        int lp = 0;
        int rp = heigth.length-1;
        int max_wtr = 0;

        while(lp < rp){
            int ht = Math.min(heigth[lp], heigth[rp]);
            int wd = rp - lp;
            int curr_wtr = ht*wd;
            max_wtr = Math.max(curr_wtr, max_wtr);

            if(heigth[lp] < heigth[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }

        return max_wtr;
    }
    public static void main(String args[]){
        int heigth[] = {1,8,6,2,5,4,8,3,7};

        System.out.println(most_water(heigth));
    }
}

