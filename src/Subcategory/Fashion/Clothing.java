
package Subcategory.Fashion;
import Ecommerce.Items;
import sub.Subproducts;

public class Clothing extends Items implements Subproducts{
private Items[] d_clothing;
	
	public Items[] getItemsList() {
		// TODO Auto-generated method stub
		Items item1 = new Items();
		item1.setItemId("1");
		item1.setItemName("T-shirt");
		item1.setCost("\nCost :  ₹1,359\n");
		item1.setDescription("\nDescription: \t \n "
				+ "U.S. POLO ASSN.\n"
				+ "Women Printed Polo Neck Cotton Blend Black T-Shirt\n");
		
		
     	Items item2 = new Items();
		item2.setItemId("2");
		item2.setItemName("Dress");
		item2.setCost("\nCost :    ₹1,300\n");
		item2.setDescription("\nDescription: \t \n "
				+ "Nike Women's Cotton AS W NSW Dress FT M2Z Knee-Length\n");

		Items item3 = new Items();
		item3.setItemId("3");
		item3.setItemName("Bottoms");
		item3.setCost("\nCost :  ₹1,999\n");
		item3.setDescription("\\nDescription: \\t \\n"
				+ "ADDYVERO\n"
				+ "Women Regular Fit Black Cotton Blend Trousers \n");
		
		Items item4 = new Items();
		item4.setItemId("4");
		item4.setItemName("Outerwear");
		item4.setCost("\nCost :    ₹5,345\n");
		item4.setDescription("\nDescription: \t \n"
				+ "Columbia Womens Jackets\n ");
		
		Items item5 = new Items();
		item5.setItemId("5");
		item5.setItemName("Activewear");
		item5.setCost("\nCost :    ₹2,559\n");
		item5.setDescription("\nDescription: \t \n"
				+ "Clovia Women's Polyester Activewear Ankle Length Tights\n ");
		
		d_clothing = new Items [5];
		d_clothing[0]= item1;
		d_clothing[1]=item2;
		d_clothing[2]=item3;
		d_clothing[3]=item4;
		d_clothing[4]=item5;
		return d_clothing;
		
	}

	public void setItemsList(Items[] d_clothing) {
		
		this.d_clothing = d_clothing;
	}
	public Clothing(){
	}
public Clothing(String itemId, String itemName, String cost,String description, Items[] d_clothing)
{
	super(itemId, itemName, cost, description);
	this.d_clothing = d_clothing;
}
	
public Clothing(Items [] d_clothing)
{
	this.d_clothing = d_clothing;
}
	public Items[] setItemsList() {
			return null;
	}

}

