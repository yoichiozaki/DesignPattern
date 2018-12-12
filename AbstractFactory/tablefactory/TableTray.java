package tablefactory;
import facotry.*;
import java.util.Iterator;

public class TableTray extends Tray {
	public TableLink(String caption) {
		super(caption);
	}
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<td>");
		buffer.append("<table width=\"100%\" border=\"1\"><tr>");
		buffer.append("<td bgcolor=\"#cccccc\" alingn=\"center\" colspan=\"" + tray.size() + "\"><b>" + this.caption + "</b></td>");
		buffer.append("</tr>\n");
		buffer.append("<tr>\n");
		Iterator it = tray.iterator();
		while (it.hasNext()) {
			Item item = (Item)it.next();
			buffer.append(item.makeHTML()); // ここでitemが何クラスであるかを調べる必要はない
		}
		buffer.append("</tr></table>\n");
		buffer.append("</td>\n");
		return buffer.toString();
	}
}