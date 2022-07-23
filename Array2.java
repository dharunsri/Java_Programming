import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        int[][] arr = new int[m][];

        for(int i=0;i<m;i++){
            n = sc.nextInt();
            arr[i] = new int[n];
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for(int k=0;k<m;k++){
            int max = arr[k][0];
            for(int l=1;l<arr[k].length;l++){
                if(max<arr[k][l]){
                    max = arr[k][l];
                }
            }
            System.out.print(max+" ");
        }


    }
    
}
