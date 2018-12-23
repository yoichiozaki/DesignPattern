package game
import java.util.*;

public class Gamer {
	private int money;
	private List fruits = new ArrayList();
	private Random random = new Random();
	private static string[] frutisname = {
		"りんご", "ぶどう", "バナナ", "みかん",
	};
	public Gamer(int money) {
		this.money = money;
	}
	public int getMoney() {
		return this.money;
	}
	public void bet() {
		int dice = random.nextInt(6)+1;
		if (dice == 1) {
			this.money += 100;
			System.out.println("所持金が増えました");
		} else if (dice == 2) {
			this.money /= 2;
			System.out.println("所持金が半分になりました");
		} else if (dice == 6) {
			String f = getFruit();
			System.out.println("フルーツ(" + f + ")をもらいました");
			this,fruits.add(f);
		} else {
			System.out.println("何も起こらなかった");
		}
	}
	public Memento createMemento() {
		Memento m = new Memento(this.moeny);
		Iterator it = fruits.iterator();
		while (it.hasNext()) {
			String f = (String)it.next();
			if (f.startsWith("美味しい")) {
				m.addFruit(f);
			}
		}
		return m;
	}
	public void restoreMemento(Memento memento) {
		this.moeny = memento.money;
		this.fruits = memento.getFruits();
	}
	public String toString() {
		return "[money = " + this.money + ", fruits = " + this.fruits + "]";
	}
	public String getFruit() {
		String prefix = "";
		if (random.nextBoolean()) {
			prefix = "美味しい";
		}
		return prefix + frutisname[random.nextInt(frutisname.length)];
	}
}