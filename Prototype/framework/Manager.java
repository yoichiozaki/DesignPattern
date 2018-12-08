package framework;
import java.util.*;

public class Manager {
	private HashMap showcase = new HashMap();
	public void register(String name, Product proto) {
		this.showcase.put(name, proto);
	}
	public Product create(String protoname) {
		Product p = (Product)showcase.get(protoname);
		return p.createClone();
	}
}