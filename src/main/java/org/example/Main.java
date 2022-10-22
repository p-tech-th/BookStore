package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		while (true) {
			int n;
			System.out.print("welcome to book store please input initialBookList or exit : ");
			Scanner sc = new Scanner(System.in);
			String menu;
			menu = sc.nextLine();
			if (Objects.equals(menu, "initialBookList")) {
				System.out.print("please insert bookshelf size : ");
				n = sc.nextInt();
				BookStoreManager bookStoreManager = new BookStoreManager(n);
				for (int i = 0; i < n; i++) {
					System.out.print("Please insert Book " + (i + 1) + " name: ");
					sc.nextLine();
					String name = sc.nextLine();
					System.out.print("Please insert Book " + (i + 1) + " price: ");
					Double price = sc.nextDouble();
					bookStoreManager.addBook(new Book(name, price));

				}
				System.out.print("Please Select minBookPrice or maxBookPrice or totalPrice: ");
				sc.nextLine();
				String menuSelection = sc.nextLine();
				if (Objects.equals(menuSelection, "minBookPrice")) {
					System.out.println(bookStoreManager.getMinPriceBook());
				}
				else if (Objects.equals(menuSelection, "totalPrice")) {
					System.out.println(bookStoreManager.getTotalBookPrice());
				}else if (Objects.equals(menuSelection, "maxBookPrice")) {
					System.out.println(bookStoreManager.getMaxPriceBook());
				}
			} else if (Objects.equals(menu, "exit")) {
				break;
			}
		}

	}
}
