package oop.constructor;

class Books {

	String title;
	String author;
	int pages;

	public Books() {
		title = "Unknown Title";
		author = "Unknown Autor";
	}

	public Books(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public Books(String title, String author, int pages) {
		this.title = title;
		this.author = author;
		this.pages = pages;
	}

	void showDetails() {
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("Pages : " + pages);
		System.out.println("----------------------------------------");
	}
}

public class Library {

	public static void main(String[] args) {
		Books b1 = new Books();
		b1.showDetails();
		
		Books b2 = new Books("Harry Potter", "J K Rowling");
		b2.showDetails();
		
		Books b3 = new Books("Feluda", "Satyajit Ray", 150);
		b3.showDetails();
	}

}
