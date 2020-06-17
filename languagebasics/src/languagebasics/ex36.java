package languagebasics;

public class ex36 {

	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6},{6,7,8}};
		int i;
		int j;
		int max=0;
		for(i=0;i<3;i++)
		{
		 for(j=0;j<3;j++)
		 {
			 System.out.print(a[i][j]+" ");
			 if(max<a[i][j])
				{
					max=a[i][j];
				}
		 }
		 System.out.println("");	
		}
		System.out.println("The largest number is "+max);

	}

}
