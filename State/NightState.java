public class NightState implements State {
	private static DayState singleton = new NightState();
	private NightState() {}
	public static State getInstance() {
		return singleton;
	}
	public void doClock(Context context, int hour) {
		if (9 <= hour && hour < 17) {
			context.changeState(DayState.getInstance());
		}
	}
	public void doUse(Context context) {
		context.recordLog("非常事態発生：夜間の金庫使用@夜間");
	}
	public void doAlarm(Context context) {
		context.callSecurityCenter("非常ベル@夜間");
	}
	public void doPhone(Context context) {
		context.callSecurityCenter("通常の通話@夜間");
	}
	public String toString() {
		return "@夜間";
	}
}