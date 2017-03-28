/**
 * Created by lotalorafox on 3/27/2017.
 */
public class Travel {
    private Date start;
    private int duration;
    private Hotel hotel;
    private BookedFlight outbound;
    private BookedFlight returned;

    public Travel(Date s,int d,Hotel h,BookedFlight o,BookedFlight r){
        this.start =s;
        this.duration = d;
        this.hotel = h;
        this.outbound =o;
        this.returned = r;
    }

    public BookedFlight getOutbound() {
        return outbound;
    }

    public Date getStart() {
        return start;
    }

    public BookedFlight getReturned() {
        return returned;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public int getDuration() {
        return duration;
    }

}
