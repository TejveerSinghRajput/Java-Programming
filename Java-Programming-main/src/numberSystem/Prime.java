package numberSystem;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number = ");
		long n = sc.nextLong();
		
		for(long i=0; i<n; i++)
		{
			long s1 = (6*i)+1;
			long s2 = (6*i)-1;
			if( s1==n || s2==n )
			{
				System.out.println("Prime");
			}
			
		}

	}

}
