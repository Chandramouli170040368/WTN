package languagebasics;

public class ex35 {

	public static void main(String[] args) {
		int a[]=new int[args.length];
		int i;
		for(i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		if(a.length==4)
		{
			for(i=3;i>=2;i--)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println("");
		for(i=1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	    }
		else {
			System.out.println("Enter 4 elements");
		}
	}
}
