public class Main {
	public static void main(String[] argv) {
		System.out.println("Start.");
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		if (obj1 == obj2) {
			System.out.println("obj1 and obj2 are the same instanece.");
		} else {
			System.out.println("obj1 and obj2 are NOT the same instanece.");
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ": " + TicketMaker.getInstance().getNextTicketNumber());
		}
		System.out.println("End.");
	}
}