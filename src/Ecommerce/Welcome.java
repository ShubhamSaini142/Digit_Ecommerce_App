package Ecommerce;

import java.util.Scanner;

import Subcategory.Fashion1;
import Subcategory.BikesandCars1;
import Subcategory.Electronics1;
import Subcategory.Groceries1;
import Subcategory.HomesAndAppliances;
import sub.Subproducts;

public class Welcome {

//	 SHOWING AND ADD PRODUCTS TO CART

	public static void further(Subproducts subproduct, Customer c) {
		Items[] allItems = subproduct.getItemsList();
		showItems(allItems);
		add_to_cart(allItems, c);

	}

	// SHOW ITEMS LIST

	public static void showItems(Items[] allItems) {
		for (int i = 0; i < allItems.length; i++) {
			System.out.println(allItems[i].getItemId() + " " + allItems[i].getItemName()
					+ " " + allItems[i].getCost() + " " + allItems[i].getDescription());

		}
	}

	// ADD TO CART

	public static Items[] add_to_cart(Items[] allItems, Customer c) {
		Items[] cartItem = new Items[1];
		boolean isValid = true;
		while (isValid) {
			System.out.println("Wanna add any item to the cart?");
			System.out.println("Enter 'Y' for YES and 'N' for NO");
			Scanner sc = new Scanner(System.in);
			String add_to_cart = sc.nextLine();
			if (add_to_cart.equals("Y")) {
				System.out.println("Input the product id");
				String itemId = sc.nextLine();
				for (int i = 0; i < allItems.length; i++) {
					if (allItems[i].getItemId().equals(itemId)) {
						cartItem[0] = allItems[i];
					}
				}
				Cart cart = new Cart();
				cart.setItemsList(cartItem);
				c.setCart(cart);
				System.out.println("The product successfully added to cart\n");
				System.out.println("🙏 ThankYou!! Shop Again");
				isValid = false;
			} else if (add_to_cart.equals("N")) {
				System.out.println("Okhay ! going back to main");
				isValid = false;
			} else {
				System.out.println("INVALID INPUT!!  Please enter a valid input");
				continue;
			}

		}

		return cartItem;
	}
	

	// FOR CREATING CUSTOMER

	public static Customer CreateCustomer() {
		Scanner sc = new Scanner(System.in);
		Customer c = new Customer();
		System.out.println("Enter UserID");
		c.setUserId = (sc.next());
		System.out.println("Enter Password");
		c.setPassword = (sc.next());
		if (c.verifyUserId() == true) {
			System.out.println("Customer Verified");
		}
		return c;
	}

	public static void main(String[] args) {

		System.out.println("      WELCOME TO DIGIT SHOPPERS STOP! 🙏     ");
		System.out.println("               (づ ◕‿◕ )づ                ");
		System.out.println();
		System.out.println(" Please enter 1 to Create ID  👩‍🦰");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		if (choice == 1) {
			Customer c = CreateCustomer();
			while (true) {
				System.out.println();
				System.out.println("( ͡° ͜ʖ ͡° ) Do you want to:  ");
				System.out.println(" ");
				System.out.println("1. View Products");
				System.out.println(" ");
				System.out.println("2. View Cart");
				System.out.println(" ");
				System.out.println("3.  Exit");
				System.out.println(" ");

				int enter_choice = sc.nextInt();
				if (enter_choice == 1) {
					System.out.println(" ");
					System.out.println("Choose which section you want to explore?");
					System.out.println();
					System.out.println("1.  👗 Fashion1");
					System.out.println();
					System.out.println("2. ⚡ Electronics");
					System.out.println();
					System.out.println("3. 🛒 Groceries1");
					System.out.println();
					System.out.println("4. 🏍️ Bikes & Cars");
					System.out.println();
					System.out.println("5. 🏕 Home & Appliances");
					System.out.println();

					int category_choice = sc.nextInt();
					if (category_choice == 1) {
						System.out.println();
						System.out.println("More in Fashion:");
						Fashion1.showFashion(c);
					} else if (category_choice == 2) {
						System.out.println();
						System.out.println("More in Electronics:");
						Electronics1.showElectronics(c);
					} else if (category_choice == 3) {
						System.out.println();
						System.out.println("More in Groceries:");
						Groceries1.showGroceries(c);

//						
					} else if (category_choice == 4) {
						System.out.println();
						System.out.println("More in Bikes & Cars");
						BikesandCars1.showBikesAndCars(c);

					} else if (category_choice == 5) {
						System.out.println();
						System.out.println("More in HomesAndAppliances:");
						HomesAndAppliances.showHomesAndAppliances(c);
					}

				}

				else if (enter_choice == 2) {
					System.out.println();
					try {
						Items[] cartItem = c.getCart().getItemsList();
						for (int i = 0; i < cartItem.length; i++) {
							System.out.println(cartItem[i].getItemId() + " " + cartItem[i].getItemName() + " "
									+ cartItem[i].getCost() + " " + cartItem[i].getDescription());
						}
					} catch (Exception e) {
						System.out.println("cart is empty");
					}
					
					
				} else if (enter_choice == 3) {
					break;
				} else {
					System.out.println();
					System.out.println("INVALID INPUT!!  Please enter a valid input");
				}

			}
		} else {
			System.out.println();
			System.out.println("You haven't enter a value ...please enter a valid value");
			System.out.println();
			System.out.println();
		}
		sc.close();
	}

}
