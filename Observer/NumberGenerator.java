import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
	private ArrayList observers = new ArrayList();
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}
	public void deleteObserver(Observer observer) {
		this.observers.delete(observer);
	}
	public void notifyObservers() {
		Iterator it = observers.iterator()
		while (it.hasNext()) {
			Observer o = (Observer)it.next();
			o.update(this); // notify
		}
	}
	public abstract int getNumber();
	public abstract void execute();
}