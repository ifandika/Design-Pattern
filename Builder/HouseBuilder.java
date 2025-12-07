
public class HouseBuilder implements Builder {
	// Anggap semua class ada
	private Window window;
	private Door doors;
	private Room rooms;
	private Garage garage;
	
	public HouseBuilder() {	}
	
	@Override
	public void reset() {
		// Reset semua objek menjadi null
	}
	
	// Cek setiap objek jika null maka buat objek, tidak null tidak perlu
	public void buildWindow() {
		window = new Window();
	}
	
	public void buildDoor() {
		doors = new Door();
	}
	
	public void buildRoom() {
		room = new Room();
	}
	
	public void buildGarage() {
		garage = new Garage();
	}
	
	...
}