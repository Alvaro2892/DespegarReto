package co.com.certificacion.RetoDespegar.tasks;

import co.com.certificacion.RetoDespegar.userinterface.AbrirPaginaDespegar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task
{

    private AbrirPaginaDespegar abrirPaginaDespegar;

    public static AbrirPagina despegarVuelo()
    {
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Open.browserOn(abrirPaginaDespegar));

    }
}
