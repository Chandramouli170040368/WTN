package languagebasics;

import java.util.Arrays;

public class ex27 {

	public static void main(String[] args) {
		int a[];
		a=new int[(args.length)];
		for(int i=0;i<a.length;i++)
		{
		   	a[i]=Integer.parseInt(args[i]);
		}
		Arrays.sort(a);
        System.out.println("Largest 2 numbers :"+a[(a.length)-1]+","+a[a.length-2]);
        System.out.println("Smallest 2 numbers :"+a[0]+","+a[1]);
	}

}
