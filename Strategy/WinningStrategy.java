import java.util.Random;

// 前回の試合で勝っているならば同じ手を次の試合でも出すという戦略
public class WinningStrategy implements Strategy {
	private Random random;
	private boolean won = false;
	private Hand prevHand;
	public WinningStrategy(int seed) {
		random = new Random(seed);
	}
	public Hand nextHand() {
		if (!won) {
			prevHand = Hand.getHand(random.nextInt(3));
		}
		return prevHand;
	}
	public void study(boolean win) {
		this.won = win;
	}
}