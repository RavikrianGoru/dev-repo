package javahungry;
import java.net.URL;
import java.net.URLConnection;

public class TestNetConnetion {

	public static void main(String[] args) {

		try {
			URL url = new URL("http://www.google.com");
			URLConnection connection = url.openConnection();
			connection.connect();
			System.out.println("Net is connected.");
		} catch (Exception e) {
			System.out.println("no net connection");
		}
		

		try {
			Process process = Runtime.getRuntime().exec("ping www.google.com");
			if(process.waitFor()==0)
			System.out.println("Net is connected");
			else
				throw new Exception("No netr connection");
		} catch (Exception e) {
			System.out.println("no net connection");
		}
	}

}
