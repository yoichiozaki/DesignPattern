import java.io.*;

public class HTMLBuilder extends Builder {
	private String filename;
	private PrintWriter writer;
	public void makeTitle(String title) {
		filename = title + ".html";
		try {
			this.writer = new PrintWriter(new FileWriter(filename));
		} catch(IOException e) {
			e.printStackTrace();
		}
		this.writer.println("<html><head><title>" + title + "</title></head><body>");
		this.writer.println("<h1>" + title + "</h1>");
	}
	public void makeString(String str) {
		this.writer.println("<p>" + str + "</p>");
	}
	public void makeItems(String[] items) {
		this.writer.println("<ul>");
		for (int i = 0; i < items.length; i++) {
			this.writer.println("<li>" + items[i] + "</li>");
		}
		this.writer.println("</ul>");
	}
	public void close() {
		this.writer.println("</body></html>");
		this.writer.close();
	}
	public String getResult() {
		return filename;
	}
}