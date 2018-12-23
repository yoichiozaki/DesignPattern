import game.Memento;
import game.Gamer;

public class Main {
	public static void main(String[] args) {
		Gamer gamer = new Gamer(100);
		Memento memento = gamer.createMemento(); // 最初の状態を保存
		for (int i = 0; i < 100; i++) {
			System.out.println("=== " + i);
			System.out.println("現状: " + gamer);
			gamer.bet();
			System.out.println("所持金は" + gamer.getMoney() + "円になりました");
			if (gamer.getMoney() > memento.getMoney()) {
				System.out.println("所持金がだいぶ増えたので、現在の状態を保存しておこう");
				memento = gamer.createMemento();
			} else if (gamer.getMoney() < memento.getMoney()/2) {
				System.out.println("所持金がだいぶ減ったので以前の状態に復帰しよう");
				gamer.restoreMemento(memento);
			}
		}
		try {
			Tread.sleep(100);
		} catch (InterruptedException e) {
		}
		System.out.println("");
	}
}