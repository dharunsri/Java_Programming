public class Form {
    public static void main(String[] args) {
        String input = "ww:ii:pp:rr:oo";

        String[] arr = input.split(":");
        String ans = "";
        for(String e:arr){
            if(e.charAt(0)==e.charAt(1)){
                ans+=e.charAt(0);
            }
        }
        System.out.println(ans.toUpperCase());
    }
}
