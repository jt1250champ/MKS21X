import java.util.Iterator;

public class SuperArrayIterator implements Iterator<String> {
    private SuperArray sa = new SuperArray();
    private int element = 0;

    public SuperArrayIterator(SuperArray name) {
        this.sa = name;
    }

    public boolean hasNext() {
        if(element < sa.size()) {
            return true;
        } return false;
    }

    public String next() {
        if(hasNext()) {
	    
        }
    }

    public void remove() {
        throw UnsupportedOperationException();
    }
}
