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
	return _zip + _checkDigit + "   " + toCode(_zip + _checkDigit);
    }
    
    public int compareTo(Barcode other){
	return (this.total).compareTo(other.total);
    }

    public static String toCode(String zip) {
	String barcode = "";
	String code = _zip + _checkDigit;
	for(int i = 0; i < 6; i++){
	    switch(code.charAt(i)) {
	    case '0': barcode += "||:::";
		break;
	    case '1': barcode += ":::||";
		break;
	    case '2': barcode += "::|:|";
		break;
	    case '3': barcode += "::||:";
		break;
	    case '4': barcode += ":|::|";
		break;
	    case '5': barcode += ":|:|:";
		break;
	    case '6': barcode += ":||::";
		break;
	    case '7': barcode += "|:::|";
		break;
	    case '8': barcode += "|::|:";
		break;
	    case '9': barcode += "|:|::";
		break;
	    }
	}
	return "|" + barcode + "|";
    }

    public static String toZip(String code) {
	if(code.length() != 32) {
	    throw new IllegalArgumentException();
	}
	if(code.charAt(0) != '|' || code.charAt(31) != '|') {
	    throw new IllegalArgumentException();
	}
	
    }
}
