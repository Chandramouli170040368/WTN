package languagebasics;

public class ex20 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		
		while(a!=0)
		{
			int k=a%10;
			System.out.print(k);
			a=a/10;
		}

	}

}
