public class Tempy {

    public static double CtoF(double celcius) { //This is how Masha thinks celsius is spelled
	return celcius * 1.8 + 32;
    }

    public static double FtoC(double fahrenheit) {
	return (fahrenheit - 32)/1.8;
    }

    public static void main(String[] args) {
	System.out.println(CtoF(-40));
	System.out.println(CtoF(100));
	System.out.println(FtoC(212));
    }
}




























































