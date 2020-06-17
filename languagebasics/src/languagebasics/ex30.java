package languagebasics;

import java.util.Arrays;

public class ex30 {

	public static void main(String[] args) {
		int a[];
		int i;
		int k1=0;
		int k2=0;
		a=new int[(args.length)];
		for(i=0;i<a.length;i++)
		{
		   	a[i]=Integer.parseInt(args[i]);
		   	if(a[i]==6)
		   	{
		   		k1=i;
		   	}
		   	if(a[i]==7)
		   	{
		   		k2=i;
		   	}
		}
		int l=0;
		int sum=0;
		if(k1<k2)
		{
			for(i=0;i<a.length;i++)
			{
				if(i>=k1 && i<=k2)
				{
					l=1;
				}
				else {
					sum=sum+a[i];
				}
			}
		}
		else if(k1>k2)
		{
			for(i=0;i<a.length;i++)
			{
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
		
	}
}
		