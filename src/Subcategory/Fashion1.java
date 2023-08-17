package Subcategory;

import java.util.Scanner;

import Ecommerce.Customer;
import Ecommerce.Items;
import Ecommerce.Welcome;
import Subcategory.Fashion.Clothing;
import Subcategory.Fashion.Shoes;
import Subcategory.Fashion.Accessories;
import sub.Subproducts;

public class Fashion1 implements Subproducts{

    public static void showFashion(Customer c) {

        System.out.println("===== $$$ Fashion1 $$$ =====");
        System.out.println("1. Clothing");
        System.out.println("2. Shoes");
        System.out.println("3. Accessories");
        System.out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println();

        switch (choice) {
            case 1:

            	Clothing cl  = new Clothing();
			    Welcome.further(cl,c);
                break;
            case 2:
            	Shoes s = new Shoes();
			    Welcome.further(s,c);
                break;
            case 3:
            	Accessories a = new Accessories();
			    Welcome.further(a,c);
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
