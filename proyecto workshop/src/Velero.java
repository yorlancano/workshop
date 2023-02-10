public class Velero extends Embarcacion{
    private int CantidadMastiles = 0;
    public Velero(){}
    public Velero(Capitan capitan, int precioBase, int añoFabricacion, int valorAdicional, int eslora, int cantidadMastiles) {
        super(capitan, precioBase, añoFabricacion, valorAdicional, eslora);
        CantidadMastiles = cantidadMastiles;
    }

    public int getCantidadMastiles() {
        return CantidadMastiles;
    }

    public void setCantidadMastiles(int cantidadMastiles) {
        CantidadMastiles = cantidadMastiles;
    }
    @Override
    public int calcularMontoAlquiler(){

        if(getAñoFabricacion() > 2020){
            return getPrecioBase() + getValorAdicional();
        }
        return getPrecioBase();
    }
    public String tamañoVelero(){
        if(getCantidadMastiles() > 4){
            return "El velero es grande";
        }
        return  "El velero es pequeño";
    }
}
