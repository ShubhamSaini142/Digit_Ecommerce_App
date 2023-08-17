
package Subcategory.Groceries;
import Ecommerce.Items;
import sub.Subproducts;

public class Fruits extends Items implements Subproducts{
private Items[] d_fruits;
	
	public Items[] getItemsList() {
		// TODO Auto-generated method stub
		Items item1 = new Items();
		item1.setItemId("1");
		item1.setItemName("Apples");
		item1.setCost("\nCost :  ₹166 ₹41.50/count \n");
		item1.setDescription("\nAbout this item: \t \n");
		
		
     	Items item2 = new Items();
		item2.setItemId("2");
		item2.setItemName("Bananas");
		item2.setCost("\nCost :  ₹6.80 /100 g \n");
		item2.setDescription("\nAbout this item: \t \n"
				+ "t is rich in Vitamin B6, C, Dietary Fiber and Potassium\n"
				+ "Raw Bananas make a good choice in the making of Chips with salt and chilli powder on it\n");

		Items item3 = new Items();
		item3.setItemId("3");
		item3.setItemName("Oranges");
		item3.setCost("\nCost :  ₹23.50/count\n");
		item3.setDescription("\nAbout this item: \t \n"
				+ "Oranges are low in calories and full of nutrients, they promote clear,\n "
				+ "healthy, skin and can help to lower our risk for many diseases\n"
				+ " as part of an overall healthy and varied diet.\n");
		
		Items item4 = new Items();
		item4.setItemId("4");
		item4.setItemName("Grapes");
		item4.setCost("\nCost : ₹57.80 /100 g\n");
		item4.setDescription("\nAbout this item: \t \n"
				+ "Red Globe keep up skin well-being\n"
				+ "Crisp, sterile and common\n"
				+ "They have lesser calories\n");
		
		Items item5 = new Items();
		item5.setItemId("5");
		item5.setItemName("Mosambi");
		item5.setCost("\nCost :  ₹10.90 /100 g \n");
		item5.setDescription("\nAbout this item: \t \n"
				+ "Fresh, hygienic and natural\n"
				+ "Mosambi is soft yellow colored, mildly sweet tasting\n");
		
		d_fruits = new Items [5];
		d_fruits[0]= item1;
		d_fruits[1]=item2;
		d_fruits[2]=item3;
		d_fruits[3]=item4;
		d_fruits[4]=item5;
		return d_fruits;
		
	}

	public void setItemsList(Items[] d_fruits) {
		
		this.d_fruits = d_fruits;
	}
	public Fruits(){
	}
public Fruits(String itemId, String itemName, String cost,String description, Items[] d_fruits)
{
	super(itemId, itemName, cost,description);
	this.d_fruits = d_fruits;
}
	
public Fruits(Items [] d_fruits)
{
	this.d_fruits = d_fruits;
}
	public Items[] setItemsList() {
			return null;
	}

}


