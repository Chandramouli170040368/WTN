package Strings;

public class p8 {

	public static void main(String[] args) {
		String s="ab*cd";
		String s1="";
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)=='*')
			{
				s1=s1+(s.substring(0,i-1)+s.substring(i+2));
			}
		}
		System.out.println(s1);
	}

}
