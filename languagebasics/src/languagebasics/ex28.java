package languagebasics;

import java.util.Arrays;

public class ex28 {

	public static void main(String[] args) {
		int a[];
		a=new int[(args.length)];
		for(int i=0;i<a.length;i++)
		{
		   	a[i]=Integer.parseInt(args[i]);
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
	}

}
