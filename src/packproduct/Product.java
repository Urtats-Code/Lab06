package packproduct;
import java.lang.Comparable;


public abstract class Product implements Comparable<Product>{
	private int _code;
	private String _name;
	private double _weight;
	private double _price;
	private int  _quantity;
	private final double _VAT;
	
	/**
	 * Makes an instance of product
	 * @param (code) type:Integer sets the value of code in the instance
	 * @param (name) type:String sets the value of name in the instance
	 * @param (weight) type:Double sets the value of weight in the instance
	 * @param (price) type:Double sets the value of price in the instance
	 * @param (quantity) type:Integer sets the value of quantity in the instance
	 * */
	public Product(int code , String name , double weight , double price , int quantity) {
		this(code,name,weight,price,quantity, 0.21);	
	}
	/**
	 * Makes an instance of product
	 * @param (code) type:Integer sets the value of code in the instance
	 * @param (name) type:String sets the value of name in the instance
	 * @param (weight) type:Double sets the value of weight in the instance
	 * @param (price) type:Double sets the value of price in the instance
	 * @param (quantity) type:Integer sets the value of quantity in the instance
	 * @param (VAT) type:Double sets the final value of VAT in the instance
	 * */
	public Product(int code , String name , double weight , double price , int quantity, double VAT) {
		this._code = code;
		this._name = name;
		this._weight = weight;
		this._price = price;
		this._quantity = quantity;
		this._VAT = VAT;
	}
	/**
	 * gets the _code private int attribute value
	 * @return _code attribute value
	 * */
	public int get_code() {
		return _code;
	}
	/**
	 * sets the value of the _code attribute
	 * @param type:Integer sets _code value
	 * */
	public void set_code(int _code) {
		this._code = _code;
	}
	/**
	 * gets the _name private String attribute value
	 * @return _name attribute value
	 * */
	public String get_name() {
		return _name;
	}
	/**
	 * sets the value of the _name attribute
	 * @param type:String sets _name value
	 * */
	public void set_name(String _name) {
		this._name = _name;
	}
	/**
	 * gets the _weight private double attribute value
	 * @return _weight attribute value
	 * */
	public double get_weight() {
		return _weight;
	}
	/**
	 * sets the value of the _wheight attribute
	 * @param type:Double sets _wheight value
	 * */
	public void set_weight(double _weight) {
		this._weight = _weight;
	}
	/**
	 * gets the _price private double attribute value
	 * @return _price  attribute value
	 * */
	public double get_price() {
		return _price;
	}
	/**
	 * sets the value of the _price attribute
	 * @param type:Double sets _price value
	 * */
	public void set_price(double _price) {
		this._price = _price;
	}	
	/**
	 * gets the _quantity private int attribute value
	 * @return _quantity attribute value
	 * */
	public int get_quantity() {
		return _quantity;
	}
	/**
	 * sets the value of the _quantity attribute
	 * @param type:Integer sets _quantity value
	 * */	
	public void set_quantity(int _quantity) {
		this._quantity = _quantity;
	}
	/**
	 * gets the _VAT private final double attribute value
	 * @return _VAT attribute value
	 * */
	public double get_VAT() {
		return _VAT;
	}
	
	@Override 
	/**
	 * Makes a brief description of the Product instance
	 * @return type:String brief description 
	 * */
	public String toString() {
		return "[type: " + this.getClass().getSimpleName() + " ] " + 
				" Code: " + this._code + 
				" \n Name: " + this._name + 
				" \n Weight: " + this._weight + 
				" \n Price: " + this._price + 
				" \n Quantity: " + this._quantity + 
				"  \n VAT: " + this._VAT ;
	}
	
	
	@Override
	public boolean equals(Object o) {
		boolean devol = false;
		// self check
		if (this == o)
			devol = true;
		else
			// null check
			if (o == null)
				devol = false;
			else
				// type check
				if (this.getClass() != o.getClass())
					devol = false;
				else {
					//casting
					Product product = (Product) o;
					// field comparison return
					devol = (this._name.equals(product._name));
				}
		return devol;
	}
	/**
	 * multiplies price * VAT and adds that to the original price so we get price with VAT
	 * @return type:Double price with VAT 
	 * */
	public double priceWithVAT() {
		return (this._price * this._quantity) + (this._price * this._quantity * this._VAT);
	}
	// checks if a product musts be romoved
	public abstract boolean toRemove(String justAString);
	/**
	 * Checks if one product is cheapen than other
	 * @return Type: boolean if instance price is lower than other product
	 * 
	 * */
	public boolean isCheaper(Product p) {
		boolean result = false;
		if( this._price < p.get_price()) {
			result = true;
		}
		return result;
	}
	/**
	 * Compares two instance codes
	 * @return if this code is lower than the other code returns a negative number else returns positiveç
	 * @param the object we are going to compare
	 * positive means that the code is bigger so it will order both of then from lower to higher
	 * negative means that the code is smaller
	 * */
	public int compareTo(Product m) {
		return this.get_code() - m.get_code();
	}
}
