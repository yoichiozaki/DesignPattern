public class Singleton {
	// クラスのstatic変数としてSingletonオブジェクトを保持する。
	// こうすることでSingletonクラスのロード時に一度だけSingletonオブジェクトが生成されることになる。
	private static Singleton singleton = new Singleton();

	// コンストラクタ
	private Singleton() {
		System.out.println("Create an instance.");
	}

	// 唯一のインスタンスにアクセスするためにはこのメソッドを経由しないといけない。
	public static Singleton getInstance() {
		return singleton;
	}
}