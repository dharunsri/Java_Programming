import java.util.*;  
public class CountElement {  
    public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array: ");
      int n = sc.nextInt();
      int arr[] = new int[n];
      int occur[] = new int[n];
      Arrays.fill(occur, 0);
      System.out.println("Enter values");
      for(int i=0; i<n; i++) {
         arr[i] = sc.nextInt();
         occur[arr[i]]++;
      }
      for(int i=0; i<n; i++) {
          if(occur[i]>1)
            System.out.println(i +" -> "+ occur[i] + " times");
      }
 }
}   