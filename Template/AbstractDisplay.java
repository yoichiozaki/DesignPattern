// やりたいことはだいたい決まっていて、「openしてprintを5回してcloseする」

public abstract class AbstractDisplay {

	// 詳細はサブクラスで詰めて欲しいと言うメソッドたち
	public abstract void open();
	public abstract void print();
	public abstract void close();

	// 大体こんなことするよと言うメソッド
	// この流れは変更して欲しくないのでfinal修飾されている
	public final void display() {
		open();							// openして
		for (int i = 0; i < 5; i++) {	// 5回printして
			print();
		}
		close();						// closeする
	}
}