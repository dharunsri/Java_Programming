import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int n,odd=0,even=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        for(int e:arr){
            if(e%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even numbers: "+even+"  Odd Numbers: "+odd);
    }
    
}
