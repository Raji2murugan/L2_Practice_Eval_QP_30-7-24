package Evaluation2;

import java.util.Arrays;

//Time : 4:01 PM

public class indexOfSTRings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ans = "barfoofoobarthefoobarman";// input
		// output=[6,9,12]
		String words[] = new String[] { "bar", "foo", "the" };

		int temp = words[0].length();

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < ans.length(); j += temp) {

				if (ans.substring(j, j + words[i].length()).equals(words[i])) {
					words[i] = j + "";
				}
			}

		}
		System.out.println(Arrays.toString(words));

	}
}
