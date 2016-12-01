public abstract class LibraryBook extends Book implements Comparable<LibraryBook> {
    
    private String callNumber;
    
    public LibraryBook(String author, String title, String ISBN, String callNumber) {
	super(author, title, ISBN);
	setCallNum(callNumber);
    }

    public String getCallNum() {
	return this.callNumber;
    }

    public void setCallNum(String callNum) {
	this.callNumber = callNum;
    }
    
    public abstract void checkout(String patron, String due);
    public abstract void returned();
    public abstract String circulationStatus();

    public int compareTo(LibraryBook book) {
	return this.getCallNum().compareTo(book.getCallNum());
    }

    public String toString() {
	return "Title: " + getTitle() + " Author: " + getAuthor() + " ISBN: " + getISBN() + " Call Number: " + getCallNum();
    }
}
						   
