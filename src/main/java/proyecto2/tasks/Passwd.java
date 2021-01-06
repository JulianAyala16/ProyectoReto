package proyecto2.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import proyecto2.userinterface.UtestPasswd;

public class Passwd implements Task {

    private String strPASSWD;
    private String strCONFPASS;

    public Passwd(String strPASSWD, String strCONFPASS) {
        this.strPASSWD = strPASSWD;
        this.strCONFPASS = strCONFPASS;
    }

    public static Passwd the(String strPASSWD, String strCONFPASS) {
        return Tasks.instrumented(Passwd.class,strPASSWD,strCONFPASS);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strPASSWD).into(UtestPasswd.INPUT_PASSWD),
                        Enter.theValue(strCONFPASS).into(UtestPasswd.INPUT_CONFPASS),
                        Click.on(UtestPasswd.CLICK_BOX0),
                        Click.on(UtestPasswd.CLICK_BOX1),
                        Click.on(UtestPasswd.CLICK_BOX2),
                        Click.on(UtestPasswd.CLICK_COMPLETE));

    }
}
