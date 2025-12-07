
public class ModernHouseBuilder implements Builder {
	private CCTV cctv;
	private AutomaticGarage automaticGarage;
	
	public ModernHouseBuilder() {}
	
	public void buildCCTV() {
		cctv = new CCTV();
	}
	
	public void buildAutomaticGarage() {
		automaticGarage = new AutomaticGarage();
	}
}