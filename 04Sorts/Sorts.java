import java.util.*;
public class Sorts{

  public static String name(){
    return "10.Tao.JT"; 
  }

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
	    int relmin = j;
	    for(int place = i; place >= 0; place--) {
		if(current < data[place]) {
		    relmin = place;
		    data[place + 1] = data[place];
		}
	    }
	    data[relmin] = current;
	}
    }

    public static void bubbleSort(int[] data) {
	boolean done = false;
	for (int times = 0; times < data.length && !done ; times++) {
	    int swaps = 0;
	    for (int current = 0; current < data.length-times-1; current++) {
		if (data[current] > data[current + 1]){
		    int temp = data[current + 1];
		    data[current + 1] = data[current];
		    data[current] = temp;
		    swaps++;
		}
	    }
	    if (swaps == 0){
		done = true;
	    }
	}

    
    }


  public static void main(String[] args) {
    int[] a = {};
    bubbleSort(a);
    System.out.println(Arrays.toString(a));
    int[] b = {5};
    bubbleSort(b);
    System.out.println(Arrays.toString(b));
    int[] c = {8,5,9};
    bubbleSort(c);
    System.out.println(Arrays.toString(c));
    int[] d = {21,23,49,21,43,5932};
    bubbleSort(d);
    System.out.println(Arrays.toString(d));
  }

}
