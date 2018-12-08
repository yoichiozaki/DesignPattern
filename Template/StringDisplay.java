public class StringDisplay extends AbstractDisplay {
	private String string;
	private int width;

	// コンストラクタ
	public StringDisplay(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}

	// 処理内容を詰めましょう。
	public void open() {
		printLine();
	}
	public void print() {
		System.out.println("|" + string + "|");
	}
	public void close() {
		printLine();
	}

	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}