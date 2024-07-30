package Evaluation2;

import java.util.Arrays;
import java.util.Scanner;

//Time: 3.20 PM
public class parenthesisGenerate {

	private static void createBracket(String current, int open, int close, int max) {
		if (current.length() == max * 2) {
			System.out.println(current);
			return;
		}

		if (open < max) {
			createBracket(current + "(", open + 1, close, max);
		}
		if (close < open) {
			createBracket(current + ")", open, close + 1, max);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		createBracket("", 0, 0, n);

	}

}
