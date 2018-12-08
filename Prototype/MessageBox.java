import framework.*;

public class MessageBox implements Product {
	private char decochar;

	// コンストラクタ
	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	// Productインタフェースを満たすべく実装している
	public void use(String s) {
		int length = s.getBytes().length;
		for (int i = 0; i < length + 4; i++) {
			System.out.print(this.decochar);
		}
		System.out.println("");
		System.out.println(this.decochar + " " + s + " " + this.decochar);
		for (int i = 0; i < length + 4; i++) {
			System.out.print(this.decochar);
		}
		System.out.println("");
	}
	public Product createClone() {
		Product p = null;
		try {
			p = (Product)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}