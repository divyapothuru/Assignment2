package Bookstore;

public class q2Book2 {
private String booktitle;
private String bookauthor;
private String isbn;
private int noofcopies;
public q2Book2(String booktitle, String bookauthor, String isbn, int noofcopies) {
	super();
	this.booktitle = booktitle;
	this.bookauthor = bookauthor;
	this.isbn = isbn;
	this.noofcopies = noofcopies;
}
public String getBooktitle() {
	return booktitle;
}
public void setBooktitle(String booktitle) {
	this.booktitle = booktitle;
}
public String getBookauthor() {
	return bookauthor;
}
public void setBookauthor(String bookauthor) {
	this.bookauthor = bookauthor;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public int getNoofcopies() {
	return noofcopies;
}
public void setNoofcopies(int noofcopies) {
	this.noofcopies = noofcopies;
}
public void display()
{
	System.out.println("title"+booktitle+"Author:"+bookauthor+"isbn"+isbn);
}
}
