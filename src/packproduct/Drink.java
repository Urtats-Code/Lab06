package packproduct;

public class Drink extends NonPerishable implements isShippable{
	private int _grade;
	/**
	 * Makes an instance of product
	 * @param (code) type:Integer sets the value of code in the instance
	 * @param (name) type:String sets the value of name in the instance
	 * @param (weight) type:Double sets the value of weight in the instance
	 * @param (price) type:Double sets the value of price in the instance
	 * @param (quantity) type:Integer sets the value of quantity in the instance
	 * @param (VAT) type:Double sets the final value of VAT in the instance
	 * @param (date) type:String sets the final value of date in the instance
	 * @param (grade) type:Integer sets the final value of grade in the instance
	 * */
	public Drink(int code , String name , double weight , double price , int quantity, double VAT, int grade, String date) {
		super(code, name , weight , price , quantity, date, 0.10);
		this._grade = grade;
	}
	/**
	 * gets the _grade private string attribute value
	 * @return _grade attribute value
	 * */
	public int getGrade() {
		return _grade;
	}
	/**
	 * sets the value of the _grade attribute
	 * @param type:String sets _grade value
	 * */
	public void setGrade(int _grade) {
		this._grade = _grade;
	}
	/**
	 * checks if a product is out of date
	 * @return type:boolean a product has to be removed
	 * */
	public boolean toRemove(String date) {
		boolean result = false;
		// Split out the passed date string 
		String[] parts = date.split("-");
		String part1 = parts[0];
		String part2 = parts[1];
		String part3 = parts[2];
		// Split out the instance date string
		String superDate = super.getExpirationDate();
		String[] parts2 = superDate.split("-");
		String partSuper1 = parts2[0];
		String partSuper2 = parts2[1];
		String partSuper3 = parts2[2];
		// check if its spoiled
		if(Integer.parseInt(part1) > Integer.parseInt(partSuper1)) {
			result = true;
		}else if (Integer.parseInt(part2) > Integer.parseInt(partSuper2)) {
			result = true;
		}else if (Integer.parseInt(part3) > Integer.parseInt(partSuper3)) {
			result = true;
		}
		return result;
	}
	@Override 
	/**
	 * gives a string with a description of all the attributes of the instance (Drink)
	 * @return makes a brief description of the intansce
	 * */
	public String toString() {
		return super.toString() + 
				"\n Grade: " + this._grade +
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
