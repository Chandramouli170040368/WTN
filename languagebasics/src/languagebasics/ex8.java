package languagebasics;

public class ex8 {

	public static void main(String[] args) {
	  String s1=args[0];
	  String s2=args[1];
	  char a=s1.charAt(0);
	  char b=s2.charAt(0);
	if(a>b)
	{
		System.out.println(b+","+a);
	}
	else
	{
		System.out.println(a+","+b);	
	}

	}

}
