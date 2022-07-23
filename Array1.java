import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int n,k,digit,sum=0;
        int total=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] A = new int[n];

        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        k = sc.nextInt();
        sc.close();

        for(int e:A){
            int temp = e;
            sum=0;
            while(temp>0){
                digit = temp%10;
                sum += digit;
                temp=temp/10;
            }
            if(sum==k){
                total+=e;
            }
        }
        System.out.println(total);
        

    }
    
}
