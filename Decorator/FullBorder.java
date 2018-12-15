// 皮をかぶせてできたものの具象クラスその2

public class FullBorder extends Border {
	public FullBorder(Display display) {
		super(display);
	}
	public int getColumns() {
		return 1 + display.getColumns() + 1;
	}
	public int getRows() {
		return display.getRows();
	}
	public String getRowText(int row) {
		if (row == 0) {
			return "+" + makeLine('-', display.getColumns()) + "+";
		} else if (row == display.getColumns() + 1) {
			return "+" + makeLine('-', display.getColumns()) + "+";
		} else {
			return "|" + display.getRowText(row-1) + "|";
		}
	}
	private String makeLine(char ch, int count) {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < count; i++) {
			buf.append(ch);
		}
		return buf.toString();
	}
}