package classes_objects;

public class calculator {
	public static void main(String[] args) {
		  System.out.println(Cal.powerDouble(7.8, 3));
		    System.out.println(Cal.powerInt(5,2));
		    }

		
	}
		class Cal
		{
		    static double powerInt(int num1,int num2)
		    {
		        return Math.pow(num1,num2);
		    }
		static double powerDouble(double num1,int num2)
		{
		    return Math.pow(num1,num2);
		}
		}

