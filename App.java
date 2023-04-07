package week5Homework;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Asterisk Log:");
		
		Logger logger1 = new AsteriskLogger();
		logger1.Log("Hello");
		
		System.out.println("Asterisk Error:");
		
		Logger logger2 = new AsteriskLogger();
		logger2.Error("Hello");
		
		System.out.println("Spaced Log:");
		
		Logger logger3 = new SpacedLogger();
		logger3.Log("Hello");
		
		System.out.println("Spaced Error:");
		
		Logger logger4 = new SpacedLogger();
		logger4.Error("Hello");
		
	}

}
