/**
 * Created by lotalorafox on 3/27/2017.
 */
public class BookedFlight {
    private int flightNumber;
    private Date departure;
    private Date arrival;
    private Airport from;
    private Airport to;

    public BookedFlight(int fn,Date fa,Date fs,Airport f,Airport t){
        this.flightNumber = fn;
        this.departure = fs;
        this.arrival = fa;
        this.from = f;
        this.to = t;
    }

    public Airport getFrom() {
        return from;
    }

    public Airport getTo() {
        return to;
    }

    public Date getArrival() {
        return arrival;
    }

    public Date getDeparture() {
        return departure;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void printinfo(){
        System.out.println("numero de vuelo: " + this.flightNumber);
        System.out.println("fecha de salida" + this.departure.print());
        System.out.println("aereopuerto de salida" + this.from.getDescription());
        System.out.println("fecha de llegada" + this.arrival.print());
        System.out.println("aereopueto de llegada" + this.to.getDescription());

    }
}
