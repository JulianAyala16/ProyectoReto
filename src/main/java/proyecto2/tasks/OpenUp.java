package proyecto2.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import proyecto2.userinterface.Utest;

public class OpenUp implements Task {
    private Utest utest;
    public static OpenUp thePage() { return Tasks.instrumented(OpenUp.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(utest));

    }
}
