package languagebasics;

public class ex22 {

	public static void main(String[] args) {
		int a=11011;
		int s=a;
		int c=0;
		int k=10;
		int l;
		while(a!=0)
		{
			l=a%10;
			c=(c*10)+l;
			a=a/10;
		}
		if(c==s)
		{
		System.out.println("Palindrome");
	    }
		else 
		{
			System.out.println("Not a Palindromw]e");
		}
	}
}
