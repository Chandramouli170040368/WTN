package languagebasics;

public class ex25 {

	public static void main(String[] args) {
		int a[];
		int k=3;
		int s=0;
		a=new int[(args.length)];
		for(int i=0;i<a.length;i++)
		{
		   	a[i]=Integer.parseInt(args[i]);
		   	if(k==a[i])
		   	{
		   		System.out.println(i);
		   		s=1;
		   		break;
		   	}
		}
		if(s==0)
		{
			System.out.println("-1");
		}

		
	}

}
