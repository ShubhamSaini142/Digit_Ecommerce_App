
package Subcategory.Bikesandcars;
import Ecommerce.Items;
import sub.Subproducts;

public class Bikes extends Items implements Subproducts{
private Items[] d_bikes;
	
	public Items[] getItemsList() {
		// TODO Auto-generated method stub
		Items item1 = new Items();
		item1.setItemId("1");
		item1.setItemName("Mavic Clamber 26 X 3.0\n");
		item1.setCost("\nCost :  ₹ 8,900.00\n");
		item1.setDescription("\nDescription :\t \n"
				+ "The bike has a strong suspension fork for absorbing jerks\n"
				+ "chainwheel 44 T Alloy rims with CNC are light weight and give higher performanceand\n"
				+ "E.D rim spokes for long life assembled on direct mounted disc hubs Front and Rear\n"
				+ "The bike comes with PU saddle for comfort and saddle height can be adjusted\n"
				+ "without any tools WIDE 3.0 tyres for sporty look and less jerks\n");

		
     	Items item2 = new Items();
		item2.setItemId("2");
		item2.setItemName("FANTOM CYCLE\n");
		item2.setCost("\nCost : ₹ 27,999.00\n");
		item2.setDescription("\nDescription :\t \n"
				+ "Frame: 19.00 Inch It is a Road Bike It is for Men Included Components:\n"
				+ "Cycle Will Be 85% Assemble U Need To Take Cycle Shop For Assemble;\n"
				+ "Brake Style: Disc; Speed Rating: 21-Speed\n");

		Items item3 = new Items();
		item3.setItemId("3");
		item3.setItemName("Destro Elite Bmx Bike\n");
		item3.setCost("\nCost :  ₹ 71,956.00\n");
		item3.setDescription("\nDescription :\t \n"
				+ "Destro Elite Bmx Bike 20in White Chrome Destro Destro\n"
				+ "Elite Bmx Bike 20in White Chrome\n");
		
		Items item4 = new Items();
		item4.setItemId("4");
		item4.setItemName("AUTONIX EV INDY Electric Bicycle");
		item4.setCost("\nCost :  ₹ 30,000.00\n");
		item4.setDescription("\nDescription :\t \n"
				+ "STRONGER 250W 36V BLDC Electric Rear Hub Motor -- The commuter\n"
				+ " E-Bike Autonix INDY is equipped with a 250W 36V High Speed Brushless Electric Motor,\n"
				+ " providing more than enough power for your daily commutes, a cruise on the mountain,\n"
				+ "or a meander along your favorite trail. With speeds of up to 25 KM/HR, It will get you there swiftly.\n");
		
		Items item5 = new Items();
		item5.setItemId("5");
		item5.setItemName("Folding Mountain Bikes");
		item5.setCost("\nCost :  ₹ 77,589.00\n");
		item5.setDescription("\nDescription :\t \n"
				+ " Folding Mountain Bikes 27.5 For Men Adult Bicycles 3 Spokegreen Eurobike\n "
				+ "Folding Mountain Bikes 27.5 For Men Adult Bicycles 3 Spokegreen \n");
		
		
		d_bikes = new Items [5];
		d_bikes[0]= item1;
		d_bikes[1]=item2;
		d_bikes[2]=item3;
		d_bikes[3]=item4;
		d_bikes[4]=item5;

		return d_bikes;
		
	}

	public void setItemsList(Items[] d_bikes) {
		
		this.d_bikes = d_bikes;
	}
	public Bikes(){
	}
public Bikes(String itemId, String itemName, String cost, String description,Items[] d_bikes)
{
	super(itemId, itemName, cost,description);
	this.d_bikes = d_bikes;
}
	
public Bikes(Items [] d_bikes)
{
	this.d_bikes = d_bikes;
}
	public Items[] setItemsList() {
			return null;
	}

}


