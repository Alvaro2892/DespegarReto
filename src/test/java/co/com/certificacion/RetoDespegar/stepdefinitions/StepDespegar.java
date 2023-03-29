package co.com.certificacion.RetoDespegar.stepdefinitions;

import co.com.certificacion.RetoDespegar.model.ConstructorVar;
import co.com.certificacion.RetoDespegar.tasks.AbrirPagina;
import co.com.certificacion.RetoDespegar.tasks.ReservarVuelo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDespegar
{
    @Given("que he seleccionado la opcion de busqueda de servicio de alojamiento")
    public void queHeSeleccionadoLaOpcionDeBusquedaDeServicioDeAlojamiento()
    {
        theActorCalled("Alvaro").wasAbleTo(AbrirPagina.despegarVuelo());
    }
    @When("selecciono un servicio de alojamiento dentro del rango de opciones disponibles luego ingreso los datos solicitados dependiendo del flujo de compra")
    public void seleccionoUnServicioDeAlojamientoDentroDelRangoDeOpcionesDisponiblesLuegoIngresoLosDatosSolicitadosDependiendoDelFlujoDeCompra(List<ConstructorVar> constructorVars)
    {
        theActorInTheSpotlight().attemptsTo(ReservarVuelo.enDepegar(constructorVars));
    }
    @Then("la busqueda del servicio de alojamiento se realiza correctamente")
    public void laBusquedaDelServicioDeAlojamientoSeRealizaCorrectamente()
    {

    }

}
