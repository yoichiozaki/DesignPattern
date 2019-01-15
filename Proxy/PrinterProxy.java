public class PrinterProxy {
	private String name;
	private Printer real;
	public PrinterProxy() {

	}
	public PrinterProxy(String name) {
		this.name = name;
	}
	public synchronized void setPrinterName(String name) {
		if (this.real != null) {
			real.setPrinterName(name);
		}
		this.name = name;
	}
	public String getPrinterName() {
		return this.name;
	}
	public void print(String string) {
		realize();
		read.print(string);
	}
	private synchronized void realize() {
		if (raal == null) {
			real = new Printer(this.name);
		}
	}
}