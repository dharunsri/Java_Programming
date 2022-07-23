import java.util.ArrayList;

public class Encode {
    public static void main(String[] args) {
        int[] arr = {100,1,839,1836,610,757};
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();

        for(int e:arr){
            int val=0,num=0;
            while(e>0){
                int rem = e%10;
                int digit = Math.abs(5-rem);
                val = (val*10)+digit;
                e/=10;
            }
            arr2.add(adder(val));
        }

        for(int i:arr2){
            int num=0;

            num = adder(i);
            if(num<10)
                arr3.add(num);
            else{
                arr3.add(adder(num));
            }
                
        }

        int ans = 0;
        for(int j:arr3){
            ans+=j;
        }
        int t=0;
        if(ans>10){
            t=adder(ans);
        }
        System.out.println(t);
    }

    public static int adder(int val){
        int t=0;
        while(val>0){
            t += val%10;
            val/=10;
        }
        return t;
    }
}
