// DisplayImplの具体的な実装の一つを表すクラス

public class StringDisplayImpl extends DisplayImpl {
	private String string;
	private int width;
	public StringDisplayImpl(String string) {
		this.string = string;
	}
	public void rawOpen() {
		printLine();
	}
	public void rawPrint() {
		System.out.println("|" + string + "|");
	}
	public void rawClose() {
		printLine();
	}
	private void printLine() {
		System.out.println("+");
		for (int i = 0; i < this.width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}