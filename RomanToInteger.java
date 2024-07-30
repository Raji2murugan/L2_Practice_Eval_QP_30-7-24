package Evaluation2;

import java.util.Scanner;

//Time:2.45 PM

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Roman value");
		String s = sc.nextLine();
		// String s = "IV";
		int result = 0;
			for (int i = 0; i < s.length(); i++) {
					if (i < s.length() - 1 && romanToNumber(s.charAt(i + 1)) > romanToNumber(s.charAt(i)))
							result -= romanToNumber(s.charAt(i));
					else
							result += romanToNumber(s.charAt(i));
				}

		    System.out.println(result);
		}

	static int romanToNumber(char s) {
			switch (s) {
				case 'I':
						return 1;
				case 'V':
						return 5;
				case 'X':
						return 10;
				case 'L':
						return 50;
				case 'C':
						return 100;
				case 'D':
						return 500;
				case 'M':
						return 100;
		}
	 return s;
	}
}