package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.example.Book;

import org.junit.jupiter.api.Test;

class BookTest {

	private final Book book = new Book("doraemon", 80.00);

	@Test
	void shouldGetBookName() {
		assertEquals("doraemon", book.getName());
	}

	@Test
	void shouldGetBookPrice() {
		assertEquals(80.00, book.getPrice());
	}

	@Test
	void shouldGetToString() {
		assertNotNull(book.toString());
	}

}
