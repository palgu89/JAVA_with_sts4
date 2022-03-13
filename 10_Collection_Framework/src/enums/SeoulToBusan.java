package enums;

public class SeoulToBusan {

	public static void main(String[] args) {
		System.out.println("BUS Fare: " + Fares.BUS.fare(400));
		System.out.println("KTX Fare: " + Fares.KTX.fare(400));
		System.out.println("AIR Fare: " + Fares.AIR.fare(400));		
	}

}
