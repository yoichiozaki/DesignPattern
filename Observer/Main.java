public class Main {
	public static void main(String[] args) {
		NumberGenerator generator = new RandomNumberGenerator();
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphObserver();
		genrator.addObserver(observer1);
		genetaor.addObserver(observer2);
		genetaor.execute();
	}
}