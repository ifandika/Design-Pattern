
public class Melon {
	int num = 0;
	private static Melon melon;
	
	private Melon() {}
	
	public static Melon getInstance() {
		if(melon == null) {
			melon = new Melon();
		}
		return melon;
	}
	
} 