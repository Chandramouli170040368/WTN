package languagebasics;

public class ex33 {

	public static void main(String[] args) {
		int a[]=new int[args.length];
		int i;
		int c=0;
		for(i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			if(a[i]==1 || a[i]==4)
			{
			 c=c+1;  
			}
			else {
				c=c-1;
			}
		}
		if(c==a.length)
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
