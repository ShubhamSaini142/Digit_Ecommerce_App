package Subcategory.Homesandappliances;
import Ecommerce.Items;
import sub.Subproducts;

public class HomeDecor extends Items implements Subproducts{
private Items[] d_homeDecor;
	
	public Items[] getItemsList() {
		// TODO Auto-generated method stub
		Items item1 = new Items();
		item1.setItemId("1");
		item1.setItemName("Mirrors");
		item1.setCost("\nCost :  ₹419\n");
		item1.setDescription("\nDescription: \t \n"
				+ "Bikri Kendra - Hexagon 20 Golden mirror stickers for wall, hexagon mirror wall stickers,\n"
				+ " acrylic mirror wall decor sticker,hexagonal mirror wall sticker, wall mirror stickers,\n"
				+ "wall stickers for hall room, bed room, Kitchen (Gold)\n");
		
		
     	Items item2 = new Items();
		item2.setItemId("2");
		item2.setItemName("Rugs");
		item2.setCost("\nCost :  ₹2,429\n");
		item2.setDescription("\nDescription: \t \n"
				+ "HR Carpets_Soft Modern Shag Area Rugs Fluffy Living Room Carpet Comfy Bedroom Home Decorate\n"
				+ " Floor Kids Playing Mat [Size 3x5 feet].\n");

		Items item3 = new Items();
		item3.setItemId("3");
		item3.setItemName("Curtains");
		item3.setCost("\nCost :  ₹400\n");
		item3.setDescription("\nDescription: \t \n"
				+ "Home Sizzler 2 Piece Garden Panel Eyelet Polyester Window Curtains - 5 Feet, Brown\n");
		
		Items item4 = new Items();
		item4.setItemId("4");
		item4.setItemName("Candles");
		item4.setCost("\nCost :  ₹1,299\n");
		item4.setDescription("\nDescription: \t \n"
				+ "LTETTES Flameless LED Candles AA Battery Powered with Golden Acrylic Glass with Remote\n "
				+ "Controller and Timer for Home Festival Wedding Decor (Set of 3-3\" D x 4\",5\",6\" H)\n");
		
		Items item5 = new Items();
		item5.setItemId("5");
		item5.setItemName("Paintings");
		item5.setCost("\nCost :  ₹2,099\n");
		item5.setDescription("\nDescription: \t \n"
				+ "PRINTELLIGENT Floral Wall Art - Large Abstract Landscape Painting for Living Room,\n"
				+ " Bedroom, and Office Walls - 27 x 50 Inchesd103\n");
	
		
		d_homeDecor = new Items [5];
		d_homeDecor[0]= item1;
		d_homeDecor[1]=item2;
		d_homeDecor[2]=item3;
		d_homeDecor[3]=item4;
		d_homeDecor[4]=item5;
		return d_homeDecor;
		
	}

	public void setItemsList(Items[] d_homeDecor) {
		
		this.d_homeDecor = d_homeDecor;
	}
	public HomeDecor(){
	}
public HomeDecor(String itemId, String itemName, String cost,String description, Items[] d_homeDecor)
{
	super(itemId, itemName, cost,description);
	this.d_homeDecor = d_homeDecor;
}
	
public HomeDecor(Items [] d_homeDecor)
{
	this.d_homeDecor = d_homeDecor;
}
	public Items[] setItemsList() {
			return null;
	}

}

