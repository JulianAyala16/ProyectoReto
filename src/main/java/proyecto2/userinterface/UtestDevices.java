package proyecto2.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class UtestDevices extends PageObject {

    public static final Target CLICK_COMP = Target.the("Click on Your computer").located(By.xpath("//div[@class='ui-select-box']"));
    public static final Target INPUT_COMP = Target.the("Set your computer").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target CLICK_VERSION = Target.the("Click on VERSION").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div"));
    public static final Target INPUT_VERSION = Target.the("Set your version").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target CLICK_LANG = Target.the("Click on LANGUAGE").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div"));
    public static final Target INPUT_LANG = Target.the("Set your language").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target CLICK_MOBILE = Target.the("Click on Mobile").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div"));
    public static final Target INPUT_MOBILE = Target.the("Set your Mobile").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target CLICK_MODEL = Target.the("Click on MODEL").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div"));
    public static final Target INPUT_MODEL = Target.the("Set your Model").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target CLICK_OS = Target.the("Click on OS").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div"));
    public static final Target INPUT_OS = Target.the("Set your OS").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target NEXT_BUTTON3 = Target.the("Click on Next").located(By.xpath("//a[@class='btn btn-blue pull-right']//span[contains(text(),'Next: Last Step')]"));

}
