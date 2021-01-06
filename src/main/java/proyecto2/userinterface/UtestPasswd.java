package proyecto2.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestPasswd extends PageObject {
    public static final Target INPUT_PASSWD = Target.the("Set your password").located(By.id("password"));
    public static final Target INPUT_CONFPASS = Target.the("Confirm your password").located(By.id("confirmPassword"));
    public static final Target CLICK_BOX0 = Target.the("Click on the box 0").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CLICK_BOX1 = Target.the("Click on the box 1").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CLICK_BOX2 = Target.the("Click on the box 2").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target CLICK_COMPLETE = Target.the("click to finish").located(By.xpath("//a[@class='btn btn-blue']//span[contains(text(),'Complete Setup')]"));
}
