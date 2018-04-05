
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.junit.Test;
import org.openqa.selenium.By;

public class GoogleSearchTest extends BaseTest{
	
	@Test
	public void CheckGoogleSearchIsDisplayed()
	{
		open(Constants.MAIN_PAGE);
		$(By.id(("lst-ib"))).isDisplayed();
	}
}
