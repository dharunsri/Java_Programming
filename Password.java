import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Password {
    public static void main(String[] args) {
        int inp1 = 8530;
        int inp2 = 5620;
        int inp3 = 7532;

        ArrayList arr = new ArrayList<>();

        String ans = ""+inp1+""+inp2+""+inp3;

        char[] t = ans.toCharArray();

        Arrays.sort(t);

        System.out.println(t[0]);



        String unique=ans;

        for(int i=0;i<ans.length();i++){
            for(int j=i+1;j<ans.length();j++){
            if(ans.charAt(i)==ans.charAt(j)){
                arr.add(ans.charAt(i));
                unique = unique.replaceAll(""+ans.charAt(i), "");
            }
            }
        }
        String repeat = arr.toString().replaceAll("\\D", "");

        

        char[] repeat2 = repeat.toCharArray();
        char[] unique2 = unique.toCharArray();
        Arrays.sort(unique2);

        System.out.println(unique);
        System.out.println(repeat);

        Collections.sort(arr);

        
        System.out.println(arr.get(arr.size()-1)+""+unique2[0]+""+t[t.length-1]+""+t[0]);



        
    }

    
}
