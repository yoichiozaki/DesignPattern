import java.util.Iterator;

public class ListVisitor extends Visitor {
	private String currentDir = "";
	public void visit(File file) { // visit()とaccept()は再帰的に呼び出しあう関係にある
		System.out.println(currentDir + "/" + file);
	}
	public void visit(Directory directory) {
		System.out.println(currentDir + "/" + directory);
		String saveDir = currentDir;
		currentDir = currentDir + "/" + directory.getName();
		Iterator it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry)it.next();
			entry.accept(this); // visit()とaccept()は再帰的に呼び出しあう関係にある
		}
		currentDir = saveDir;
	}
}