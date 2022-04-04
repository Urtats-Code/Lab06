package packdemo;
import packproduct.*;
import packstock.Stock;
public class SuperOnline {
	public static void main(String[]args) {
		// Create stock
		Stock stock = new Stock();
		// Create products
		//int code , String name , double weight , double price , int quantity, double VAT, String origin, String date
		Fruits berry = new Fruits(1, "berry", 200.0 , 0.31 , 15 , 0.04 , "Mexico", "21-02-2024"); 
		//int code , String name , double weight , double price , int quantity, double VAT, String lot, String date
		Dairy milk = new Dairy(982734, "milk", 1 , 0.80 , 6 , 0.04 , "1290348192378498012", "21-02-2023");
		//int code , String name , double weight , double price , int quantity, double VAT, int grade, String date
		Drink CocaCola = new Drink(221, "CocaCola", 1.50 , 3.0 , 12 , 0.04 , 21 , "21-02-2023");
		// int code , String name , double weight , double price , int quantity, double VAT, String category
		Cleaning vacuum = new Cleaning(8002, "vacuum", 22.0 , 500.0 , 1 , 0.21 , "Vacoon300");
		Cleaning romba = new Cleaning(22, "romba", 10.0 , 4000.0 , 1 , 0.21 , "Romba3000");
		// int code , String name , double weight , double price , int quantity, double VAT
		Electrical microwave = new Electrical(2, "microwave", 17.0 , 4000.0 , 17 , 0.21);
		// add products to the list
		stock.addProduct(berry);
		stock.addProduct(milk);
		stock.addProduct(vacuum);
		stock.addProduct(romba);
		stock.addProduct(CocaCola);
		stock.addProduct(microwave);
		// order products
		stock.sort();
		// print products
		System.out.println(stock.toString());
		// which projects you can ship 
		System.out.println(stock.printShippable());
		// price with vat 
		System.out.println(milk.priceWithVAT());
		// toRemove test
		System.out.println(stock.itemsToRemove("milk"));
		// isCheaper test
		System.out.println(milk.isCheaper(berry));
		System.out.println("-------------------------------");
		// printPerishable 
		System.out.println(stock.printPerishable());
	}
}
