public class First {
    public static void main(String[] args) {
        int[] arr = {1,2,4,1,2,8};

        int count = 0,ans=0,c=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
            count=0;
            for(int j=1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    ans = arr[i];
                    count++;
                    c = count;
                    break;
                }
            }
        }
        }
        if(count==0 && arr[0]<=0){
            System.out.println("0");
        }
        else if(count==0){
            System.out.println(arr[0]);
        }
        else if(count>c){
            System.out.println(arr[]);
        }

    }
}
