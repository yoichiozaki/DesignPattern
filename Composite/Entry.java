public abstract class Entry {
	public abstract String getName();
	public abstract int getSize();
	// addをどこでどのように定義するかはいくつか方法が考えられる
	public Entry add(Entry entry) throws FileTreatmentException {
		throw new FileTreatmentException();
	}
	public void printList() {
		printList("");
	}
	protected abstract void printList(String prefix);
	public String toString() {
		return getName() + " (" + getSize() + ")";
	}
}