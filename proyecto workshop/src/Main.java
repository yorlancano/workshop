import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("----------------------- Bienvenido a Makaia -------------------------");
        int opcion;
        do{
            System.out.println();
            System.out.println("-Somos una compañia que brinda servicios de embarcaciones ");
            System.out.println("Digite 1 - si quieres adquilar un velero" + "\nDigite 2 - si quieres adquilar un yate " + "\nDigite 0 - para salir");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println();
                    Capitan capitan = new Capitan("Marcos","Martinez","23CDEfg");
                    System.out.println(capitan.toString());
                    Velero veleros = new Velero(capitan, 400000, 2021, 200000, 24, 5);
                    System.out.println(veleros.calcularMontoAlquiler());
                    System.out.println(veleros.tamañoVelero());
                    break;
                case 2:
                    System.out.println();
                    System.out.println("- Si quieres comprar el yate marque: 1 " + "\n- Si quieres adquilar el yate marque: 2");
                    int opcion2 = scanner.nextInt();
                    switch (opcion2){
                        case 1:
                            Yate yate = new Yate();
                            System.out.println("Digite el dinero con el que va ha pagar el yate: ");
                            yate.setPrecioBase(40000000);
                            int dinero = scanner.nextInt();
                            if(dinero > yate.getPrecioBase()){
                                yate.setCantidadCamarotes(9);
                                System.out.println(yate.obternClaseYate());
                                System.out.println(yate.comprarYate(dinero));

                            }else{
                                System.out.println("lo sentimos no tienes el dinero suficiente");
                            }

                            break;
                        case 2:
                            Capitan capitan1 = new Capitan("Manuel","Marquinez", "21WHITsi");
                            System.out.println(capitan1.toString());
                            Yate yates = new Yate(capitan1,600000, 2022, 300000, 45, 8);
                            System.out.println(yates.calcularMontoAlquiler());
                            System.out.println(yates.obternClaseYate());
                            break;
                    }
                    break;
            }
        }while(opcion != 0);





    }
}