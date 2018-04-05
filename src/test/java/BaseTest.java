import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.containers.BrowserWebDriverContainer;
import com.codeborne.selenide.WebDriverRunner;

public class BaseTest {
	
	  @Rule
	  public BrowserWebDriverContainer chrome =
	    new BrowserWebDriverContainer().withDesiredCapabilities(DesiredCapabilities.chrome());
	  
	  @Before
	  public void setUp() {
	    RemoteWebDriver driver = chrome.getWebDriver();
	    WebDriverRunner.setWebDriver(driver);
	  }

	  @After
	  public void tearDown() {
	    WebDriverRunner.closeWebDriver();
	}
}
