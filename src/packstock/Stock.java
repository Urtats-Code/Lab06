package packstock;
import java.util.ArrayList;
import packproduct.*;
import java.util.Collections;


/**
 * 
 * Stock from a shop 
 * @author Urtats Berrocal
 * @version 1.0
 * */
public class Stock {
	private ArrayList<Product> productList;
	
	/*
	 * makes an instance of the object
	 * */
	public Stock() {
		productList = new ArrayList<Product>();
	}
	
	/**
	 * adds a product to the list
	 * @param the product we are about to add to the list 
	 * */
	public void addProduct(Product newProduct) {
		productList.add(newProduct);
	}
	/**
	 * gets the position in the list of the product we are about to remove 
	 * @param code of the product we are about to get
	 * */
	public int obtainPos(int code) {
		Object[] arr = productList.toArray();
		boolean found = false;
		int i = 0;
		while( !found && i < arr.length ) {
			if(code == ((Product) arr[i]).get_code()) {
				found = true;
			}
		}
		
		if( i != arr.length) {
			return i;
		}else {
			return -1;
		}
	}
	/**
	 * removes one product from the list 
	 * @param code of the product we are going to remove 
	 * */
	public void removeProduct(int code) {
		Object[] arr = productList.toArray();
		boolean found = false;
		int i = 0;
		while(!found && i < arr.length) {
			if(code == ((Product) arr[i]).get_code()) {
				found = true;
			}
		}
		if(i != arr.length ) {
			productList.remove(i);
		}else {
			System.out.println("The product you are trying to delete is not in this stock");
		}		
	}
	/**
	 * says how many products are in the list
	 * */
	public void quantityProduct() {
		System.out.println("Products in the stock: " + productList.size());
	}
	/**
	 * counts how many products of the same type are in the list 
	 * @param name of the product we are counting
	 * */
	public void quantityType(String name) {
		int cont = 0;
		for(Product Element : productList) {
			if(Element.get_name() == name) {
				cont += 1;
			}
		}
		System.out.println("Num of" + name + "in the list: " + cont);
	}
	
	@Override 
	/**
	 * gives a description of all of the instances in the instance list
	 * @return type:String brief description of all the instances in the list
	 * */
	public String toString() {
		String result = "";
		for(Product element : productList) {
			result = result + element.toString();
		}
		return result;
	}
	/**
	 * checks if the given prduct needs to be removen
	 * @return if found an element that needs to be removed it returns true else false
	 * */
	public boolean itemsToRemove(String name) {
		boolean toRemove = false;
		for(Product element : productList ) {
			if( element.get_name() == name) {
				toRemove = element.toRemove(element.get_name());
			}
		}		
		return toRemove;
	}
	/**
	 * Product list ordered by code
	 * */
	public void sort() {
		Collections.sort(productList);
	}
	/**
	 * @return toString of Perishable products
	 * */
	public String printPerishable() {
		String result = "";
		for(Product element : productList) {
			if(element instanceof Perishable) {
				result = result + element.toString();
			}
		}
		return result;
	}
	/**
	 * 
	 * @return list of elements that can be shippable with its price 
	 * */
	public String printShippable() {
		String result = "";
		for(Product element : productList) {
			if(element instanceof isShippable ) {
				result = result + 
						" -New Sippable product " + 
						" \n Name:" + element.getClass().getSimpleName() + " Shipp price: " + ((isShippable) element).priceShipp();
			}
		}
		return result;
	}
}
