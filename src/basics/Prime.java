package basics;

import java.util.Scanner;

public class Prime {
	public static void main(String args[])
	{

	int n,i,flag=1;

	Scanner s=new Scanner(System.in);

	System.out.println("enter number:");

	n=s.nextInt();

	for(i=2;i<=n/2;i++)

	{

	if(n%i==0)

	{ flag=0;

	break;}

	}

	if(flag==0)

	System.out.println("not prime");

	else

	System.out.println("prime");

	}
}
