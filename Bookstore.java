package Bookstore;

public class Bookstore {
private Book books[];


public Bookstore(Book[] books) {
	super();
	this.books = books;
}
public void sellBook(String bookTitle, int noofcopies) {
	int index = -1;
	for (int i = 0; i < books.length; i++) {
		if (bookTitle.equalsIgnoreCase(books[i].getBooktitle()) && books[i].getNoofcopies()!=0 && noofcopies <= books[i].getNoofcopies()) {
			int copies = books[i].getNoofcopies() - noofcopies;
			books[i].setNoofcopies(copies);
			index  = i;
		}
	}
	if( index != -1) {
		System.out.println("Remaining copies of java book");
		books[index].display();
	} else {
		System.out.println("Book not found or No sufficient books");
	}
}

public void orderBooks(String iSBN, int noofcopies) {
	int index = -1;
	for(int i=0; i<books.length; i++) {
		if(iSBN.equals(books[i].getIsbn()) ) {
			books[i].setNoofcopies(books[i].getNoofcopies() + noofcopies);
			index = i;
		}
	}
	if(index != -1) {
		System.out.println("Added books to the system");
	} else {
		System.out.println("Book was not found Order new book");
	}
}

public void printBookDetails() {
	for (int i = 0; i < books.length; i++) {
		books[i].display();
	}
}


//void order(String isbn, int nofOfCopies) 
//void display()
}
