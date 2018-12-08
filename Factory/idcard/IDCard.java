package idcard;

// 製品の仕様とその作り方をimport
import framework.*;

public class IDCard extends Product {
	private String owner;

	// コンストラクタ
	// 何も修飾子がついていないので、IDCardのコンストラクタは同一パッケージ内からしかアクセスできない。
	// つまり、idcardパッケージの外にあるMain.javaから見れば、
	// IDCardFactory.javaのcreateProduct()メソッドを呼ぶしか、IDCardのコンストラクタを呼ぶ手段がないと言うことになる。
	IDCard(String owner) {
		System.out.println(owner + "のカードを作ります。");
		this.owner = owner;
	}

	// Productの仕様を満たすべく実装している部分
	public void use() {
		System.out.println(this.owner + "のカードを使用します。");
	}

	public String getOwner() {
		return this.owner;
	}
}