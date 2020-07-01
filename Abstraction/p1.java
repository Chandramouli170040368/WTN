package abstract_classes;
import java.util.Random;
abstract class compartment { 
	abstract public void notice(); 
	} 
class firstclass extends compartment {
	public void notice() { 
		System.out.println("First class compartment(Reserved use only)");
	} 
} 
class ladies extends compartment {
	public void notice() { 
		System.out.println("Reserved for ladies");
	}
} 
class general extends compartment {
	public void notice() { 
		System.out.println("General compartment");
	}
}
class luggage extends compartment {
	public void notice() { 
		System.out.println("Compartment for luggages"); 
	}
} 

public class p1 {

	public static void main(String[] args) {
		compartment comp[]=new compartment[10]; 
		Random rnd=new Random(); 
		int num=0; 
		for(int i=0;i<10;i++) {
			num=rnd.nextInt(4);
			if(num==0) 
				comp[i]=new firstclass();
			else if(num==1) 
				comp[i]=new ladies();
			else if(num==2) 
				comp[i]=new general();
			else 
				comp[i]=new luggage();
			comp[i].notice(); 
			
			
		}

	}

}