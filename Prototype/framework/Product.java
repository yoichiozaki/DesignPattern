package framework;

// ProductはCloneableで、かつuse()、createClone()メソッドを実装していることが必要であると要求している。
public interface Product extends Cloneable {
	public abstract void use(String s);
	public abstract Product createClone();
}