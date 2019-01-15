public class Printer implements Printable {
	private String name;
	public Printer() {
		heavyJob("Creating Printer Instance...");
	}
	public Printer(String name) {
		this.name = name;
		heavyJob("Creating Printer Instance whose name is " + name + " ...");
	}
	public void setPrinterName(String name) {
		this.name = name;
	}
	public String getPrinterName() {
		return this.name;
	}
	public void print(String string) {
		System.out.println("+++++++++" + " name " + "+++++++++");
		System.out.println(string);
	}
	private void heavyJob(String message) {
		System.out.print(message);
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
			System.out.print("!");
		}
		System.out.println("Completed");
	}
}