package languagebasics;
import java.util.*;
public class ex32 {

	public static void main(String[] args) {
		int a[]=new int[args.length];
		int b[]=new int[args.length];
		int i;
		int k=0;
		for(i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			if(a[i]%2==0)
			{
				b=Arrays.copyOf(b,a[i]);
			}
		}
		for(i=0;i<b.length;i++)
		{
			System.out.print(b[i]);
		}
				
	}
	}