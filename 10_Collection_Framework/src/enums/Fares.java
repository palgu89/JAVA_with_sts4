package enums;

public enum Fares {
	BUS(100) {
		int fare(int dist) {
			return dist * BASE_FARE;
		}
	},
	KTX(150) {
		int fare(int dist) {
			return dist * BASE_FARE;
		}
	},
	AIR(200) {
		int fare(int dist) {
			return dist * BASE_FARE;
		}
	};
	
	final int BASE_FARE;
	
	Fares(int baseFare) {
		BASE_FARE = baseFare;	// this 해도 되고 안해도 됨
	}
	
	public int getBaseFare() {
		return BASE_FARE;
	}
	
	abstract int fare(int dist);
}
