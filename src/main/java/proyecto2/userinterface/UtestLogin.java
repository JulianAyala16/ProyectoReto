package proyecto2.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLogin extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form").located(By.xpath("//ul[@class='nav navbar-nav']//a[contains(text(),'Join Today')]"));
    public static final Target INPUT_FNAME = Target.the("field for first name").located(By.id("firstName"));
    public static final Target INPUT_LNAME = Target.the("field for last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("field for Email Addres").located(By.id("email"));
    public static final Target MONTH_BUTTON = Target.the("Click on MONTH").located(By.xpath("//div[@class='col-xs-5 col-md-5 col-lg-5 months']"));
    public static final Target INPUT_MONTH = Target.the("Field for Date: Month").located(By.xpath("//option[@value='number:9']"));
    public static final Target DAY_BUTTON = Target.the("Click on DAY").located(By.xpath("//div[@class='col-xs-3 col-md-3 col-lg-3 days']"));
    public static final Target INPUT_DAY = Target.the("field for date: day").located(By.xpath("//option[@value='number:16']"));
    public static final Target YEAR_BUTTON = Target.the("Click on YEAR").located(By.xpath("//div[@class='col-xs-4 col-md-4 col-lg-4 years']"));
    public static final Target INPUT_YEAR = Target.the("field for date: year").located(By.xpath("//option[@value='number:1994']"));
    public static final Target NEXT_BUTTON = Target.the("Click on Next").located(By.xpath("//a[@class='btn btn-blue']//span[contains(text(),'Next: Location')]"));
}
