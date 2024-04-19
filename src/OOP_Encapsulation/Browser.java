package OOP_Encapsulation;

public class Browser {

	
	
	public void launchBrowser() {
		System.out.println("launch browser");
		checkBrowserversion();
		checkOSCompatibility();
	}
	
	private void checkBrowserversion() {
		System.out.println("launch browser version");
	}
	
	private void checkOSCompatibility() {
		System.out.println("launch browsercampatability");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
