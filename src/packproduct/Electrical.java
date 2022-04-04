package packproduct;

public class Electrical extends Perishable implements isShippable{
	/**
	 * Makes an instance of product
	 * @param (code) type:Integer sets the value of code in the instance
	 * @param (name) type:String sets the value of name in the instance
	 * @param (weight) type:Double sets the value of weight in the instance
	 * @param (price) type:Double sets the value of price in the instance
	 * @param (quantity) type:Integer sets the value of quantity in the instance
	 * @param (VAT) type:Double sets the final value of VAT in the instance
	 * */
	public Electrical(int code , String name , double weight , double price , int quantity, double VAT) {
		super(code, name , weight , price , quantity, 0.21);
	}
	/**
	 * checks if given code is equal to instance code
	 * @return type:boolean if given code is equal to instance code
	 * */
	public boolean toRemove(String code) {
		boolean result = false;
		if(Integer.parseInt(code) != this.get_code()) {
			result = true;
		}
		return result;
	}
	
	@Override 
	/**
	 * gives a description of all the attributes of the object 
	 * @return type:String brief description of the instance
	 * */
	public String toString(){
		return super.toString() +
				"\n --------------------------------------------------------------";
	}
	/**
	 * how much you have to pay for the shipping
	 * @return how much you have to pay for the shipping
	 * */
	public double priceShipp() {
		double result = 0.37;
		return result;
	}
}
