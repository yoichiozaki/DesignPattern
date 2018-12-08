// 欲しいのはBannerではなくてPrintインタフェースを満たしたもの。
// つまりprint(Weak|Strong)と言う名前のメソッドが欲しい。
// Bannerを直接書き換えればいいじゃないかと言うのはオブジェクト指向の考え方に反する。
// 出来るだけ既存のプログラムを部品として再利用しながらこれを解決したい。
// 大規模なプログラムではメソッド名を一つ変えるのも大変になってしまうと言うことを認識しておく必要がある。

public interface Print {
	public abstract void printWeak();
	public abstract void printStrong();
}