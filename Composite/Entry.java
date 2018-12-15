public abstract class Entry {
	protected Entry parent;
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
	public String getFullPath() {
		StringBuffer fullPath = new StringBuffer();
		Entry entry = this;
		do {
			fullPath.insert(0, "/" + entry.getName());
			entry = entry.parent;
		} while (entry != null);
		return fullPath.toString();
	}
}