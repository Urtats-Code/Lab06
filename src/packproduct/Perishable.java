package packproduct;

public abstract class Perishable extends Product{
	/**
	 * Makes an instance of product
	 * @param (code) type:Integer sets the value of code in the instance
	 * @param (name) type:String sets the value of name in the instance
	 * @param (weight) type:Double sets the value of weight in the instance
	 * @param (price) type:Double sets the value of price in the instance
	 * @param (quantity) type:Integer sets the value of quantity in the instance
	 * @param (VAT) type:Double sets the final value of VAT in the instance
	 * */
	public Perishable(int code , String name , double weight , double price , int quantity, double VAT) {
		super(code, name , weight , price , quantity, VAT);
	}
	
	@Override 
	/**
	 * gives a description of all the attributes of the product (Fruit)
	 * @return brief description of the fruit 
	 * */
	public String toString() {
		return super.toString();
	}
}
