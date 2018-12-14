// 機能のクラス階層の最上位

public class Display {
	private DisplayImpl impl;
	public Display(DisplayImpl impl) {
		this.impl = impl;
	}
	public void open() {
		impl.rawOpen();
	}
	public void print() {
		impl.rawOpen();
	}
	public void close() {
		impl.rawClose();
	}
	public final void display() {
		open();
		print();
		close();
	}
}