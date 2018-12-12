package factory;
import java.io.*;
import java.util.ArrayList;

public abstract class Page {
	protected String title;
	protected String author;
	protected ArrayList content = new ArrayList();
	public Page(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public void add(Item item) {
		this.content.add(item);
	}
	public void output() {
		try {
			String filename = title + ".html";
			Writer writer = new FileWriter(filename);
			writer.write(this.makeHTML());
			writer.close();
			System.out.println("made " + filename);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public abstract String makeHTML();
}