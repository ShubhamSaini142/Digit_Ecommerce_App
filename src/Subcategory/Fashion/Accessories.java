package Subcategory.Fashion;
import Ecommerce.Items;
import sub.Subproducts;

public class Accessories extends Items implements Subproducts{
private Items[] d_accessories;
	
	public Items[] getItemsList() {
		// TODO Auto-generated method stub
		Items item1 = new Items();
		item1.setItemId("1");
		item1.setItemName("Bracelet");
		item1.setCost("\nCost :  ₹999\n");
		item1.setDescription("\nDescription: \t \n "
				+ "Alloy Gold-plated Bracelet\n ");
		
		
     	Items item2 = new Items();
		item2.setItemId("2");
		item2.setItemName("Sunglasses");
		item2.setCost("\nCost : ₹1200 ");
		item2.setDescription("\nDescription: \t \n"
				+ "UV Protection, Gradient Round, Cat-eye Sunglasses (60)\n"
				+ "(For Women, Grey, Violet)\n");

		Items item3 = new Items();
		item3.setItemId("3");
		item3.setItemName("Sling Bag");
		item3.setCost("\nCost :  ");
		item3.setDescription("\nDescription: \t \n "
				+ "Allen Solly\n"
				+ "Brown Women Sling Bag\n");
		
		Items item4 = new Items();
		item4.setItemId("4");
		item4.setItemName("Watch");
		item4.setCost("\nCost :  ₹17,995\n");
		item4.setDescription("\nDescription: \t \n"
				+ "FOSSIL\n"
				+ "Automatics Analog Watch - For Men ME3160\n");
		
		Items item5 = new Items();
		item5.setItemId("5");
		item5.setItemName("Wallet");
		item5.setCost("\nCost :  ₹1,495");
		item5.setDescription("\nDescription: \t \n "
				+ "WOODLAND \n"
				+ "Men Casual Brown Genuine Leather Wallet  (6 Card Slots)\n");
	
		d_accessories = new Items [5];
		d_accessories[0]= item1;
		d_accessories[1]=item2;
		d_accessories[2]=item3;
		d_accessories[3]=item4;
		d_accessories[4]=item5;
		return d_accessories;
		
	}

	public void setItemsList(Items[] d_accessories) {
		
		this.d_accessories = d_accessories;
	}
	public Accessories(){
	}
public Accessories(String itemId, String itemName, String cost,String description, Items[] d_accessories)
{
	super(itemId, itemName, cost, description);
	this.d_accessories = d_accessories;
}
	
public Accessories(Items [] d_accessories)
{
	this.d_accessories = d_accessories;
}
	public Items[] setItemsList() {
			return null;
	}

}
