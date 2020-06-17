package languagebasics;

import java.util.Arrays;

public class ex24 {

	public static void main(String[] args) {
		int a[];
		a=new int[args.length];
		for(int i=0;i<a.length;i++)
		{
		   	a[i]=Integer.parseInt(args[i]);
		}
		Arrays.sort(a);
		System.out.println("Minimum of array is "+a[0]);
		System.out.println("Maximum of array is "+a[(a.length)-1]);
	}

	}
