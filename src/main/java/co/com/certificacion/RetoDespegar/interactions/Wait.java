package co.com.certificacion.RetoDespegar.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Wait implements Interaction {

    private final long milisegundos;


    public Wait(long milisegundos) {
        this.milisegundos = milisegundos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {

            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static Wait por(long milisegundos) {
        return Tasks.instrumented(Wait.class, milisegundos);
    }


}