package pagemaker;

import java.io.FileInputStream;
import java.io.IOExeption;
import java.util.Properties;

public class Database {
	private Database() {} // You must not create a Database instance with its constructor.
	public static Properties getProperties(String dbname) {
		String filename = dbname + ".txt"
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(filename));
		} catch (IOExeption, e) {
			System.out.println("Waring: " + filename + " is not found.");
		}
		return prop;
	}
}