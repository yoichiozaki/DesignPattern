package listfactory;
import facotry.*;

public class ListLink extends Link {
	public ListLink(String caption, String url) {
		super(caption, url);
	}
	public String makeHTML() {
		return " <li><a href=\"" + this.url + "\">" + this.caption + "</a></li>\n";
	}
}