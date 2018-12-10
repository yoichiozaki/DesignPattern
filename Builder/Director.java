public class Director {
	private Builder builder;

	// コンストラクタ
	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct() {
		this.builder.makeTitle("Greeting");
		this.builder.makeString("朝から昼にかけて");
		this.builder.makeItems(new String[]{"おはようございます", "こんにちは"});
		this.builder.makeString("夜に");
		this.builder.makeItems(new String[]{"こんばんは", "おやすみなさい", "さようなら"});
		this.builder.close();
	}
}