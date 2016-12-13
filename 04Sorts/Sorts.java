public class Sorts{
  /**EDIT THIS METHOD TO MATCH YOUR NAME 
  */
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

    public static void main(String[] args) {
	int[] data = new int[2];
	data[0] = 64;
	data[1] = 10;
        for(int i = 0; i < data.length; i++) {
	    System.out.println(data[i]);
	}
	selectionSort(data);
	for(int i = 0; i < data.length; i++) {
	    System.out.println(data[i]);
	}
    }

}
