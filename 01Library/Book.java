public class Book {
    private String author = "";
    private String title = "";
    private String ISBN = "";

    public Book() {
	
    }

    public Book(String author, String title, String ISBN) {
	setAuthor(author);
	setTitle(title);
	setISBN(ISBN);
    }

    public String toString() {
	return "Title: " +  getTitle() + " Author: " +  getAuthor() + " ISBN: " + getISBN();
    }

    public String getTitle() {
	return this.title;
    }

    public String getAuthor() {
	return this.author;
    }

    public String getISBN() {
	return this.ISBN;
    }
    
    public void setTitle(String title) {
	this.title = title;
    }                                                           
    public void setAuthor(String author) {
	this.author = author;
    }
    public void setISBN(String ISBN) {
	this.ISBN = ISBN;
    }
    
}
