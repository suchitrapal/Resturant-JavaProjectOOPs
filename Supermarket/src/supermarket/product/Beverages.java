package supermarket.product;
import java.util.ArrayList;

public class Beverages extends GroceryProduct {
private SugarLevel sugarLevel;

public Beverages(String name, double price, double discount, SugarLevel sugarLevel) {
	super(name, price, discount);
	this.sugarLevel=sugarLevel;
}
public String display() {
	return(super.display()+"\nSugar Level: "+sugarLevel);		
	
}
//getters & setters
public SugarLevel getSugarLevel() {
	return sugarLevel;
}
public void setSugarLevel(SugarLevel sugarLevel) {
	this.sugarLevel = sugarLevel;
}

public static void main(String[] args) {
	ArrayList <Beverages> cart= new ArrayList <Beverages>();
	
    Beverages Fries = new Beverages("Fries", 6.5, 20, SugarLevel.ZERO );
    cart.add(Fries);
	
	double total=0;
	
	for(int i=0; i<cart.size(); i++) {
		total += cart.get(i).getActualPrice();
	}
	System.out.println("The total cost= "+ total);
}
}

