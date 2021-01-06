package proyecto2.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class UtestAddress extends PageObject {
    public static final Target INPUT_CITY = Target.the("Put your City").located(By.id("city"));
    public static final Target CLICK_ZIP = Target.the("Click to select").located(By.xpath("//*[@id=\"zip\"]"));
    public static final Target INPUT_ZIP = Target.the("Put your ZIP Code").located(By.id("zip"));
    public static final Target CLICK_COUNTRY = Target.the("Click on country").located(By.xpath("//div[@class='ui-select']"));
    public static final Target INPUT_COUNTRY = Target.the("Put your Country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target NEXT_BUTTON2 = Target.the("Click on Next").located(By.xpath("//a[@class='btn btn-blue pull-right']//span[contains(text(),'Next: Devices')]"));
}
