import java.util.Enumeration;
import java.util.ResourceBundle;

public class Test {
	
	private static String tentative;
	private static String cases;
	
	public Test() {
		
		ResourceBundle titres =ResourceBundle.getBundle("Titre");
		tentative = (titres.getString("tentative"));
		cases =(titres.getString("cases"));
	
		
	}

	public static void main(String[] args) {
	
		TestInt tes = new TestInt();

	}



}
