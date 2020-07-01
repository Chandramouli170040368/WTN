package Eception_handling;

public class UserRegistiration {
	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");


	}

	public static void main(String[] args) {
		UserRegistiration registration = new UserRegistiration();

		try {
			registration.registerUser("Mickey", "US");
		} catch (InvalidCountryException e) {
		}
	}
}

