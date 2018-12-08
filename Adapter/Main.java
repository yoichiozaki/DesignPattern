public class Main {
	public static void main(String[] args) {

		// 「欲しかったのはPrintインタフェースを満たしているオブジェクトである」
		// と言うことを強調している。
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
}