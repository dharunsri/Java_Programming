import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int n,count=1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        for(int j=0;j<n;j++){
            for(int k=j+1;k<n;k++){
                if(arr[k]<arr[j]){
                    int temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int m=0;m<n;m++){
            if(arr[m+1]==arr[m]+1){
                count++;
            }
            else{
                break;
            }
        }
        System.out.println(count);
    }
    
}
