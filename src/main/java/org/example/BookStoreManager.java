package org.example;

import java.util.Arrays;

public class BookStoreManager {
	private Book[] bookshelf;

	public BookStoreManager(int length) {
		this.bookshelf = new Book[length];
	}

	public void setBookshelf(Book[] bookshelf) {
		this.bookshelf = bookshelf;
	}

   public void addBook(Book book){
		for(int i = 0; i< this.bookshelf.length; i++) {
			if( this.bookshelf[i] == null){
				this.bookshelf[i] = book;
				break;
			}
		}
   }
   public double getTotalBookPrice(){
		double total = 0.0;
	   for(int i = 0; i< this.bookshelf.length; i++) {
		   total += this.bookshelf[i].getPrice();
	   }
	   return total;
   }

   public double getMinPriceBook(){
     double min = this.bookshelf[0].getPrice();
	   for( Book book: bookshelf){
		   if( book.getPrice() < min){
			   min = book.getPrice();
		   }
	   }
	   return min;
   }

   public double getMaxPriceBook(){
	   double max = this.bookshelf[0].getPrice();
	   for( Book book: bookshelf){
		   if( book.getPrice() > max){
			   max = book.getPrice();
		   }
	   }
	   return max;
   }
	public Book[] getBookList() {
		return bookshelf;
	}
}
