package tablefactory;
import facotry.*;

public class TableLink extends Link {
	public TableLink(String caption, String url) {
		super(caption, url);
	}
	public String makeHTML() {
		return " <td><a href=\"" + this.url + "\">" + this.caption + "</a></td>\n";
	}
}