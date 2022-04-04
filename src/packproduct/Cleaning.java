package packproduct;

public class Cleaning extends Perishable implements isShippable{
	private String _category;
	
	/**
	 * Makes an instance of product
	 * @param (code) type:Integer sets the value of code in the instance
	 * @param (name) type:String sets the value of name in the instance
	 * @param (weight) type:Double sets the value of weight in the instance
	 * @param (price) type:Double sets the value of price in the instance
	 * @param (quantity) type:Integer sets the value of quantity in the instance
	 * @param (VAT) type:Double sets the final value of VAT in the instance
	 * */
	public Cleaning(int code , String name , double weight , double price , int quantity, double VAT, String category) {
		super(code, name , weight , price , quantity, 0.21);
		this._category  = category;
	}
	/**
	 * gets the _category private string attribute value
	 * @return _category attribute value
	 * */
	public String getCategory() {
		return _category;
	}
	/**
	 * sets the value of the _categoryattribute
	 * @param type:String sets _category value
	 * */
	public void setCategory(String category) {
		this._category = category;
	}
	/**
	 * checks if is descatoragaized 
	 * @return type: boolean if is descatoragaized 
	 * */
	public boolean toRemove(String category) {
		boolean result = false;
		if(category.equals(this._category)) {
			result = true;
		}
		return result;
	}
	
	@Override 
	/**
	 * gives a description of all the attributes of the object 
	 * @return type:String brief description of the instance
	 * */
	public String toString() {
		return super.toString() + 
				"\n Category: " + this._category+
				"\n --------------------------------------------------------------";
	}
	/**
	 * how much you have to pay for the shipping
	 * @return how much you have to pay for the shipping
	 * */
	public double priceShipp() {
		double result = 0.37;
		double finalweight = this.get_weight() - 20;
		if( this.get_weight() > 20) {
			for(int i = 0; i < finalweight ; i++) {
				result = result + result*0.01;
			}
		}	
		return result;
	}
}
