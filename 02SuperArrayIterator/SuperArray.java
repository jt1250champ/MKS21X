import java.util.*;
public class SuperArray implements Iterable<String>{
    private String[] data;
    private int size;

    public SuperArray() {
	size = 0;
	data = new String[10];
    }

    public SuperArray(int initialCapacity) {
	if(initialCapacity < 0){
	    throw new IllegalArgumentException();
	}
	size = 0;
	data = new String[initialCapacity];
    }

    public int size() {
	return size;
    }


    public String get(int index) {
	if(index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	return data[index];
    }

    public void clear() {
	String[] temp = new String[data.length];
	data = temp;
	size = 0;
    }

    public boolean isEmpty() {
	if(size == 0) {
	    return true;
	}
	else {
	    return false;
	}
    }

    public String set(int index, String element) {
        if(index < 0 || index >= size()) {
	    throw new IndexOutOfBoundsException();
	}
	data[index] = element;
	return data[index];
    }
    
    private void grow(){
	String[] temp = new String[data.length*2];
	for(int i = 0; i < data.length; i++){
	    temp[i] = data[i];
	}
	data = temp;
    }
       
    public boolean add(String  element) {
	if(size == data.length) {
	    this.grow();
	}
	data[size] = element;
	size++;
	return true;
    }

    public void add(int index, String  element) {
        if(index < 0 || index > size()) {
	    throw new IndexOutOfBoundsException();
	}
	if(size == data.length) {
	    this.grow();
	}
	for(int i = size; i > index; i--) {
	    data[i] = data[i-1];
	}
	data[index] = element;
	size++;
    }

    public String  remove(int index) {
	if(index < 0 || index >= size()) {
	    throw new IndexOutOfBoundsException();
	}
	String removedValue = data[index];
	for(int i = index; i < size; i++) {
	    data[i] = data[i+1];
	}
	size--;
	return removedValue;
    }

    public String[] toArray() {
	String[] formattedArray = new String[size];
	for(int i = 0; i < size; i++) {
	    formattedArray[i] = data[i];
	}
	return formattedArray;
    }

    public int indexOf(String n) {
	for(int i = 0; i < size; i++){
	    if(n.equals(data[i])){
		return i;
	    }
	}
	return -1;
    }
    
    public int lastIndexOf(String n){
	for(int i = size-1; i >= 0; i--){
	    if(n.equals(data[i])){
		return i;
	    }
	}
	return -1;
    }
    
    public String toString() {
	String temp = "[";
	for(int i = 0; i < size; i++) {
	    if(i == (size-1)) {
		temp += data[i];
	    }
	    else {
		temp += data[i] + ", ";
	    }
	}
	return temp + "]";
    }
    
    public String toStringDebug() {
	String temp = "[";
	for(int i = 0; i < size; i++) {
	    if(i == (data.length-1)) {
		temp += data[i];
	    }
	    else {
		temp += data[i] + ", ";
	    }
	}
	for(int i = size; i < data.length; i++) {
	    if(i == (data.length-1)) {
		temp += "_";
	    }
	    else {
		temp += "_, ";
	    }
	}
	return temp + "]";
    }

    public Iterator<String> iterator() {
	return new SuperArrayIterator(this);
    }
}
