public abstract class Support {
	private String name;
	private Support next;
	public Support(String name) {
		this.name = name;
	}
	public Support setNext(Support next) {
		this.next = next;
		return next;
	}
	public final void support(Trouble trouble) {
		if (resolve(trouble)) {
			done(trouble);
		} else if (this.next != null) {
			this.next.support(trouble);
		} else {
			fail(trouble);
		}
	}
	public String toString() {
		return "[" + this.name + "]";
	}
	protected abstract boolean resolve(Trouble trouble);
	protected void done(Trouble trouble) {
		System.out.println(trouble + " is resolved by " + this + ".");
	}
	protected void fail(Trouble trouble) {
		System.out.println(trouble + " can not be resolved.");
	}
}