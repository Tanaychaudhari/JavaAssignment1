package RectAngle;

import java.util.Scanner;
public class assign3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n,i,j;
		System.out.println("enter number :");
		n= sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
			System.out.print(" * ");
		}
		    System.out.println();

	}
    }
}
