package tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class DecimalToHexa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		DecimalToHexa dth = new DecimalToHexa();
		System.out.println(dth.decimalToHexa(val));
	}
	
	public String decimalToHexa(int num) {
		String hexa = "";
		int rem;
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(11);
		arr.add(12);
		arr.add(13);
		arr.add(14);
		arr.add(15);
		
		ArrayList<Character> arr2 = new ArrayList<>();
		arr2.add('A');
		arr2.add('B');
		arr2.add('C');
		arr2.add('D');
		arr2.add('E');
		arr2.add('F');
				
		while(num>0) {
			rem = num%16;
			if(rem>9) {
				hexa+=arr2.get(arr.indexOf(rem));
			}
			else {
				hexa+=rem;
			}
			num/=16;
		}
		
		return ""+new StringBuilder(hexa).reverse();
	}

}
