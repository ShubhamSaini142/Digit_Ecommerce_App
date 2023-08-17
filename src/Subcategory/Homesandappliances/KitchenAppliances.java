package Subcategory.Homesandappliances;
import Ecommerce.Items;
import sub.Subproducts;

public class KitchenAppliances extends Items implements Subproducts{
private Items[] d_kitchenAppliances;
	
	public Items[] getItemsList() {
		// TODO Auto-generated method stub
		Items item1 = new Items();
		item1.setItemId("1");
		item1.setItemName("Drip Coffee Machine");
		item1.setCost("\nCost :  ₹13,419\n");
		item1.setDescription("\nDescription: \t \n"
				+ "Morphy Richards Impresso Espresso Coffee Maker|Upto 20 bar Pressure|\n"
				+ "Milk Frother & Steam Control Knob for Cappuccinos & Lattes\n"
				+ "|Removable Drip Tray| 2-Yr Warranty by Brand|Black & Steel Coffee Machine\n");
		
		
     	Items item2 = new Items();
		item2.setItemId("2");
		item2.setItemName("Water purifier");
		item2.setCost("\nCost :  ₹1,719\n");
		item2.setDescription("\nDescription: \t \n"
				+ "HUL Pureit Revito Prime Mineral RO+MF+UV in-Tank 7 stage 8L Water purifier\n"
				+ " with DURAViva technology (Black)\n");

		Items item3 = new Items();
		item3.setItemId("3");
		item3.setItemName("Sandwich Maker");
		item3.setCost("\nCost :  ₹1,259\n");
		item3.setDescription("\nDescription: \t \n"
				+ "Prestige Sandwich Maker PGMFD 01, Black\n");
		
		Items item4 = new Items();
		item4.setItemId("4");
		item4.setItemName("Iron");
		item4.setCost("\nCost :  ₹1,849\n");
		item4.setDescription("\nDescription: \t \nPhilips GC1905 1440-Watt Steam Iron with Spray (Blue)\n"
				+ "Visit the PHILIPS Store\n");
		
		Items item5 = new Items();
		item5.setItemId("5");
		item5.setItemName("Electric Kettle");
		item5.setCost("\nCost :  ₹1,719\n");
		item5.setDescription("\nDescription: \t \n"
				+ "Prestige PKOSS 1.5 Stainless Steel Electric Kettle 1500W (Silver and Black, 1.5L)\n");
		
		
		d_kitchenAppliances = new Items [5];
		d_kitchenAppliances[0]= item1;
		d_kitchenAppliances[1]=item2;
		d_kitchenAppliances[2]=item3;
		d_kitchenAppliances[3]=item4;
		d_kitchenAppliances[4]=item5;
		return d_kitchenAppliances;
		
	}

	public void setItemsList(Items[] d_kitchenAppliances) {
		
		this.d_kitchenAppliances = d_kitchenAppliances;
	}
	public KitchenAppliances(){
	}
public KitchenAppliances(String itemId, String itemName, String cost, String description, Items[] d_kitchenAppliances)
{
	super(itemId, itemName, cost,description);
	this.d_kitchenAppliances = d_kitchenAppliances;
}
	
public KitchenAppliances(Items [] d_kitchenAppliances)
{
	this.d_kitchenAppliances = d_kitchenAppliances;
}
	public Items[] setItemsList() {
			return null;
	}

}

