package Strings;

public class p2 {
	public static void main(String[] args) {
String s1="sachin";
String s2="Tendulkar";
String s3="";
if(s2.charAt(0)>='A'&& s2.charAt(0)<='Z')
{
	s3=s3+(s1.toLowerCase()+" "+s2.toLowerCase());
}
else {
	s3=s3+(s1.toLowerCase()+s2.toLowerCase());
}
System.out.println(s3);
}
}
