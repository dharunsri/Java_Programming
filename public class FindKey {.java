public class FindKey {

        public static void main(String[] args) {
            char[] arr1 = {'a','b','c'};
            char[] arr2 = {'b','c'};
            int sum=0;
            
            for(char a:arr1) {
                for(char b:arr2) {
                    if(a==b) {
                        sum+=(int)b;
                    }
                }
            }
            
            System.out.println(sum);
    
        }
    
}
