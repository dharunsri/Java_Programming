import java.util.ArrayList;
import java.util.Arrays;

public class Part {
    public static void main(String[] args) {
        int[] arr = {5,123,12,45,62,77,89,23,12,14,11,14,12,89,90,12};
        int n = arr.length;
        int part1 = leastFrequent(arr, n);
        int part3 = mostFrequent(arr, n);

        for(int i=0;i<arr.length;i++){
            if(arr[i]==part3){
                arr[i]=0;
            }
            else{
                arr[i] = arr[i];
            }
            
        }

        int part2 = mostFrequent(arr, n);
        String temp = ""+part1+""+part2+""+part3;

        System.out.println(temp);
        }

    public static int mostFrequent(int[] arr, int n)
  {
    int maxcount = 1;
    ArrayList<Integer> arr2 = new ArrayList<>();
    int element_having_max_freq = 0;
    for (int i = 0; i < n; i++) {
        if(arr[i]!=0){
      int count = 0;
      for (int j = 0; j < n; j++) {
        if (arr[i] == arr[j]) {
          count++;
        }
      }
 
      if (count > maxcount) {
        maxcount = count;
        arr2.add(arr[i]);
        element_having_max_freq = arr[i];
      }
    }
}
for(Integer e:arr2){
  if(e>element_having_max_freq){
    element_having_max_freq=e;
  }
}

  System.out.println(arr2);
 
    return element_having_max_freq;
  }

  public static int leastFrequent(int[] arr, int n)
    {
        Arrays.sort(arr);
        int min_count = n+1, res = -1;
        int curr_count = 1;
         
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else {
                if (curr_count < min_count) {
                    min_count = curr_count;
                    res = arr[i - 1];
                }
                 
                curr_count = 1;
            }
        }
        if (curr_count < min_count)
        {
            min_count = curr_count;
            res = arr[n - 1];
        }
     
        return res;
    }
    
}
