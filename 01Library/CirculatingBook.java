public class CirculatingBook extends LibraryBook {
    private String currentHolder;
    private String dueDate;

    public CirculatingBook(String author, String title, String ISBN, String callNum){
        super(author, title, ISBN, callNum);
        this.currentHolder = null;
        this.dueDate = null;
    }

    public String getCurrentHolder() {
        return currentHolder;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setCurrentHolder(String ch) {
        currentHolder = ch;
    }

    public void setDueDate(String dd) {
        dueDate = dd;
    }

    public void checkout(String patron, String dd) {
        currentHolder = patron;
        dueDate = dd;
    }

    public void returned() {
        currentHolder = null;
        dueDate = null;
    }

    public String circulationStatus(){
	if(currentHolder != null && dueDate != null) {
	    return  "Current Holder: " + currentHolder + " Due Date: " + dueDate;
        } else {
            return "book available on shelves";
        }
    }

    public String toString() {
        if(currentHolder != null && dueDate != null) {
	    return "Title: " + this.getTitle() + " Author: " + getAuthor() + " ISBN: " + getISBN() + " Call Number: " + getCallNum() + " Current Holder: " + currentHolder + " Due Date: " + dueDate;
        } else {
            return "Title: " + getTitle() + " Author: " + getAuthor() + " ISBN: " + getISBN() + " Call Number: " + getCallNum();
        }
    }
}
