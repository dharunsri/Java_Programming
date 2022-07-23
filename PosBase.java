public class PosBase {
    public static void main(String[] args){
        int[] a={1,51,436,7860,41236};
        int pos=a.length-1,n=a.length-1,sum=0,s;

        String str;
        for(int b:a){
            str=""+b;
            if(!(n-pos>str.length()-1)){
                s=Integer.parseInt(""+str.charAt((str.length()-1)-(n-pos)));
                sum=sum+(s*s);
                System.out.println(s*s);

            }
        }
        System.out.println(sum);
    }
}
