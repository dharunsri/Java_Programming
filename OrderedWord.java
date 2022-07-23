public class OrderedWord {
    public static void main(String[] args) {
        String input1 = "Egg Ant Pen";
        int count=0, count2=0;

        String[] arr = input1.split(" ");

        for(String e:arr){
            count=0;
            for(int i=0;i<e.length()-1;i++){
                if((int)e.charAt(i)<(int)e.charAt(i+1) || (int)e.charAt(i)==(int)e.charAt(i+1)){
                    count++;
                }
            }
            if(count==e.length()-1){
                count2++;
            }
        }
        System.out.println(count2);
    }
}
