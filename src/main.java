import java.util.Scanner;

/**
 * Created by lotalorafox on 3/27/2017.
 */
public class main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el nombre de la agencia de viajes");
        String n = sc.next();
        System.out.println("ingrese el numero de viajes que oferta");
        int nv = sc.nextInt();
        System.out.println("ingrese el numero de hoteles disponibles");
        int nh = sc.nextInt();
        TravelAgency ta = new TravelAgency(n,nv,nh);
        //ta.rellenar();
        ta.registerAirports();
        ta.registerHotels();
        ta.registerTravels();
        boolean ejec = true;
        if(ejec) {
            System.out.println("1. listar los viajes");
            System.out.println("2. quieres listar los viajes segun duracion ");
            System.out.println("3. salir");
            int o = sc.nextInt();
            if (o == 1) {
                ta.listtravels();
            } else if(o==2) {

                ta.listtravelsbyduration();
            }else{
                System.out.println("gracias por usar nuestro software");
                ejec = false;
            }
        }
    }

}
