
package Subcategory.Fashion;

import Ecommerce.Items;
import sub.Subproducts;

public class Shoes extends Items implements Subproducts {
	private Items[] d_shoes;

	public Items[] getItemsList() {
		// TODO Auto-generated method stub
		Items item1 = new Items();
		item1.setItemId("1");
		item1.setItemName("Sneakers");
		item1.setCost("\nCost :  ₹1,719\n");
		item1.setDescription("\nDescription: \t \n " + "Puma Womens Smashic Wmn Casual Shoes\n");

		Items item2 = new Items();
		item2.setItemId("2");
		item2.setItemName("Boots");
		item2.setCost("\nCost :  ₹3,399\n");
		item2.setDescription("\nDescription: \t \n" + "Bacca Bucci Men's Urban Suede Leather Snow Adjustable Lace up\n"
				+ "for work combat hiking motorcycle military tactical\n");

		Items item3 = new Items();
		item3.setItemId("3");
		item3.setItemName("Heels");
		item3.setCost("\nCost :  ₹1,719\n");
		item3.setDescription("\nDescription: \t \n " + "ZAPATOZ Women's Girls Stylish and Latest Fashion \n"
				+ "Pointed Platform Heels Pump Sandals\n");

		Items item4 = new Items();
		item4.setItemId("4");
		item4.setItemName("Sandals");
		item4.setCost("\nCost :  ₹1,800\n");
		item4.setDescription("\nDescription: \t \n " + "Sparx Men's Ss9007g Sandal\n");

		Items item5 = new Items();
		item5.setItemId("5");
		item5.setItemName("Flats");
		item5.setCost("\nCost :  ₹1,599\n");
		item5.setDescription("\nDescription: \t \n " + "Metro Men Leather Men Chappals (16-9788)\n");

		d_shoes = new Items[5];
		d_shoes[0] = item1;
		d_shoes[1] = item2;
		d_shoes[2] = item3;
		d_shoes[3] = item4;
		d_shoes[4] = item5;
		return d_shoes;

	}

	public void setItemsList(Items[] d_shoes) {

		this.d_shoes = d_shoes;
	}

	public Shoes() {
	}

	public Shoes(String itemId, String itemName, String cost, String description, Items[] d_shoes) {
		super(itemId, itemName, cost, description);
		this.d_shoes = d_shoes;
	}

	public Shoes(Items[] d_shoes) {
		this.d_shoes = d_shoes;
	}

	public Items[] setItemsList() {
		return null;
	}

}
