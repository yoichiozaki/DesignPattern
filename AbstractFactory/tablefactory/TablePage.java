package tablefactory;
import facotry.*;
import java.util.Iterator;

public class TablePage extends Page {
	public TablePage(String title, String author) {
		super(title, author);
	}
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><head><title>" + this.title + "</title></head>\n");
		buffer.append("<body>\n");
		buffer.append("<hl>" + title + "</hl>\n");
		buffer.append("<table width=\"80%\" border=\"3\">\n");
		Iterator it = content.iterator();
		while (it.hasNext()) {
			Item item = (Item)it.next();
			buffer.append("<tr>" + item.makeHTML() + "</tr>"); // ここでitemが何クラスであるかを調べる必要はない
		}
		buffer.append("</table>\n");
		buffer.append("<hr><Address>" + this.author + "</address");
		buffer.append("</body></html>\n");
		return buffer.toString();
	}
}