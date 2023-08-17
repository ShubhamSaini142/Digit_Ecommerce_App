package Subcategory;

import java.util.Scanner;

import Ecommerce.Customer;
import Ecommerce.Items;
import Ecommerce.Welcome;
import sub.Subproducts;
import Subcategory.Groceries.Fruits;
import Subcategory.Groceries.Vegetables;
import Subcategory.Groceries.Dairy_product;


public class Groceries1 implements Subproducts{

    public static void showGroceries(Customer c) {

        System.out.println("===== $$$ Groceries1 $$$ =====");
        System.out.println("1. Fruits");
        System.out.println("2. Vegetables");
        System.out.println("3. Dairy Products");
        System.out.println("4. Meat and Poultry");
        System.out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println();

        switch (choice) {
            case 1:

            	Fruits f  = new Fruits();
			    Welcome.further(f,c);
                break;
            case 2:

                Vegetables  v = new Vegetables();
			    Welcome.further(v,c);
                break;
            case 3:

            	Dairy_product dp  = new Dairy_product();
			    Welcome.further(dp,c);
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

