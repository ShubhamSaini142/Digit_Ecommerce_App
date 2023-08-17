package Subcategory.Homesandappliances;
import Ecommerce.Items;
import sub.Subproducts;

public class Furniture extends Items implements Subproducts{
private Items[] d_furniture;
	
	public Items[] getItemsList() {
		// TODO Auto-generated method stub
		Items item1 = new Items();
		item1.setItemId("1");
		item1.setItemName("Sofas");
		item1.setCost("\nCost :  ₹21,890\n");
		item1.setDescription("\nDescription: \t \n"
				+ "GODREJ INTERIO Leatherette Monarch 3 Seater Sofa - Red\n");
		
		
     	Items item2 = new Items();
		item2.setItemId("2");
		item2.setItemName("Bed");
		item2.setCost("\nCost :  ₹24,996\n");
		item2.setDescription("\nDescription: \t \n"
				+ "WeeHom Furniture Sheesham Wood King Size Bed Without Storage for\n "
				+ "Bedroom Wooden Double Bed Palang for Home and Hotels Without Bedside - (Honey Finish)\n");

		Items item3 = new Items();
		item3.setItemId("3");
		item3.setItemName("Dining Table");
		item3.setCost("\nCost :  ₹22,499\n");
		item3.setDescription("\nDescription: \t \n"
				+ "Woodcrest Sheesham Wood 6 Seater Dining Table Set with 6 Chairs for Living Room |\n"
				+ "Home & Office Furniture | Hotel & Dinner Restaurant | Rosewood, Honey Finish\n");
		
		Items item4 = new Items();
		item4.setItemId("4");
		item4.setItemName("Chairs");
		item4.setCost("\nCost :  ₹12,999\n");
		item4.setDescription("\nDescription: \t \n"
				+ "The Sleep Company SmartGRID Onyx High-Back Chair for Office & Home |\n"
				+ "Patented SmartGRID Technology for advanced Orthopedic Support\n"
				+ "|Adjustable Lumbar Support for Ergonomic Sitting Posture |Black & Grey\n");
		
		Items item5 = new Items();
		item5.setItemId("5");
		item5.setItemName("Desks");
		item5.setCost("\nCost :  ₹7,323\n");
		item5.setDescription("\nDescription: \t \n"
				+ "HNI India RATEO Ergonomic Design Table Executive, Home Study & Office Work Desk |\n"
				+ "25 mm Wooden top, Powder Coated Metal Finish Tubular Legs,\n"
				+ "shaped Q96-Silver LMX, 900 x 525 x 715 MM\n");
		
		
		d_furniture = new Items [5];
		d_furniture[0]= item1;
		d_furniture[1]=item2;
		d_furniture[2]=item3;
		d_furniture[3]=item4;
		d_furniture[4]=item5;
		return d_furniture;
		
	}

	public void setItemsList(Items[] d_furniture) {
		
		this.d_furniture = d_furniture;
	}
	public Furniture(){
	}
public Furniture(String itemId, String itemName, String cost,String description, Items[] d_furniture)
{
	super(itemId, itemName, cost,description);
	this.d_furniture = d_furniture;
}
	
public Furniture(Items [] d_furniture)
{
	this.d_furniture = d_furniture;
}
	public Items[] setItemsList() {
			return null;
	}

}

