package proyecto2.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import proyecto2.userinterface.UtestAddress;

public class Addres implements Task {

    private String strCITY;
    private String strZIP;
    private String strCOUNTRY;

    public Addres(String strCITY, String strZIP, String strCOUNTRY) {
        this.strCITY = strCITY;
        this.strZIP = strZIP;
        this.strCOUNTRY = strCOUNTRY;
    }

    public static Addres the(String strCITY, String strZIP, String strCOUNTRY) {
        return Tasks.instrumented(Addres.class,strCITY,strZIP,strCOUNTRY);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                        //Codigo para rellenar campos del addres
                        //Enter.theValue(strCITY).into(UtestAddress.INPUT_CITY).thenHit(Keys.ARROW_DOWN).thenHit(Keys.ENTER),
                        //Enter.theValue(strZIP).into(UtestAddress.INPUT_ZIP),
                        //Click.on(UtestAddress.CLICK_COUNTRY),
                        //Enter.theValue(strCOUNTRY).into(UtestAddress.INPUT_COUNTRY),
                        Click.on(UtestAddress.NEXT_BUTTON2)
        );
    }
}
