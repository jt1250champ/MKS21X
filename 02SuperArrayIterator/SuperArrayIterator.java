import java.util.*;

public class SuperArrayIterator implements Iterator<String> {
    private SuperArray sa = new SuperArray();
    private int element = 0;

    public SuperArrayIterator(SuperArray name) {
        this.sa = name;
    }

    public boolean hasNext() {
        return element < sa.size();
    }

    public String next() {
        if(hasNext()) {
	    element++;
	    return sa.get(element - 1);
        }else {
	    throw new NoSuchElementException();
	}
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
