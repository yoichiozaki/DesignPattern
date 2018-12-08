import framework.*;
import idcard.*;

public class Main {
	public static void main(String[] argv) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("hoge hoge");
		Product card2 = factory.create("huga huga");
		Product card3 = factory.create("Satoshi Nakamoto");
		card1.use();
		card2.use();
		card3.use();
	}
}