// 皮をかぶせてできたものの抽象クラス

public abstract class Border extends Display {
	protected Display display; // 皮をかぶせられる中身
	protected Border(Display display) {
		this.display = display;
	}
}