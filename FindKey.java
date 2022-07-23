public class FindKey {

        public static void main(String[] args) {
            char[] input1 = {'g','b','c','d'};
            char[] input2 = {'b','c','d','g'};
            int sum=0;
            int temp =0;
            
            for(char a:input1) {
                for(char b:input2) {
                    if(a==b) {
                        sum+=(int)b;
                    }
                }
            }

            temp = calculate(sum);

            if(temp<10){
                System.out.println(temp);
            }
            else{
                System.out.println(calculate(temp));
            }

            
    
        }

        public static int calculate(int num){
            int temp = 0;
            while(num>0){
                int rem = num%10;
                temp += rem;
                num/=10;
            }

            return temp;
        }
    
}
