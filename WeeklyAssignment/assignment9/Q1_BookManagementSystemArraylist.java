package assignment9;

import java.util.*;

class Book implements Comparable<Book>
{
	int bookId;
	String bookName;
	int price;
	Book(int bookId,	String bookName,	int price)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.price=price;
	}
	 void display() {
	        System.out.println(bookId+" "+bookName+" "+price);
	 }
	 public int compareTo(Book ob) {
	    	return (this.price-ob.price);
	    }
}
public class Q1_BookManagementSystemArraylist {
	public static void main(String[] args) {
		ArrayList<Book> books=new ArrayList<>(); 
		
		books.add(new Book(101,"java", 499));
		books.add(new Book(102,"Python", 399));
		books.add(new Book(103,"SQL", 299));
		books.add(new Book(104,"C++", 599));
		
		System.out.println("Original List:");
		for(Book b:books)
		{
			b.display();
		}
		System.out.println();
		
		Collections.sort(books);
		System.out.println("\nAfter Sorting by Price:");
		for (Book b : books) {
            b.display();
        }
	
		
		int removeId=102;
		 books.removeIf(book -> book.bookId == removeId);
		System.out.println("\nAfter Removing Book ID 102:");
		 for (Book b : books) {
	            b.display();
	        }
		 
		 
		 for (Book b : books) {
	            if (b.bookId == 103) {
	                b.price = 349;
	            }
	        }
		 System.out.println("\nAfter Updating Price:");
		 for (Book b : books) {
	            b.display();
	        }
		 
		 String searchName = "Java";
	        boolean found = false;

	        for (Book b : books) {
	            if (b.bookName.equalsIgnoreCase(searchName)) {
	                System.out.println("\nBook Found: " + b.bookName);
	                found = true;
	            }
	        }

	        if (!found) {
	            System.out.println("\nBook Not Found");
	        }
	        
	        System.out.println("\nFinal List:");
	        for (Book b : books) {
	            b.display();
	        }
	        
	        
	}
}
