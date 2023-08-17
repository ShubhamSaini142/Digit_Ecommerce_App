package Subcategory.Electronics;
import Ecommerce.Items;
import sub.Subproducts;

public class Mobiles extends Items implements Subproducts{
private Items[] d_electronics;
	
	public Items[] getItemsList() {
		// TODO Auto-generated method stub
		Items item1 = new Items();
		item1.setItemId("1");
		item1.setItemName("POCO C51");
		item1.setCost("\nCost :  ₹6,499\n");
		item1.setDescription("\nDescription: \t \n "
				+ "The POCO C51's MediaTek Helio G36 octa-core Processor,\n"
				+ " clocked at up to 2.2 GHz, has all the power needed for responsive\n"
				+ " web surfing and multimedia tasks.\n");
		
		
     	Items item2 = new Items();
		item2.setItemId("2");
		item2.setItemName("REDMI 11 Prime");
		item2.setCost("\nCost :  ₹10,999");
		item2.setDescription("\nDescription: \t \n "
				+ " You can enjoy a smooth and fast display, thanks to its 90 Hz FHD+ display.\n"
				+ " Its 50 MP AI triple camera allows you to click stunning images or record videos. \n"
				+ "With the 8 MP camera you can click attractive selfies. \n");

		Items item3 = new Items();
		item3.setItemId("3");
		item3.setItemName("MOTOROLA Edge 40");
		item3.setCost("\nCost :  ₹29,999\n");
		item3.setDescription("\nDescription: \t \n "
				+ "Fuelled with a host of features, this Motorola Edge 40 smartphone brings to you a\n"
				+ " slim IP68 rated with 30 minutes of underwater dunk resistance. \n");
		
		Items item4 = new Items();
		item4.setItemId("4");
		item4.setItemName("APPLE iPhone 11");
		item4.setCost("\nCost :  ₹42,999\n");
		item4.setDescription("\nDescription: \t \n "
				+ "The iPhone 11 boasts a gorgeous all-screen Liquid Retina LCD that is water resistant up to\n"
				+ " 2 metres for up to 30 minutes. Moreover, the ultra-wide 13 mm lens has a 120-degree field of view for\n"
				+ " four times more scenes, and the 26 mm wide lens provides up to 100% Autofocus in low light\n");
		
		Items item5 = new Items();
		item5.setItemId("5");
		item5.setItemName("APPLE iPhone 14 Plus");
		item5.setCost("\nCost :  ₹73,999\n");
		item5.setDescription("\nDescription: \t \n "
				+ "The ultra-wide 13 mm lens has a 120-degree field of view for four times more scenes,\n"
				+ " and the 26 mm wide lens provides up to 100% Autofocus in low light.\n");
		
		
		d_electronics = new Items [5];
		d_electronics[0]= item1;
		d_electronics[1]=item2;
		d_electronics[2]=item3;
		d_electronics[3]=item4;
		d_electronics[4]=item5;
		return d_electronics;
		
	}

	public void setItemsList(Items[] d_electronics) {
		
		this.d_electronics = d_electronics;
	}
	public Mobiles(){
	}
public Mobiles(String itemId, String itemName, String cost, String description,Items[] d_electronics)
{
	super(itemId, itemName, cost, description);
	this.d_electronics = d_electronics;
}
	
public Mobiles(Items [] d_electronics)
{
	this.d_electronics = d_electronics;
}
	public Items[] setItemsList() {
			return null;
	}

}
