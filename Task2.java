import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        int temp;
        for(int j=0;j<n;j++){
            for(int k=j+1;k<n;k++){
                if(arr[j]>arr[k]){
                    temp = arr[j];
                    arr[j] = arr[k];
                    arr[k]= temp;
                }
                if(arr[j]==0){
                    temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int a:arr)
            System.out.print(a+" ");
    }
    
}
