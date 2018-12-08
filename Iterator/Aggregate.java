// 何らかの事物の集合体はAggregateインタフェースを満たしている。
// つまり、その集合に対してその要素を一つずつ返すIterator型のオブジェクトを返すメソッドiterator()を持つ。

public interface Aggregate {
	public abstract Iterator createIterator();
}