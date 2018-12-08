// 何らかの集合体に対して、その要素を一つずつ返すオブジェクトであるiteratorはIteratorインタフェースを満たす。
// つまり、hasNext()とnext()メソッドを持っている。

public interface Iterator {
	public abstract boolean hasNext();
	public abstract Object next();
}