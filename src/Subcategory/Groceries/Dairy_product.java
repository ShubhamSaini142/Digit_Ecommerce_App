
package Subcategory.Groceries;
import Ecommerce.Items;
import sub.Subproducts;

public class Dairy_product extends Items implements Subproducts{
private Items[] d_dairy;
	
	public Items[] getItemsList() {
		// TODO Auto-generated method stub
		Items item1 = new Items();
		item1.setItemId("1");
		item1.setItemName("Milk");
		item1.setCost("\nCost :  ₹68.00/1L Pack\n");
		item1.setDescription("\nDescription: \t \n"
				+ "Amul Milk is the most hygenic liquid milk\n"
				+ "Amul milk meets the PFA standards\n");
		
		
     	Items item2 = new Items();
		item2.setItemId("2");
		item2.setItemName("Yogurt");
		item2.setCost("\nCost :  ₹42\n");
		item2.setDescription("\nDescription: \t \n"
				+ "Amul Masti Dahi Cup, 400 g");

		Items item3 = new Items();
		item3.setItemId("3");
		item3.setItemName("Cheese");
		item3.setCost("\nCost :  ₹116\n");
		item3.setDescription("\nDescription: \t \n"
				+ "Amul Cheese Block, 200 g\n"
				+ "Good source of Calcium and milk Proteins\n");
		
		Items item4 = new Items();
		item4.setItemId("4");
		item4.setItemName("Butter");
		item4.setCost("\nCost : 	₹250\n");
		item4.setDescription("\nDescription: \t \n"
				+ "Amul Cheese Block, 200 g");
		
		Items item5 = new Items();
		item5.setItemId("5");
		item5.setItemName("Eggs");
		item5.setCost("\nCost :  ₹105\n");
		item5.setDescription("\nDescription: \t \n"
				+ "Fresh Eggs, Pack of 12");
		
		
		d_dairy = new Items [5];
		d_dairy[0]= item1;
		d_dairy[1]=item2;
		d_dairy[2]=item3;
		d_dairy[3]=item4;
		d_dairy[4]=item5;
		return d_dairy;
		
	}

	public void setItemsList(Items[] d_dairy) {
		
		this.d_dairy = d_dairy;
	}
	public Dairy_product(){
	}
public Dairy_product(String itemId, String itemName, String cost,String description, Items[] d_dairy)
{
	super(itemId, itemName, cost,description);
	this.d_dairy = d_dairy;
}
	
public Dairy_product(Items [] d_dairy)
{
	this.d_dairy = d_dairy;
}
	public Items[] setItemsList() {
			return null;
	}

}


