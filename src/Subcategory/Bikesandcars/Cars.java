
package Subcategory.Bikesandcars;
import Ecommerce.Items;
import sub.Subproducts;

public class Cars extends Items implements Subproducts{
private Items[] d_cars;
	
	public Items[] getItemsList() {
		// TODO Auto-generated method stub
		Items item1 = new Items();
		item1.setItemId("1");
		item1.setItemName("Honda City");
		item1.setCost("\nCost :  Rs. 11.60 Lakh\n");
		item1.setDescription("\nDescription :\t \n "
				+ "Potent motor - This refined engine offers adequate performance across the rev-range\r\n"
				+ "Spacious cabin - Acres of space, continues to offer enormous comfortable seats\r\n"
				+ "Delightful to drive - With sorted dynamics, it feels engaging behind the wheel\r\n"
				+ "CVT gearbox - Reduced rubber-band effect plus paddle shifters make it enjoyable\n");
		
		
     	Items item2 = new Items();
		item2.setItemId("2");
		item2.setItemName("Magnite XV Executive");
		item2.setCost("\nCost :  Rs. 7.34 Lakh\n");
		item2.setDescription("\nDescription :\t \n"
				+ "This Nissan SUV offers two engine options. The first is a 1.0-litre 71bhp/96Nm\n"
				+ " naturally aspirated (NA) petrol engine which is coupled to a five-speed manual gearbox.\n"
				+ "The second option is a 99bhp/152Nm 1.0-litre turbo petrol engine which uses either a five-speed\n"
				+ " manual or a CVT transmission.\n");

		Items item3 = new Items();
		item3.setItemId("3");
		item3.setItemName("Tiago XZA Plus");
		item3.setCost("\nCost :  Tiago XZA Plus");
		item3.setDescription("\nDescription :\t \n"
				+ "With the BS6 update, the Tata Tiago has capitalised on what it did best and improved on its\n"
				+ "shortcomings. So it remains a cheery little city-runabout that is even handsome to look at now\n"
				+ " with the Altroz-inspired face.\n");
		
		Items item4 = new Items();
		item4.setItemId("4");
		item4.setItemName("BMW 2 Series Gran Coupe 220i M Sport");
		item4.setCost("\nCost :  Rs. 43.50 Lakh");
		item4.setDescription("\nDescription :\t \n "
				+ "Powertrain options on the BMW 2 Series Gran Coupe are a 2.0-litre\n "
				+ "diesel engine and a 2.0-litre petrol engine.The former is tuned to produce 187bhp and\n"
				+ " 400Nm of torque, while the latter produces 189bhp/280Nm of peak torque\n");
		
		Items item5 = new Items();
		item5.setItemId("5");
		item5.setItemName("MINI Cooper Convertible");
		item5.setCost("\nCost :  Rs. 38.30 Lakh");
		item5.setDescription("\nDescription :\t \n"
				+ "MINI Cooper Convertible S [2018-2020] is the top model in the Cooper Convertible lineup and\n"
				+ "the price of Cooper Convertible top model is Rs. 38.30 Lakh.\n"
				+ "It gives a mileage of 16.82 kmpl. MINI Cooper\n");
		
		d_cars = new Items [5];
		d_cars[0]= item1;
		d_cars[1]=item2;
		d_cars[2]=item3;
		d_cars[3]=item4;
		d_cars[4]=item5;
		return d_cars;
		
	}

	public void setItemsList(Items[] d_cars) {
		
		this.d_cars = d_cars;
	}
	public Cars(){
	}
public Cars(String itemId, String itemName, String cost, String description ,Items[] d_cars)
{
	super(itemId, itemName, cost,description);
	this.d_cars = d_cars;
}
	
public Cars(Items [] d_cars)
{
	this.d_cars = d_cars;
}
	public Items[] setItemsList() {
			return null;
	}

}


