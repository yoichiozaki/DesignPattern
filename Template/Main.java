public class Main {
	public static void main(String[] argv) {
		// 欲しかったのは「openして5回printしてcloseするオブジェクト」であって、
		// その詳細はサブクラスで詰めようと言う話であった。
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("Hello world!");
		AbstractDisplay d3 = new StringDisplay("こんにちは！");
		d1.display();
		d2.display();
		d3.display();
	}
}