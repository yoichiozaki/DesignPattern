package game;
import java.util.*;

public class Memento {
	int money;
	ArrayList fruits;
	public int getMoney() {
		return this.money;
	}
	Memento(int money) { // not public
		this.money = money;
		this.fruits = new ArrayList();
	}
	void addFruits(String fruit) {
		this.fruits.add(fruit);
	}
	List getFruits() {
		return (List)this.fruits.clone();
	}
}