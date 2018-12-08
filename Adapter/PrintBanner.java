public class PrintBanner extends Banner implements Print {
	// コンストラクタ
	public PrintBanner(String string) {
		super(string);
	}

	// Printインタフェースを満たしている部分
	// 今回はメソッド名を変えたいだけだったので親クラスのものをそのまま呼べば良い。
	public void printWeak() {
		showWithParen();
	}
	public void printStrong() {
		showWithAster();
	}
}