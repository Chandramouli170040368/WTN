package languagebasics;

public class ex16 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int c=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0) {
				c=c+1;}
		}
		if(c==2)
		{
			System.out.println("Prime");
		}
		else {
			System.out.println("Not a Prime");
		}

	}

}
