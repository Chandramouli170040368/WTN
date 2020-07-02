package Strings;

public class p10 {

	public static void main(String[] args) {
		String s="wipro";
		int a=3;
		String s1="";
		for(int i=0;i<a;i++)
		{
			s1=s1+s.substring(a-1);
		}
    System.out.println(s1);
	}

}
