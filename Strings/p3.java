package Strings;

public class p3 {

	public static void main(String[] args) {
		String s="wipro";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			s1=s1+s.substring(0,2);
		}
		System.out.println(s1);

	}

}
