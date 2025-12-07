
public class VehicleFactory {
	
	public Vehicle createVehicle(String name) {
		switch(name) {
			case "AIRPLANE":
				return new Airplane();
				break;
			default:
				// ...
		}
	}
}