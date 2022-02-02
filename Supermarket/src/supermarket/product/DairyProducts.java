package supermarket.product;

import java.util.ArrayList;

public class DairyProducts extends GroceryProduct {
private Fat fat;

public DairyProducts(String name, double price, double discount, Fat fat) {
	super(name, price, discount);
	this.fat=fat;
}

public String display() {
	return(super.display()+"\nFat Level: "+fat);		
	
}
//getters & setters
public Fat getFat() {
	return fat;
}

public void setFat(Fat fat) {
	this.fat = fat;
}

public static void main(String[] args) {
	ArrayList <DairyProducts> cart= new ArrayList <DairyProducts>();
	
    DairyProducts Paneer= new DairyProducts("Paneer", 7,10, Fat.SKIMMED);
	cart.add(Paneer);
	
	double total=0;
	
	for(int i=0; i<cart.size(); i++) {
		total += cart.get(i).getActualPrice();
	}
	System.out.println("The total cost= "+ total);
}
}