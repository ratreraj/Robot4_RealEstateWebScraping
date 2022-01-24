package seleniumInterviewPractise;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		 StringBuffer rev = sb.reverse();
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder rev= sb.reverse();
		 System.out.println("Reverse number is "+rev);
		
		

	}

}
