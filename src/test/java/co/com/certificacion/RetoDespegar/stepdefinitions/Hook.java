package co.com.certificacion.RetoDespegar.stepdefinitions;

import co.com.certificacion.RetoDespegar.model.ConstructorVar;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

public class Hook
{




    @Before
    public void prepareStage()
    {

        OnStage.setTheStage(new OnlineCast());


    }

    @DataTableType
    public ConstructorVar defineConstructorVar(Map<String, String> dataTable) {
        // Crea una instancia de ConstructorVar usando los datos de la tabla
        return new ConstructorVar(dataTable.get("destino"), dataTable.get("origen"));
    }








}
