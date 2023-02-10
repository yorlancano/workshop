public class Embarcacion {
    private Capitan capitan;
    private int PrecioBase = 0;
    private int AñoFabricacion = 0;
    private int ValorAdicional = 0;
    private int Eslora = 0;

    public Embarcacion(Capitan capitan, int precioBase, int añoFabricacion, int valorAdicional, int eslora) {
        this.capitan = capitan;
        this.PrecioBase = precioBase;
        this.AñoFabricacion = añoFabricacion;
        this.ValorAdicional = valorAdicional;
        this.Eslora = eslora;
    }

    public Embarcacion() {
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    public int getPrecioBase() {
        return PrecioBase;
    }

    public void setPrecioBase(int precioBase) {
        PrecioBase = precioBase;
    }

    public int getAñoFabricacion() {
        return AñoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        AñoFabricacion = añoFabricacion;
    }

    public int getValorAdicional() {
        return ValorAdicional;
    }

    public void setValorAdicional(int valorAdicional) {
        ValorAdicional = valorAdicional;
    }

    public int getEslora() {
        return Eslora;
    }

    public void setEslora(int eslora) {
        Eslora = eslora;
    }

    public int calcularMontoAlquiler(){

        if(getAñoFabricacion() > 2020){
            return getPrecioBase() + getValorAdicional();
        }
        return getPrecioBase();
    }


}
