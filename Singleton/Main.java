
public class Main {
	
	public static void main(String[] args) {
		
		Banana banana = new Banana();
		Banana banana1 = new Banana();
		
		banana.num = 10;
		banana1.num = 20;
		
		System.out.println(banana.num);
		// Output: 10, karena dua objek yg berbeda.
		
		Melon melon = Melon.getInstance();
		Melon melon1 = Melon.getInstance();
		
		melon.num = 10;
		melon1.num = 30;
		
		System.out.println(melon.num);
		// Output: 30, karena 1 objek yg sama
	}
} 