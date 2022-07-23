package tasks;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String val = sc.next();
		BinaryToDecimal btd = new BinaryToDecimal();
		
		System.out.println(btd.convertToDecimal(val));

	}
	
	public int convertToDecimal(String num) {
		int dec=0;
		char[] val = num.toCharArray();
		if(!(num.contains("0")||num.contains("1"))) {
			return -1;
		}
		else {
			for(int i=0;i<val.length;i++) {
				dec += (int) (Integer.parseInt(""+val[i])*(Math.pow(2, (val.length-i)-1)));
			}
			return dec;
		}
		
		
	}

}
