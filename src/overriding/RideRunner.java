package overriding;

public class RideRunner extends Ride1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RideRunner ride = new RideRunner();
		ride.div();
		ride.mul();
		ride.sum();

		Ride ride1 = new Ride();
		ride1.div();
		ride1.mul();
		ride1.sum();

	}

}
