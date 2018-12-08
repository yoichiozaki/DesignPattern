import framework.*;

public class Main {
	public static void main(String[] argv) {
		Manager manager = new Manager();
		UnderlinePen upen = new UnderlinePen('~');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');
		manager.register("strong message", upen);
		manager.register("warning box", mbox);
		manager.register("slash box", sbox);

		// managerに登録されているインスタンスをそのままコピーして使ってみる。
		Product p1 = manager.create("strong message"); // newしていない点に注意！
		p1.use("Hello World!");
		Product p2 = manager.create("warning box");
		p2.use("Hello World!");
		Product p3 = manager.create("slash box");
		p3.use("Hello World!");
	}
}