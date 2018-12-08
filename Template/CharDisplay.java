public class CharDisplay extends AbstractDisplay {
	private char ch;

	// コンストラクタ
	public CharDisplay(char ch) {
		this.ch = ch;
	}

	// 処理の中身を詰めましょう。
	public void open() {
		System.out.print("<<");
	}
	public void print() {
		System.out.print(this.ch);
	}
	public void close() {
		System.out.println(">>");
	}
}