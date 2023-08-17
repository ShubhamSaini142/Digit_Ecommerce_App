package Subcategory;
import Ecommerce.Customer;
import Ecommerce.Items;
import Ecommerce.Welcome;
import java.util.Scanner;
import Subcategory.Bikesandcars.Bikes;
import Subcategory.Bikesandcars.Cars;
import Subcategory.Electronics.Mobiles;
import sub.Subproducts;

public class BikesandCars1 implements Subproducts {

    public static void showBikesAndCars(Customer c) {

        System.out.println("===== $$$ Bikes and Cars $$$ =====");
        System.out.println("1. Bikes");
        System.out.println("2. Cars");
        System.out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
            	Bikes b = new Bikes();
			    Welcome.further(b,c);
                break;
            case 2:
            	Cars car = new Cars();
			    Welcome.further(car,c);
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


