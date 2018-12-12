package listfactory;
import facotry.*;
import java.util.Iterator;

public class ListTray extends Tray {
	public ListLink(String caption) {
		super(caption);
	}
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<li>\n");
		buffer.append(caption + "\n");
		buffer.append("<ul>\n");
		Iterator it = tray.iterator();
		while (it.hasNext()) {
			Item item = (Item)it.next();
			buffer.append(item.makeHTML()); // ここでitemが何クラスであるかを調べる必要はない
		}
		buffer.append("</ul>\n");
		buffer.append("<li>\n");
		return buffer.toString();
	}
}