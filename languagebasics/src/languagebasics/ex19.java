package languagebasics;

public class ex19 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		String s="*";
		int c=1;
		while(a!=0)
		{
			System.out.println(s.repeat(c)+" ");
			c=c+1;
			a=a-1;
	    }
	}

}
