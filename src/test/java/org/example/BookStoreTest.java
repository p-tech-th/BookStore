package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookStoreTest {

	@Test
	void shouldInsertBook() {
		//Arrange
		BookStoreManager bookManager = new BookStoreManager(1);
		Book doraemonBook = new Book("Doraemon", 80.0);
		//Act
		bookManager.addBook(doraemonBook);
		//Assert
		assertEquals(bookManager.getBookList()[0].getName(), "Doraemon");

	}

	@Test
	void shouldInsert2Book() {
		//Arrange
		BookStoreManager bookManager = new BookStoreManager(2);
		Book doraemonBook = new Book("Doraemon", 80.0);
		Book ultramanBook = new Book("Ultraman", 120.0);
		//Act
		bookManager.addBook(doraemonBook);
		bookManager.addBook(ultramanBook);
		//Assert
		assertEquals(bookManager.getBookList()[0].getName(), "Doraemon");
		assertEquals(bookManager.getBookList()[1].getName(), "Ultraman");

	}
	@Test
	void shouldGetMinPriceBook() {
		BookStoreManager bookManager = new BookStoreManager(2);
		Book doraemonBook = new Book("Doraemon", 80.0);
		Book ultramanBook = new Book("Ultraman", 120.0);
		//Act
		bookManager.addBook(doraemonBook);
		bookManager.addBook(ultramanBook);
		//Assert
		assertEquals(bookManager.getMinPriceBook(), 80.0);

	}

	@Test
	void shouldGetMaxPriceBook() {
		BookStoreManager bookManager = new BookStoreManager(2);
		Book doraemonBook = new Book("Doraemon", 80.0);
		Book ultramanBook = new Book("Ultraman", 120.0);
		//Act
		bookManager.addBook(doraemonBook);
		bookManager.addBook(ultramanBook);
		//Assert
		assertEquals(bookManager.getMaxPriceBook(), 120.0);
	}

	@Test
	void shouldGetTotalBookPrice(){
		BookStoreManager bookManager = new BookStoreManager(4);
		Book doraemonBook = new Book("Doraemon", 80.0);
		Book ultramanBook = new Book("Ultraman", 120.0);
		Book harryPotterBook = new Book("Harrypotter", 1.0);
		Book karmenRiderBook = new Book("karmenRider", 2.0);

		bookManager.addBook(doraemonBook);
		bookManager.addBook(ultramanBook);
		bookManager.addBook(harryPotterBook);
		bookManager.addBook(karmenRiderBook);

		assertEquals( 203.00, bookManager.getTotalBookPrice());
	}

}

