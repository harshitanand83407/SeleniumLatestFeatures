import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.URI;
import java.util.function.Predicate;

public class BasicAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:/Users/hanand/chromedriver_win32 (2)/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		//predicate, consumer
		Predicate<URI> uriPredicate =uri ->  uri.getHost().contains("httpbin.org");
		
		//((HasAuthentication)driver).register(uriPredicate,UsernameAndPassword.of("foo", "bar"));
		((HasAuthentication)driver).register(uriPredicate,UsernameAndPassword.of("foo", "bar"));
		driver.get("http://httpbin.org/basic-auth/foo/bar");
		
		   
		
	}

}
