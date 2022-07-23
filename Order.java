public class Order {
    public static void main(String[] args) {
        String input1 = "tbGB";
        String input2 = "tGBb";
        String ans="";
        int inc = 0,dec=0,count=0;

        for(int i=0;i<input1.length()-1;i++){
            if((int)input1.charAt(i)>(int)input1.charAt(i+1)){
                dec++;
            }
            else{
                inc++;
            }

            if(input1.charAt(i)!=input2.charAt(i)){
                count++;
            }
        }

        if(input1.charAt(input1.length()-1)!=input2.charAt(input2.length()-1)){
            count++;
        }

        if(dec==input1.length()-1){
            ans+="Decreasing:";
        }
        else if(inc==input1.length()-1){
            ans+="Increasing:";
        }

        System.out.println(ans+count);
    }
}
