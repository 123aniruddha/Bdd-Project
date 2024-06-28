package BaseLayer;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Properties p;

	public BaseClass() {
		p = new Properties();
		try {
			FileInputStream f = new FileInputStream("./src/main/java/ConfigueLayer/Config.Properties");
			p.load(f);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void initialization() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get(p.getProperty("url"));

	}

	public static void closeBrowser() throws IOException {
		driver.quit();
	}
}
