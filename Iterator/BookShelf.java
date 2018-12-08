// Bookの集合であるBookShelfはAggregateインタフェースを満たす。
// つまり、BookShelfは、その要素であるBookクラスのオブジェクトを一つずつ返す
// Iteratorインタフェースを満たすiteratorを持っている

public class BookShelf implements Aggregate {
	private Book[] books;
	private int last = 0;

	// コンストラクタ
	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}

	public Book getBookAt(int index) {
		return this.books[index];
	}

	public void appendBook(Book book) {
		this.books[last] = book;
		last++;
	}

	public int getLength() {
		return this.last;
	}

	// Aggregateインタフェースを実装している部分
	// ここさえあれば、たとえ他の部分の実装がどのように変わろうとも、
	// 「一つずつ順番に取り出して処理する」と言う処理が回せる。
	public Iterator createIterator() {
		return new BookShelfIterator(this);
	}
}