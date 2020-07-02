package Strings;

public class p9 {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="World";
		String s3="";
		int j=0;
		int k=0;
		for(int i=0;i<s1.length()+s2.length();i++)
		{
			if(i%2==0)
			{
				s3=s3+s1.charAt(j);
				j++;
			}
			else {
				s3=s3+s2.charAt(k);
				k++;
			}
		}
		System.out.println(s3);

	}

}
