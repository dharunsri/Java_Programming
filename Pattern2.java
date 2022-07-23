import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        int n;
        char alpha;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        alpha = sc.next().charAt(0);

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(alpha+j));
            }
            System.out.println();
        }

    }
}
