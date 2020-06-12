package languagebasics;

public class ex11 {

	public static void main(String[] args) {
		String a=args[0];
		char c=a.charAt(0);
	    if(c>= 'a' && c<= 'z')
	    {
	    	System.out.println(c+"->"+a.toUpperCase());
	    }
	    else if(c>= 'A' && c<='Z')
	    {
	    	System.out.println(c+"->"+a.toLowerCase());
	    }
	}
}