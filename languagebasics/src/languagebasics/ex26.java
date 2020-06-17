package languagebasics;

public class ex26 {

	public static void main(String[] args) {
		int a[];
		a=new int[(args.length)];
		for(int i=0;i<a.length;i++)
		{
		   	a[i]=Integer.parseInt(args[i]);
		   	char c=(char)a[i];
		   	System.out.print(c);
		}
		

	}

}
