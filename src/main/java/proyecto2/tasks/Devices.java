package proyecto2.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import proyecto2.userinterface.UtestAddress;
import proyecto2.userinterface.UtestDevices;

public class Devices implements Task {

    private String strCOMP;
    private String strVERSION;
    private String strLANG;
    private String strMOBILE;
    private String strMODEL;
    private String strOS;

    public Devices(String strCOMP, String strVERSION, String strLANG, String strMOBILE, String strMODEL, String strOS) {
        this.strCOMP = strCOMP;
        this.strVERSION = strVERSION;
        this.strLANG = strLANG;
        this.strMOBILE = strMOBILE;
        this.strMODEL = strMODEL;
        this.strOS = strOS;
    }

    public static Devices the(String strCOMP, String strVERSION, String strLANG, String strMOBILE, String strMODEL, String strOS) {
        return Tasks.instrumented(Devices.class,strCOMP,strVERSION,strLANG,strMOBILE,strMODEL,strOS);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestDevices.CLICK_COMP),
                Enter.theValue(strCOMP).into(UtestDevices.INPUT_COMP).thenHit(Keys.ENTER),
                Click.on(UtestDevices.CLICK_VERSION),
                Enter.theValue(strVERSION).into(UtestDevices.INPUT_VERSION).thenHit(Keys.ENTER),
                Click.on(UtestDevices.CLICK_LANG),
                Enter.theValue(strLANG).into(UtestDevices.INPUT_LANG).thenHit(Keys.ENTER),
                Click.on(UtestDevices.CLICK_MOBILE),
                Enter.theValue(strMOBILE).into(UtestDevices.INPUT_MOBILE).thenHit(Keys.ENTER),
                Click.on(UtestDevices.CLICK_MODEL),
                Enter.theValue(strMODEL).into(UtestDevices.INPUT_MODEL).thenHit(Keys.ENTER),
                Click.on(UtestDevices.CLICK_OS),
                Enter.theValue(strOS).into(UtestDevices.INPUT_OS).thenHit(Keys.ENTER),

                Click.on(UtestDevices.NEXT_BUTTON3));

    }
}
