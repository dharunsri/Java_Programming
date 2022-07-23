import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class PrimeSum{
    public static void main(String[] args) {
        int[] arr = {10,41,18,50,43,31,29,25,59,96,67};
        int count = 0,sum=0;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i:arr){
            count=0;
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==1){
                ans.add(i);
            }
        }
        Arrays.sort(arr);
        if(ans.size()==0){
            for(int m:arr){
                sum+=m;
            }
        }
        else{
            Collections.sort(ans);

            for(int n=1;n<ans.size();n++){
                sum += ans.get(n);
            }
        }
        System.out.println(sum);
    }
}