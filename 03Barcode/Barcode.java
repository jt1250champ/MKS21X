public class Barcode implements Comparable<Barcode>{

    private String _zip;
    private int _checkDigit;

    public Barcode(String zip) {
	if(zip.length() == 5) {
	    this._zip = zip;
	} else {
	    throw new IllegalArgumentException();
	}

	try {
	    _checkDigit = checkSum(zip);
	} catch(NumberFormatException e) {
	    throw new IllegalArgumentException();
	}
    }

    private static int checkSum(String zip){
	int sum = 0;
	for(int i = 0; i < 5; i++) {
	    sum += Integer.parseInt(zip.charAt(i));
	}
	return sum%10;
    }
 
    public String toString(){
	return toCode(_zip + _checkDigit);
    }
    
    public int compareTo(Barcode other){
	return (this.total).compareTo(other.total);
    }

    public static String toCode(String zip) {
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

    public static String toZip(String code) {
	
    }
}
