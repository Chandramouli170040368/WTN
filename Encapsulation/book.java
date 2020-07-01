package encapsulation;

public class book {
	private String name;
	   private author author;
	   private double price;
	   private int qtyInstock;
	   public book(String name, author author, double price, int qtyInstock) {
	      this.name = name;
	      this.author = author;
	      this.price = price;
	      this.qtyInstock = qtyInstock;
	   }
	 
	   public String getName() {
	      return name;
	   }
	   public author getAuthor() {
	      return author;  
	   }
	   
	   public double getPrice() {
	      return price;
	   }
	   public void setPrice(double price) {
	      this.price = price;
	   }
	   public int getQtyInstock() {
	      return qtyInstock;
	   }
	   public void setQtyInstock(int qtyInstock) {
	      this.qtyInstock = qtyInstock;
	   }
	 
	   public String toString() {
	      return "'" + name + "' by " + author; 
	   }

}
