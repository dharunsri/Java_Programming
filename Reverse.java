public class Reverse {
    public static void main(String[] args) {
    String a = "apple";
    String b = "orange";

    String temp = a+b.trim();
    
    for(int i=0;i<temp.length();i++){
        for(int j=i+1;j<temp.length();j++){
            if(temp.charAt(i)==temp.charAt(j)){
                temp.replace(temp.charAt(j), ' ');
            }
        }
    }

    System.out.println(temp);

    }
}
