public class Sum {
    public static void main(String[] args) {
        int input1 = 3521, input2 = 2452, input3 = 1352;

        int sum = 0;
        int min = input3;

        sum = (input1/1000)*((input2/100)%10);

        while(input3>0){
            int rem = input3%10;
            if(rem<min)
                min=rem;
            input3/=10;
        }

        sum += min;

        System.out.println(sum);
    }
}
