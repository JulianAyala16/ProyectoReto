package proyecto2.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import proyecto2.userinterface.UtestLogin;

public class Login implements Task {
    private String strFNAME;
    private String strLNAME;
    private String strEMAIL;
    private String strMONTH;
    private String strDAY;
    private String strYEAR;

    public Login(String strFNAME, String strLNAME, String strEMAIL, String strMONTH, String strDAY, String strYEAR) {
        this.strFNAME = strFNAME;
        this.strLNAME = strLNAME;
        this.strEMAIL = strEMAIL;
        this.strMONTH = strMONTH;
        this.strDAY = strDAY;
        this.strYEAR = strYEAR;
    }

    public static Login onThePage( String strFNAME, String strLNAME, String strEMAIL, String strMONTH, String strDAY, String strYEAR) {
        return Tasks.instrumented(Login.class,strFNAME,strLNAME,strEMAIL,strMONTH,strDAY,strYEAR);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestLogin.LOGIN_BUTTON),
                Enter.theValue(strFNAME).into(UtestLogin.INPUT_FNAME),
                Enter.theValue(strLNAME).into(UtestLogin.INPUT_LNAME),
                Enter.theValue(strEMAIL).into(UtestLogin.INPUT_EMAIL),
                Click.on(UtestLogin.MONTH_BUTTON),
                Click.on(UtestLogin.INPUT_MONTH),
                Click.on(UtestLogin.DAY_BUTTON),
                Click.on(UtestLogin.INPUT_DAY),
                Click.on(UtestLogin.YEAR_BUTTON),
                Click.on(UtestLogin.INPUT_YEAR),
                Click.on(UtestLogin.NEXT_BUTTON)
        );

    }
}
