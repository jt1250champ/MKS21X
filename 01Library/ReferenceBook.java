public class ReferenceBook extends LibraryBook {
    private String collection;

    public ReferenceBook(String author, String title, String ISBN, String callNum, String collection) {
	super(author, title, ISBN, callNum);
	this.collection = collection;
    }

    public String getCollection() {
	return this.collection;
    }

    public void setCollection(String c) {
	this.collection = c;
    }

    public void checkout(String a, String b) {
	System.out.println("cannot check out a reference book");
    }

    public void returned() {
	System.out.println("reference book could not have been checked out -- return impossible");
    }

    public String circulationStatus() {
	return "non-circulating reference book";
    }

    public String toString() {
	return "Title: " + getTitle() + " Author: " + getAuthor() + " ISBN: " + getISBN() + " Call Number: " + getCallNum() + " Collection: " + getCollection();
    }
    
}
