
public class Main {
	
	public static void main(String[] args) {
		
		// Maka bisa buat rumah dengan fitur yang berbeda
		HouseBuilder house1 = new HouseBuilder();
		house1.buildWindow();
		house1.buildRoom();
		
		HouseBuilder house2 = new HouseBuilder();
		house2.buildWindow();
		house2.buildDoor();
		house2.buildGarage();
		
		ModernHouseBuilder modernHouse1 = new ModernHouseBuilder();
		modernHouse1.buildCCTV();
		
		ModernHouseBuilder modernHouse2 = new ModernHouseBuilder();
		modernHouse2.buildAutomaticGarage();
		
		...
		
	}
}