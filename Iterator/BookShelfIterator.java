// Iteratorインタフェースを満たすiteratorの具体的な実装を示したBookShelfIteratorクラス。
// Iteratorは概念であって、BookShelf用のiteratorはBookShelfIteratorに沿って与えられる。

public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;
	private int index;

	// コンストラクタ
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	// Iteratorインタフェースを実装している部分
	public boolean hasNext() {
		if (this.index < this.bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}
	public Object next() {
		Book book = this.bookShelf.getBookAt(index);
		this.index++;
		return book;
	}
}