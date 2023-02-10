public class Yate extends Embarcacion {
    private int CantidadCamarotes = 0;
    public Yate(){

    }
    public Yate(Capitan capitan, int precioBase, int añoFabricacion, int valorAdicional, int eslora, int cantidadCamarotes) {
        super(capitan, precioBase, añoFabricacion, valorAdicional, eslora);
        CantidadCamarotes = cantidadCamarotes;
    }

    public int getCantidadCamarotes() {
        return CantidadCamarotes;
    }

    public void setCantidadCamarotes(int cantidadCamarotes) {
        CantidadCamarotes = cantidadCamarotes;
    }
    @Override
    public int calcularMontoAlquiler(){

        if(getAñoFabricacion() > 2020){
            return getPrecioBase() + getValorAdicional();
        }
        return getPrecioBase();
    }

    public String obternClaseYate(){
        if(getCantidadCamarotes() >= 7){
            return "el yate es de clase alta";
        }
        return "el yate es de clase baja-media";
    }

    public int  comprarYate(int dinero){
        if(dinero > getPrecioBase()){
            System.out.println("felicidades por comprar en Makaia");
            System.out.println("Devueltas:");
            return dinero - getPrecioBase();
        }
        System.out.println("para comprar el yate necista:");
        return getPrecioBase() - dinero ;
    }
}
    