import java.util.ArrayList;

public class Position {
    public static void main(String[] args) {
        int[] arr = {1,51,436,7860,41236};
        int sum=0;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(i==0){
                ans.add((arr[i]%10));
            }
            else if(i==1){
                if(arr[i]>99)
                    ans.add((arr[i]/10)%10);
                else
                    ans.add(arr[i]/10);
            }
            else{
                ans.add((int)(arr[i]/(Math.pow(10, i)))%10);
            }            
        }

        for(Integer e:ans){
            sum += Math.pow(e, 2);
        }
        System.out.println(sum);
    }
}
