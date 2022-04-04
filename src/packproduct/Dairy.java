package packproduct;

public class Dairy extends NonPerishable implements isShippable{
	private String _lot;
	
	/**
	 * Makes an instance of product
	 * @param (code) type:Integer sets the value of code in the instance
	 * @param (name) type:String sets the value of name in the instance
	 * @param (weight) type:Double sets the value of weight in the instance
	 * @param (price) type:Double sets the value of price in the instance
	 * @param (quantity) type:Integer sets the value of quantity in the instance
	 * @param (VAT) type:Double sets the final value of VAT in the instance
	 * @param (date) type:String sets the final value of date in the instance
	 * @param (lot) type:String sets the final value of lot in the instance
	 * */
	public Dairy(int code , String name , double weight , double price , int quantity, double VAT, String lot, String date) {
		super(code, name , weight , price , quantity, date, 0.04);
		this._lot = lot;
	}
	/**
	 * gets the _lot private string attribute value
	 * @return _lot attribute value
	 * */
	public String getLot() {
		return _lot;
	}
	/**
	 * sets the value of the _expirationDate attribute
	 * @param type:String sets _expirationDate value
	 * */
	public void setLot(String _lot) {
		this._lot = _lot;
	}
	/**
	 * checks if a product is out of date
	 * @return type:boolean a product has to be removed
	 * */
	public boolean toRemove(String date) {
		boolean result = true;
		if( date == this._lot) {
			result = false;
		}
		return result;
	}
	@Override
	/**
	 * describes all the instances attributes in a list 
	 * @return brief description of the instance
	 * */
	public String toString() {
		return super.toString() +
			"\n Lot: " + this._lot +
			"\n --------------------------------------------------------------";
	}
	/**
	 * how much you have to pay for the shipping
	 * @return how much you have to pay for the shipping
	 * */
	public double priceShipp() {
		double result = 0.25;
		result = result + result*0.01;
		return result;
	}
}
