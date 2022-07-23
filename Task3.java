import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int n,inc,count=0,total=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        int[] new_arr = new int[n];
        inc=0;

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
        int m=0;
        while(m<n){
            count=0;
            for(int l=0;l<n;l++){
                if(arr[m]==arr[l])
                    count++;
            }
            m=count;
            if(count>0){
                total+=1;
            }
            
        }
        System.out.println(total+1);
    }
    
}
