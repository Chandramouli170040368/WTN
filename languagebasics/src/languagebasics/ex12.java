package languagebasics;

public class ex12 {

	public static void main(String[] args) {
		String s=args[0];
		char c=s.charAt(0);
		switch(c){
		case 'R':
			System.out.println("Red");
		    break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'W':
			System.out.println("White");
			break;
	}

}
}
