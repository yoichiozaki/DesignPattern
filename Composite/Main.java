public class Main {
	public static void main(String[] args) {
		try {
			Ssytem.out.println("Making root entries...");
			Directory rootDir = new Directory("root");
			Directory binDir = new Directory("bin");
			Directory tmpDir = new Directory("tmp");
			Directory usrDir = new Directory("usr");
			rootDir.add(binDir);
			rootDir.add(tmpDir);
			rootDir.add(usrDir);
			binDir.add(new File("vi", 10000));
			binDir.add(new File("latex", 20000));
			rootDir.printList();

			System.out.println("");
			System.out.println("Making user entries...");
			Directory zak = new Directory("zak");
			Directory taro = new Directory("taro");
			usrDir.add(zak);
			usrDir.add(taro);
			zak.add(new File("diary.html", 100));
			zak.add(new File("composite.java", 200));
			taro.add(new File("memo.txt", 100));
			taro.add(new File("game.exe", 500));
			rootDir.printList();
		} catch (FileTreatmentException e) {
			e.printStackTrace();
		}
	}
}