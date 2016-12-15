import java.util.*;
public class Sorts{

  public static String name(){
    return "10.Tao.JT"; 
  }

  /**Selection sort of an int array. 
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int[] data){
      for(int i = 0; i < data.length; i++) {
	  int minnie = data[i];
	  int current = data[i];
	  int place = i;
	  for(int j = i + 1; j < data.length; j++) {
	      if(data[j] < minnie) {
		  minnie = data[j];
		  place = j;
	      }
	  }
	  data[i] = minnie;
	  data[place] = current;	  
      }
  }

    public static void insertionSort(int[] data) {
	for(int i = 0; i < data.length - 1; i++) {
	    int j = i + 1;
	    int current = data[j];
	    for(int place = i; place >= 0; place--) {
		if(data[j] < data[place]) {
		    int relmin = place;
		    data[place + 1] = data[place];
		}
	    }
	    data[relmin] = current;
	}
    }

    public static void bubbleSort(int[] data) {
	for(int i = data.length - 1; i >= 0; i--) {
	    for(boolean done = false, int j = 0; j < data.length && !done; j++) {
		int current,temp;
		if(data[i] > data[i+1]) {
		    
		}
	    }
	}

    }

  public static void main(String[] args) {
    int[] a = {};
    selectionSort(a);
    System.out.println(Arrays.toString(a));
    int[] b = {5};
    selectionSort(b);
    System.out.println(Arrays.toString(b));
    int[] c = {8,9,5,7,1,2,3,6,0,4};
    selectionSort(c);
    System.out.println(Arrays.toString(c));
    int[] d = {21,23,49,21,43,5932,20,89};
    selectionSort(d);
    System.out.println(Arrays.toString(d));
  }

}
