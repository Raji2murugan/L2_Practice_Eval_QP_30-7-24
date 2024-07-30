package Evaluation2;

//Time: 3.10 PM
import java.util.Scanner;

public class countNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Give a Number");
		int n=sc.nextInt();
		int count=1,k;
		String n1=n+"";
		String ans="";
		
		for( k=1;k<n1.length();k++)
		{
			if(n1.charAt(k-1)==n1.charAt(k))
				count++;
			else {
				ans+=count+""+n1.charAt(k-1);
				count=1;
			}
				
		}
		ans+=count+""+n1.charAt(k-1);

		System.out.println(ans);

	}

}
