package Subcategory;

import java.util.Scanner;

import Ecommerce.Customer;
import Ecommerce.Items;
import Ecommerce.Welcome;
import Subcategory.Homesandappliances.Furniture;
import Subcategory.Homesandappliances.HomeDecor;
import Subcategory.Homesandappliances.KitchenAppliances;
import sub.Subproducts;


public class HomesAndAppliances implements Subproducts{

    public static void showHomesAndAppliances(Customer c) {

        System.out.println("===== $$$ Homes and Appliances $$$ =====");
        System.out.println("1. Furniture");
        System.out.println("2. Kitchen Appliances");
        System.out.println("3. Home Decor");
        System.out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
               
                Furniture fur = new Furniture();
			    Welcome.further(fur,c);
                break;
            case 2:
              
            	KitchenAppliances k = new KitchenAppliances();
			    Welcome.further(k,c);
                break;
            case 3:
            
            	HomeDecor h = new HomeDecor();
			    Welcome.further(h,c);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
    
    @Override
	public Items[] getItemsList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Items[] setItemsList() {
		// TODO Auto-generated method stub
		return null;
	}

}


