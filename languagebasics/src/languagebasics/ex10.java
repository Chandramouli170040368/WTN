package languagebasics;

public class ex10 {

	public static void main(String[] args) {
		String a=args[0];
		char c=a.charAt(0);
	    int b=Integer.parseInt(args[1]);
	   
	    if(c=='f')
	    {
	    	if(b>=1 && b<=58)
	    	{
	    		System.out.println("Percentage of interest is 8.2%");
	    	}
	    	else if(b>=59 && b>=100)
	    	{
	    		System.out.println("Percentage of interest is 9.2%");
	    	}
	    }
	    else if(c=='m')
	    {
	    	

	    	if(b>=1 && b<=58)
	    	{
	    		System.out.println("Percentage of interest is 8.4%");
	    	}
	    	else if(b>=59 && b>=100)
	    	{
	    		System.out.println("Percentage of interest is 10.5%");
	    	}
	    }

}
}
