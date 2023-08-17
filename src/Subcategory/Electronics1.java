package Subcategory;
import java.util.Scanner;

import Ecommerce.Customer;
import Ecommerce.Items;
import  Ecommerce.Welcome;
import Subcategory.Electronics.Earphones;
import Subcategory.Electronics.Laptops;
import Subcategory.Electronics.Mobiles;
import sub.Subproducts;
public class Electronics1 implements Subproducts {

public  static void showElectronics(Customer c) {

        System.out.println("===== $$$ Electronics $$$ =====");
        System.out.println("1. Mobile Phones");
        System.out.println("2. Laptops");
        System.out.println("3. Earphones");
        System.out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
            	Mobiles d = new Mobiles();
			    Welcome.further(d,c);
                break;
            case 2:
            	Laptops l = new Laptops();
            	Welcome.further(l,c);
                break;
            case 3:
            	Earphones e = new Earphones();
            	Welcome.further(e, c);
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
