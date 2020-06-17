package languagebasics;

public class ex31 {

	public static void main(String[] args) {
		int[] a;
		int b[];
		a=new int[(args.length)];
		b=new int[20];
		int c=0;
		for(int i=0;i<20;i++)
		{
			System.out.print(b[i]);
		}
		
		for(int i=0;i<a.length;i++)
		{
		   	a[i]=Integer.parseInt(args[i]);
		   	if(a[i]!=10)
		   	{
		   		System.out.print(a[i]+" ");
		   		c=c+1;
		   	}
		}
		for(int i=0;i<c;i++)
		{
			System.out.print(0+" ");
		}

	}

}
