public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;
    private String total;

// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public Barcode(String zip) {
      if(zip.length() == 5) {
	  this._zip = zip;
      } else {
	  throw new IllegalArgumentException();
      }

      try {
	  _checkDigit = checkDigit();
      } catch(NumberFormatException e) {
	  throw new IllegalArgumentException();
      }

      total = _zip + _checkDigit;
  }

    private int checkDigit() {
	int sum = 0;
	for(int i = 0; i < 5; i++) {
	    sum += Integer.parseInt(""+_zip.charAt(i));
	}
	return sum%10;
    }


// postcondition: Creates a copy of a bar code.
   public Barcode clone(){
       Barcode a = new Barcode(this._zip);
       return a;
   }


// postcondition: computes and returns the check sum for _zip
    private int checkSum(){
	return 0;
    }

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	String barcode = "";
	String numbers = _zip + _checkDigit;
		for(int i = 0; i < 6; i++){
	    if(numbers.charAt(i)=='1'){
		barcode += ":::||" ;
	    }else if(numbers.charAt(i)=='2'){
		barcode += "::|:|" ;
	    }else if(numbers.charAt(i)=='3'){
		barcode += "::||:" ;
	    }else if(numbers.charAt(i)=='4'){
		barcode += ":|::|" ;
	    }else if(numbers.charAt(i)=='5'){
		barcode += ":|:|:" ;
	    }else if(numbers.charAt(i)=='6'){
		barcode += ":||::" ;
	    }else if(numbers.charAt(i)=='7'){
		barcode += "|:::|" ;
	    }else if(numbers.charAt(i)=='8'){
		barcode += "|::|:" ;
	    }else if(numbers.charAt(i)=='9'){
		barcode += "|:|::" ;
	    }else if(numbers.charAt(i)=='0'){
		barcode += "||:::" ;
	    }
	}
	return numbers + "  |" + barcode + "|";
	
    }


// postcondition: compares the zip + checkdigit, in numerical order. 
    public int compareTo(Barcode other){
	return (this.total).compareTo(other.total);
    }
    
}
