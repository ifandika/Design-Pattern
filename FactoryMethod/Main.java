
public class Main {
	
	public static void main(String[] args) {
		
		VehicleFactory vf = new VehicleFactory();
		Vehicle airplane = vf.createVehicle("AIRPLANE");
		airplane.myVehicle();
	}
}