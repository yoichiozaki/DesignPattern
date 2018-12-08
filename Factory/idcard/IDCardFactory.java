package idcard;

// 製品の仕様とその作り方をimport
import framework.*;

import java.util.*;

public class IDCardFactory extends Factory {
	private List owners = new ArrayList();

	// Factoryで規定されているProduct生成手順を満たすべく実装している
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}
	public List getOwners() {
		return this.owners;
	}
}