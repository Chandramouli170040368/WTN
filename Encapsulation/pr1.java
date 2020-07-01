package encapsulation;

public class pr1 {
	public static void main(String[] args) {
		  author details = new author("MOULI", "moulidatta@gmail.com", 'M');
	      System.out.println(details);
	      book book = new book("BEST BOOK", details,12.3,59);
	      System.out.println(book);
	      book.setPrice(5.8);
	      book.setQtyInstock(38);
	      System.out.println("name is: " + book.getName());
	      System.out.println("price is: " + book.getPrice());
	      System.out.println("qty is: " + book.getQtyInstock());
	      System.out.println("author is: " + book.getAuthor());  
	      System.out.println("author's name is: " + book.getAuthor().getName());
	      System.out.println("author's email is: " + book.getAuthor().getEmail());
	      System.out.println("author's gender is: " + book.getAuthor().getGender());
	      book nbook = new book("Best Book", new author("kapavarapu", "kapavarapu@yahoo.com", 'M'),8.23,7);
	      System.out.println(nbook); 
	   }
}
