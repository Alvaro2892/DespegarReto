package co.com.certificacion.RetoDespegar.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UIInforReserva
{
    public static final Target DESTINO = Target.the("click y luego ingreso el destino").located(By.xpath("(//input[@class='input-tag'])[2]"));
    public static final Target ORIGEN = Target.the("click y luego ingreso el origen").located(By.xpath("(//input[@class='input-tag'])[1]"));

    public static final Target CLICKDESTINO = Target.the("click para escoger el destino").located(By.xpath("(//span[@class='item-text'])[1]"));
    public static final Target CLICKORIGEN = Target.the("click para escoger el origen").located(By.xpath("(//span[@class='item-text'])[1]"));

    public static final Target FECHAIDA = Target.the("click para escoger fecha ida").located(By.xpath("(//input[@class='input-tag'])[3]"));
    public static final Target ESCOGERFECHAIDA = Target.the("click para escoger fecha ida").located(By.xpath("(//div[@class='sbox5-monthgrid-datenumber-number'])[30]"));
    public static final Target ESCOGERFECHAVUELTA = Target.the("click para escoger fecha vuelta").located(By.xpath("(//div[@class='sbox5-monthgrid-datenumber-number'])[31]"));
    public static final Target CLICKBOTONAPLICAR = Target.the("click en el botón aplicar ").located(By.xpath("(//button[@class='sbox5-3-btn -primary -md'])"));
    public static final Target CLICKBOTONBUSCAR = Target.the("click en el botón Buscar ").located(By.xpath("(//em[contains(text (), 'Buscar')])"));
    public static final Target CLICKANUNCIO = Target.the("click para quitar anuncio ").located(By.xpath("//i[@class='login-incentive--close shifu-3-icon-close -eva-3-mr-md']"));
    public static final Target ANUNCIO = Target.the("Espera explicita de cargue de la p+agina ").located(By.xpath("(//label[@class='button-circle-label'])[2]"));
    public static final Target CLICKCOOKIES = Target.the("click para quitr anuncio de cookies").located(By.xpath("(//a[@class='lgpd-banner--button eva-3-btn -white -md'])"));
    public static final Target EXTRAERINFORMACION = Target.the("Extraer informacion de los vuelos").located(By.xpath("(//span[@class='main-value'])[1]"));
    public static final Target NOMBREHOTEL = Target.the("Scroll a nombre de hotel").located(By.xpath("(//div[@class='button-content'])[2]"));
    public static final Target CLICKBOTONSIGUIENTE = Target.the("click en el botón Buscar ").located(By.xpath("(//em[contains(text (), 'Siguiente')])"));






}