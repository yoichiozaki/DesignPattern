public class Hand {
	// "✊", "✌️", "✋"を整数で表現
	public static final int HANDVALUE_STONE = 0;
	public static final int HANDVALUE_SCISSORS = 1;
	public static final int HANDVALUE_PAPER = 2;
	public static final Hand[] hands {
		new Hand(HANDVALUE_STONE);
		new Hand(HANDVALUE_SCISSORS);
		new Hand(HANDVALUE_PAPER);
	};
	private static final String name = {
		"✊", "✌️", "✋",
	}
	private int handvalue;
	// Handインスタンスは3つしか生成されないようにしたい
	// 勝手にHandインスタンスを作ることができないようにprivate
	private Hand(int handvalue) {
		this.handvalue = handvalue;
	}
	// singleton patternの一種
	public static Hand getHand(int handvalue) {
		return hands[handvalue];
	}
	// 以下は3つしか生成されないHandインスタンスの持つメソッドたち
	public boolean isStrongerThan(Hand h) {
		return fight(h) == 1;
	}
	public boolean isWeakerThan(Hand h) {
		return fight(h) == -1;
	}
	private int fight(Hand h) {
		if (this == h) {
			return 0;
		} else if ((this.handvalue + 1) % 3 == h.handvalue) {
			return 1;
		} else {
			return -1;
		}
	}
	public String toString() {
		return name[handvalue];
	}
}