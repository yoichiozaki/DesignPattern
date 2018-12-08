// 製品の製造方法を規定している

package framework;

public abstract class Factory {
	// Productを生成する際には、ただ生成するだけではなくて
	// registerProductしてからでないといけない
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product product);
}