package tasks;

import java.util.Scanner;

public class KeyGen {
	static int ans = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String val = sc.next();
		val = val.replaceAll("[A-Za-z]", "");
		String ops = val.replaceAll("[A-Za-z0-9]", "");
		String nums = val.replaceAll("[\\W]", "");
		char[] arr1 = nums.toCharArray();
		char[] arr2 = ops.toCharArray();
		ans = findOps(arr2[0], arr1[0], arr1[1]);
		
		for(int i=1;i<arr2.length;i++) {
			if(arr2[i]=='*') {
				ans *= Integer.parseInt(""+arr1[i+1]);
			}
			else if(arr2[i]=='+') {
				ans += Integer.parseInt(""+arr1[i+1]);
			}
			else if(arr2[i]=='-') {
				ans -= Integer.parseInt(""+arr1[i+1]);
			}
			else if(arr2[i]=='/') {
				ans /= Integer.parseInt(""+arr1[i+1]);
			}
		}
		System.out.println(ans);
	}
	
	public static int findOps(char a,char b, char c) {
		if(a=='+') {
			ans = Integer.parseInt(""+b)+Integer.parseInt(""+c);
		}
		else if(a=='-') {
			ans = Integer.parseInt(""+b)-Integer.parseInt(""+c);
		}
		if(a=='*') {
			ans = Integer.parseInt(""+b)*Integer.parseInt(""+c);
		}
		if(a=='/') {
			ans = Integer.parseInt(""+b)/Integer.parseInt(""+c);
		}
		
		return ans;
	}
}
