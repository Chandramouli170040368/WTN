package languagebasics;

public class ex5 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		if(a>0)
		{
			System.out.println("Positive");
		}
		else if(a<0)
		{
			System.out.println("Negative");
		}
		else if(a==0)
		{
			System.out.println("Zero");
		}

	}

}
