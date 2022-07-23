import java.util.Scanner;

public class BigSmall {
    static String big = "";
    static String small = "";
    static int temp;
    static int temp2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int val=0;
        String val2="";

        for(int i=0;i<n;i++){
            val = sc.nextInt();
            val2 += val+" ";
        }

        String original = val2;
        temp2 = val;
        while(true){
            //System.out.println("Hii");
            for(String e:val2.split(" ")){
                if(!e.equals("") &&  Integer.parseInt(e)>temp){
                    temp = Integer.parseInt(e);
                }
                else if(!e.equals("") && Integer.parseInt(e)<temp2){
                    temp2 = Integer.parseInt(e);
                }
            }
            String t = ""+temp;
            String t2 = ""+temp2;
            big+=t+",";
            small+=t2+",";
            val2 = val2.replaceAll(t, "");
            val2 = val2.replaceAll(t2,"");
            temp=0;
            temp2=val;

            if(val2.split(" ").length==(original.split(" ").length)-6)
                break;

            System.out.println(val2.split(" ").length);
        }

        System.out.println(big.substring(0,5));
        System.out.println(small.substring(0,big.length()-1));
         
    }
}
