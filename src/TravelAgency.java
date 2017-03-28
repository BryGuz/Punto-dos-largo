import java.util.Scanner;

/**
 * Created by lotalorafox on 3/27/2017.
 */
public class TravelAgency {
    private String name;
    private Airport[] airports = new Airport[4];
    private Travel[] offeredTravels;
    private Hotel[] knownHotels;
    int nhotel;
    int nairport;
    int ntravels;
    Scanner sc = new Scanner(System.in);

    public TravelAgency(String n,int a,int b){
        this.name = n;
        this.offeredTravels = new Travel[a];
        this.knownHotels = new Hotel[b];
        nhotel =0;
         nairport=0;
         ntravels=0;
    }
    /*public void rellenar(){
        for (int i=0;i<4;i++){
            airports[i] = new Airport("");
        }
    }*/

    public void registerHotels(){
        for (int i=0;i<knownHotels.length;i++){
            System.out.println("ingrese el nombre del hotel: " + (i+1));
            String n = sc.next();
            boolean crear =true;
            for (int j=0;j<nhotel;j++){
                if(n.equals(knownHotels[j].getName())) {
                    System.out.println("el hotel ya existe");
                    i--;
                    crear = false;
                }
            }
            if(crear){
                System.out.println("ingrese la direccion del hotel: " + (i+1));
                String d = sc.next();
                knownHotels[i] = new Hotel(n,d);
                nhotel++;
            }
        }
    }
    public void printHotels(){
        for (int i=0;i<knownHotels.length;i++){
            System.out.println((i+1) + " el hotel " + knownHotels[i].getName());
        }
    }
    public void printAirports(){
        for (int i=0;i<airports.length;i++){
            System.out.println((i+1) + " el aereopueto " + airports[i].getDescription());
        }
    }

    public void registerAirports(){
        for (int i =0;i<4;i++){
            System.out.println("ingrese el nombre del aereopuerto: " + (i+1));
            String n = sc.next();
            boolean crear = true;
            for (int j=0;j<nairport;j++){
                if(n.equals(this.airports[j].getDescription())){
                    System.out.println("el aereopuerto ya existe");
                    i--;
                    crear =false;
                }
            }
            if(crear){
                airports[i] = new Airport(n);
                nairport++;
            }
        }
    }

    public void registerTravels(){
        for (int i =0;i<this.offeredTravels.length;i++){
            System.out.println("ingrese la fecha del viaje");
            Date today = new Date();
            System.out.println("ingrese la duracion");
            int d = sc.nextInt();
            System.out.println("Seleccione el hotel");
            this.printHotels();
            int hn = sc.nextInt();
            Hotel h = knownHotels[hn-1];
            System.out.println("ingrese numero de vuelo");
            int nv = sc.nextInt();
            System.out.println("ingrese la fecha de salida");
            Date out = new Date();
            System.out.println("ingrese la fecha de llegada");
            Date arrival = new Date();
            System.out.println("Seleccione el aereopuerto de salida");
            this.printAirports();
            int as = sc.nextInt();
            Airport asalida = airports[as-1];
            System.out.println("Seleccione el aereopuerto de llegada");
            this.printAirports();
            int al = sc.nextInt();
            Airport aarrival = airports[al-1];
            BookedFlight ida = new BookedFlight(nv,out,out ,asalida,aarrival);
            BookedFlight vuelta = new BookedFlight(nv,arrival,arrival,aarrival,asalida);

            Travel viaje = new Travel(today,d,h,ida,vuelta);
            boolean crear = true;
            for (int j =0;j<ntravels;j++){
                if(viaje.equals(offeredTravels[j])){
                    System.out.println("Ese viaje ya existe");
                    i--;
                    crear =false;
                }
            }
            if(crear){
                offeredTravels[i] = viaje;
                ntravels++;
            }

        }
    }
    public void listtravels(){
        for (int i=0;i<this.offeredTravels.length;i++){
            System.out.println("Viaje numero " + (i+1));
            System.out.println("Fecha de salida: " + offeredTravels[i].getStart().print());
            System.out.println("Duracion: "  + offeredTravels[i].getDuration());
            System.out.println("Hotel: " +offeredTravels[i].getHotel().getName() );
            System.out.println("la reserva de ida: ");
            this.offeredTravels[i].getOutbound().printinfo();
            System.out.println("la reserva de vuelta: ");
            this.offeredTravels[i].getReturned().printinfo();
        }
    }
    public void listtravelsbyduration(){
        Travel[] viajes = new Travel[ntravels];
        for(int k=0;k<this.offeredTravels.length;k++){
            viajes[k] = offeredTravels[k];
        }
            for (int j=1;j<this.offeredTravels.length;j++) {
                if(viajes[j].getDuration()>viajes[j-1].getDuration()){
                   Travel tem = viajes[j-1];
                   viajes[j-1] = viajes[j];
                   viajes[j] = tem;
                }
            }
            for (int i=0;i<this.offeredTravels.length;i++){
                System.out.println("Fecha de salida: " + viajes[i].getStart().print());
                System.out.println("Duracion: " + viajes[i].getDuration());
                System.out.println("Hotel: " + viajes[i].getHotel().getName());
                System.out.println("la reserva de ida: ");
                viajes[i].getOutbound().printinfo();
                System.out.println("la reserva de vuelta: ");
                viajes[i].getReturned().printinfo();
            }

    }
}
