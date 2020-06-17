package languagebasics;

public class ex23 {

	public static void main(String[] args) {
		int a[];
		int s=0;
		float k;
		a=new int[args.length];
		for(int i=0;i<a.length;i++)
		{
		   	a[i]=Integer.parseInt(args[i]);
		   	s=s+a[i];
		}
		System.out.println("Sum is "+s);
		k=s/(args.length);
		System.out.println("Average is "+k);
	}

}
