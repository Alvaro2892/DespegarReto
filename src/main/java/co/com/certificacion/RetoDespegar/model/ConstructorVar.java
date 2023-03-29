package co.com.certificacion.RetoDespegar.model;

public class ConstructorVar
{
    private String detino;
    private String origen;

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public ConstructorVar(String detino, String origen) {
        this.detino = detino;
        this.origen = origen;

    }

    public String getDetino() {
        return detino;
    }

    public void setDetino(String detino) {
        this.detino = detino;
    }
}
