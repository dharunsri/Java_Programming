import java.util.*;
public class PrimeIndex {
    public static void main(String[] args) {
        int inp1 = 1274;
        int inp2 = 5283;
        int inp3 = 1937;
        String s=""+inp1+inp2+inp3;
        char a[]= s.toCharArray();
        Arrays.sort(a);
        int high=Integer.parseInt(""+a[a.length-1]);
        int low=Integer.parseInt(""+a[0]);
        ArrayList<Integer> obj=new ArrayList<Integer>();
        String start=""+a[0],str="";
        for(int i=0;i<a.length;i++){
            if(start.equals(""+a[i])){
                  str+=""+a[i];
            }
            else{
                if((""+a[i-1]).equals("0")){
                    str="-"+str.length();
                }
                obj.add(Integer.parseInt(str));
                str=""+a[i];
                start=""+a[i];
            }
        }
        Collections.sort(obj);
        int se=obj.get(0);
        if(obj.get(0)<0){
           se=obj.get(1);
        }
        String first=""+ (""+obj.get(obj.size()-1)).charAt(0);
        System.out.println(first+se+high+low); 
         
    }
}
