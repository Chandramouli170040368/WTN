package languagebasics;

public class ex18 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int c=0;
		while(a!=0)
		{
		   int k=a%10;
		   c=c+k;
		   a=a/10;
		}
		System.out.println(c);

	}

}
