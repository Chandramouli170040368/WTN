package languagebasics;

public class ex7 {

	public static void main(String[] args) {
		if(args==null)
		{
			System.out.println("No Values");
		}
		else {
		for(int i=0;i<args.length;i++)
		{
			if(i!=0)
			{
			System.out.print(",");
			System.out.print(args[i]);
			}
			else
			{
				System.out.print(args[i]);
			}
	}
		}

}
}
