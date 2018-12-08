// 既に提供されているクラス

public class Banner {
	private String string;

	// コンストラクタ
	public Banner(String string) {
		this.string = string;
	}
	public void showWithParen() {
		System.out.println("(" + this.string + ")");
	}
	public void showWithAster() {
		System.out.println("*" + this.string + "*");
	}
}