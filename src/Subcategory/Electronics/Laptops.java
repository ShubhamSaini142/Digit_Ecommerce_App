package Subcategory.Electronics;
import Ecommerce.Items;
import sub.Subproducts;

public class Laptops extends Items implements Subproducts{
private Items[] d_laptop;
	
	public Items[] getItemsList() {
		// TODO Auto-generated method stub
		Items item1 = new Items();
		item1.setItemId("1");
		item1.setItemName("ASUS Chromebook Touch Intel Celeron Dual Core");
		item1.setCost("\\nCost :  ₹18,990\n");
		item1.setDescription("\nDescription: \t \n"
				+ "Intel Celeron Dual Core - (4 GB/64 GB EMMC Storage/Chrome OS) C523NA-A20303\n "
				+ "Chromebook  (15.6 inch, Silver, 1.69 Kg) \n");
		
		
     	Items item2 = new Items();
		item2.setItemId("2");
		item2.setItemName("realme Book (Slim)");
		item2.setCost("\\nCost :  ₹31,999\n");
		item2.setDescription("\nDescription: \t \n "
				+ "Core i3 11th Gen - (8 GB/256 GB SSD/Windows 10 Home) RMNB1001 Thin and Light Laptop \n"
				+ " (14 inch, Real Blue, 1.38 kg)\n");

		Items item3 = new Items();
		item3.setItemId("3");
		item3.setItemName("HP Ryzen 5");
		item3.setCost("\\nCost :  ₹45,990\n");
		item3.setDescription("\nDescription: \t \n "
				+ "Hexa Core 5500U - (16 GB/512 GB SSD/Windows 11 Home) 15s- eq2182AU Thin and Light Laptop \n"
				+ " (15.6 Inch, Natural Silver, 1.69 Kg, With MS Office)\n");
		
		Items item4 = new Items();
		item4.setItemId("4");
		item4.setItemName("Primebook 4G ");
		item4.setCost("\\nCost :  ₹12,990");
		item4.setDescription("\nDescription: \t \n"
				+ "Primebook 4G Android Based MediaTek MT8788 - (4 GB/64 GB EMMC Storage/Prime OS)\n"
				+ " 4G Thin and Light Laptop  (11.6 Inch, Black, 1.065 Kg)\n ");
		
		Items item5 = new Items();
		item5.setItemId("5");
		item5.setItemName("Lenovo IdeaPad");
		item5.setCost("\\nCost :  ₹67,990\n");
		item5.setDescription("\nDescription: \t \n "
				+ " Gaming 3 Ryzen 7 Octa Core AMD R7-5800H - (16 GB/512 GB SSD/Windows 11 Home/4 GB\n"
				+ " Graphics/NVIDIA GeForce RTX 3050) 15ACH6 Gaming Laptop  (15.6 Inch, Shadow Black, With MS Office)\n");
		
		d_laptop = new Items [5];
		d_laptop[0]= item1;
		d_laptop[1]=item2;
		d_laptop[2]=item3;
		d_laptop[3]=item4;
		d_laptop[4]=item5;
		return d_laptop;
		
	}

	public void setItemsList(Items[] d_laptop) {
		
		this.d_laptop = d_laptop;
	}
	public Laptops(){
	}
public Laptops(String itemId, String itemName, String cost, String description, Items[] d_laptop)
{
	super(itemId, itemName, cost, description);
	this.d_laptop = d_laptop;
}
	
public Laptops(Items [] d_laptop)
{
	this.d_laptop = d_laptop;
}
	public Items[] setItemsList() {
			return null;
	}

}
