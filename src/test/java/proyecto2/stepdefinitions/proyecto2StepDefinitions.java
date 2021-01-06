package proyecto2.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import proyecto2.model.ProyectoData;
import proyecto2.model.ProyectoData2;
import proyecto2.model.ProyectoData3;
import proyecto2.tasks.*;

import java.util.List;

public class proyecto2StepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());

    }

    @Given("^that Julian wants to learn how can login into the page$")
    public void thatJulianWantsToLearnHowCanLoginIntoThePage(List<ProyectoData> proyectoData) throws Exception {

        OnStage.theActorCalled("Julian").wasAbleTo(OpenUp.thePage(), (Login.onThePage(proyectoData.get(0).getStrFNAME(),proyectoData.get(0).getStrLNAME(),proyectoData.get(0).getStrEMAIL(),proyectoData.get(0).getStrMONTH(),proyectoData.get(0).getStrDAY(),proyectoData.get(0).getStrYEAR())));

    }

    @When("^fill in the form fields$")
    public void fillInTheFormFields(List<ProyectoData2> proyectoData2) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Addres.the(proyectoData2.get(0).getStrCITY(),proyectoData2.get(0).getStrZIP(),proyectoData2.get(0).getStrCOUNTRY()), Devices.the(proyectoData2.get(0).getStrCOMP(),proyectoData2.get(0).getStrVERSION(),proyectoData2.get(0).getStrLANG(),proyectoData2.get(0).getStrMOBILE(),proyectoData2.get(0).getStrMODEL(),proyectoData2.get(0).getStrOS()));

    }

    @Then("^finish the form and click to send it$")
    public void finishTheFormAndClickToSendIt(List<ProyectoData3> proyectoData3) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Passwd.the(proyectoData3.get(0).getStrPASSWD(),proyectoData3.get(0).getStrCONFPASS()));

    }
}
