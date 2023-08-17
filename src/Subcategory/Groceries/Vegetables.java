
package Subcategory.Groceries;
import Ecommerce.Items;
import sub.Subproducts;

public class Vegetables extends Items implements Subproducts{
private Items[] d_veg;
	
	public Items[] getItemsList() {
		// TODO Auto-generated method stub
		Items item1 = new Items();
		item1.setItemId("1");
		item1.setItemName("Beans Cluster");
		item1.setCost("\nCost :  ₹112/kg \n");
		item1.setDescription("\nAbout this item: \t \n"
				+ "It very well may be overwhelmed by rice, chapatti, and dal\n"
				+ "Rich in Vitamin A and C\n"
				+ "Rich in Dietary Fiber and Protein\n");
		
		
     	Items item2 = new Items();
		item2.setItemId("2");
		item2.setItemName("Spinach");
		item2.setCost("\nCost :  ₹8.20 /100 g \n");
		item2.setDescription("\nAbout this itemn: \t \n"
				+ "Organic spinach\n"
				+ "Graded, sorted and premium quality fruits and vegetables\n"
				+ "Fresh, hygienic and natural\n");

		Items item3 = new Items();
		item3.setItemId("3");
		item3.setItemName("Potato");
		item3.setCost("\nCost :  ₹31/kg \n");
		item3.setDescription("\nAbout this item: \t \n"
				+ "High source of fibre\n"
				+ "Good source of Vitamin B6, C, Potassium, and Magnesium\n"
				+ "Can be used in multiple dishes and snacks\n");
		
		Items item4 = new Items();
		item4.setItemId("4");
		item4.setItemName("Onion");
		item4.setCost("\nCost :  ₹24/kg \n");
		item4.setDescription("\nAbout this item: \t \n"
				+ "Rich in antioxidants\n"
				+ "Good source of manganese, copper, Vitamin B6, Vitamin C and Dietary Fibers\n"
				+ "Can be used in curries, snacks and salads\n");
		
		Items item5 = new Items();
		item5.setItemId("5");
		item5.setItemName("Capsicum");
		item5.setCost("\nCost :  ₹64/kg \n");
		item5.setDescription("\nAbout this item: \t \n"
				+ "Fresh, hygienic and natural\n"
				+ "Good source of Vitamin A,C,E, Folate and Dietary Fiber\n"
				+ "Can be used in curries, soups, pizza and other chinese dishes\n");
	
		d_veg = new Items [5];
		d_veg[0]= item1;
		d_veg[1]=item2;
		d_veg[2]=item3;
		d_veg[3]=item4;
		d_veg[4]=item5;
		return d_veg;
		
	}

	public void setItemsList(Items[] d_veg) {
		
		this.d_veg = d_veg;
	}
	public Vegetables(){
	}
public Vegetables(String itemId, String itemName, String cost,String description, Items[] d_veg)
{
	super(itemId, itemName, cost,description);
	this.d_veg = d_veg;
}
	
public Vegetables(Items [] d_veg)
{
	this.d_veg = d_veg;
}
	public Items[] setItemsList() {
			return null;
	}

}


