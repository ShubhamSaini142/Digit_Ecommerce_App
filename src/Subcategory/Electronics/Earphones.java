package Subcategory.Electronics;
import Ecommerce.Items;
import sub.Subproducts;

public class Earphones extends Items implements Subproducts{
private Items[] d_earphones;
	
	public Items[] getItemsList() {
		// TODO Auto-generated method stub
		Items item1 = new Items();
		item1.setItemId("1");
		item1.setItemName("Apple AirPods Pro");
		item1.setCost("\nCost :  ₹ 13,990\n");
		item1.setDescription("\nDescription: \t \n "
				+ "Airpods With Wireless Charging Case.more Magical Than Ever,\n"
				+ "the New Airpods-complete With Wireless Charging Case-combine Intelligent Design With \n"
				+ "Breakthrough Technology And Crystal Clear Sound\n");
		
		
     	Items item2 = new Items();
		item2.setItemId("2");
		item2.setItemName("OnePlus Buds Z2");
		item2.setCost("\nCost :  ₹4,598\n");
		item2.setDescription("\nDescription: \t \n"
				+ "Enjoy crystal clear sound with the intelligently built Oneplus Buds Z2 earbuds.\n"
				+ "These earbuds come with an active noise cancellation feature and three MIC’s so \n"
				+ "that you can enjoy enhanced sound clarity, clear voice recordings and easy-to-hear voice call\n");

		Items item3 = new Items();
		item3.setItemId("3");
		item3.setItemName("Realme Buds Air 3S");
		item3.setCost("\nCost :  ₹2,498\n");
		item3.setDescription("\nDescription: \t \n"
				+ "with Dual Device Pairing and 30hrs Total Playback\n"
				+ " Bluetooth Headset  (Bass Black, In the Ear\n");
		
		Items item4 = new Items();
		item4.setItemId("4");
		item4.setItemName("SONY WF-C500");
		item4.setCost("\nCost :  ₹3,990\n");
		item4.setDescription("\nDescription: \t \n"
				+ "You can enjoy listening to your favourite tracks with the Sony WF-C500 Truly Wireless In-ear Earbuds.\n"
				+ "Thanks to their convenient charging case, these earbuds provide up to 20 hours of playback time.\n");
		
		Items item5 = new Items();
		item5.setItemId("5");
		item5.setItemName("boAt Airdopes 141");
		item5.setCost("\nCost :  ₹998\n");
		item5.setDescription("\nDescription: \t \n "
				+ "Bluetooth Truly Wireless in Ear Headphones with 42H Playtime,Low Latency Mode for Gaming,\n"
				+ " ENx Tech, IWP, IPX4 Water Resistance, Smooth Touch Controls(Bold Black)\n");
		
		
		d_earphones = new Items [5];
		d_earphones[0]= item1;
		d_earphones[1]=item2;
		d_earphones[2]=item3;
		d_earphones[3]=item4;
		d_earphones[4]=item5;
		return d_earphones;
		
	}

	public void setItemsList(Items[] d_earphones) {
		
		this.d_earphones = d_earphones;
	}
	public Earphones(){
	}
public Earphones(String itemId, String itemName, String cost, String description, Items[] d_earphones)
{
	super(itemId, itemName, cost,description);
	this.d_earphones = d_earphones;
}
	
public Earphones(Items [] d_earphones)
{
	this.d_earphones = d_earphones;
}
	public Items[] setItemsList() {
			return null;
	}

}
