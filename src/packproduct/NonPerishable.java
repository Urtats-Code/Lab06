package packproduct;

public abstract class NonPerishable extends Product {
	private String _expirationDate;	
	/**
	 * Makes an instance of product
	 * @param (code) type:Integer sets the value of code in the instance
	 * @param (name) type:String sets the value of name in the instance
	 * @param (weight) type:Double sets the value of weight in the instance
	 * @param (price) type:Double sets the value of price in the instance
	 * @param (quantity) type:Integer sets the value of quantity in the instance
	 * @param (VAT) type:Double sets the final value of VAT in the instance
	 * @param (date) type:String sets the final value of date in the instance
	 * */
	public NonPerishable(int code , String name , double weight , double price , int quantity, String date, double VAT) {
		super(code, name , weight , price , quantity, VAT);
		this._expirationDate = date;
	}
	/**
	 * gets the _expiation private string attribute value
	 * @return _expiation attribute value
	 * */
	public String getExpirationDate() {
		return _expirationDate;
	}
	/**
	 * sets the value of the _expirationDate attribute
	 * @param type:String sets _expirationDate value
	 * */
	public void setExpirationDate(String expiration) {
		this._expirationDate = expiration;
	}
	@Override 
	public String toString() {
		return super.toString() + 
		" \n Expiration date: " + this._expirationDate;
	}
}
