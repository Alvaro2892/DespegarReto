package co.com.certificacion.RetoDespegar.tasks;

import co.com.certificacion.RetoDespegar.interactions.Wait;
import co.com.certificacion.RetoDespegar.model.ConstructorVar;
import co.com.certificacion.RetoDespegar.userinterface.UIInforReserva;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.targets.Target;


import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;



import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ReservarVuelo implements Task
{

    private List<ConstructorVar> constructorVars;

    public ReservarVuelo (List<ConstructorVar> constructorVars)
    {
        this.constructorVars = constructorVars;
    }

    public static ReservarVuelo enDepegar(List<ConstructorVar> constructorVars)

    {
      return   Tasks.instrumented(ReservarVuelo.class, constructorVars);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        for (ConstructorVar constructorVar : constructorVars)
        {
            actor.attemptsTo
                    (
                            Click.on(UIInforReserva.ORIGEN),
                            Enter.theValue(constructorVar.getOrigen()).into(UIInforReserva.ORIGEN),
                            Click.on(UIInforReserva.CLICKORIGEN),
                            Click.on(UIInforReserva.DESTINO),
                            Enter.theValue(constructorVar.getDetino()).into(UIInforReserva.DESTINO),
                            Click.on(UIInforReserva.CLICKDESTINO),
                            Click.on(UIInforReserva.CLICKANUNCIO),
                            Click.on(UIInforReserva.CLICKCOOKIES),
                            Click.on(UIInforReserva.FECHAIDA),
                            Click.on(UIInforReserva.ESCOGERFECHAIDA),
                            Click.on(UIInforReserva.ESCOGERFECHAVUELTA),
                            Click.on(UIInforReserva.CLICKBOTONAPLICAR),
                            Click.on(UIInforReserva.CLICKBOTONBUSCAR),
                            WaitUntil.the(UIInforReserva.ANUNCIO, isVisible()),
                            WaitUntil.the(UIInforReserva.EXTRAERINFORMACION, isVisible())


                    );


            WebDriver driver = BrowseTheWeb.as(actor).getDriver();
            String xpath = "(//span[@class='main-value'])[%d]";
            // xpath cambiante:  amount price-amount    ---- main-value


            int numeroMasCercano =0;
            int decimal;
            int index = 0 ;
            List<WebElement> elementos = driver.findElements(By.xpath("//span[@class='main-value']"));
            for (int i = 0; i < elementos.size(); i++) {
                String xpathElemento = String.format(xpath, i + 1);
                Target elemento = Target.the("elemento").located(By.xpath(xpathElemento));
                String element = elemento.resolveFor(actor).getText().replace(".", "");
                decimal = Integer.parseInt(element);

                if (decimal < 2000000 && decimal > numeroMasCercano){
                    numeroMasCercano = decimal;
                    index = i;
                }
            }

            System.out.println("El número más cercano por debajo a 2000000 es: " + numeroMasCercano);
            String xpathElementoc = String.format(xpath,index);
            Target elementodes = Target.the("elemento").located(By.xpath(xpathElementoc));
            actor.attemptsTo(
                    Click.on(elementodes),
                    Wait.por(10000)



            );
            actor.attemptsTo(Switch.toNewWindow(),
                    Click.on(UIInforReserva.CLICKBOTONSIGUIENTE));









            }







        }



}

