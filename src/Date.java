import java.util.Scanner;

/**
 * Created by lotalorafox on 3/27/2017.
 */
public class Date {
    public int day;
    public int month;
    public int year;
    Scanner sc = new Scanner(System.in);

    public Date(int d,int m,int y){
        this.day = d;
        this.month = m;
        this.year =y;
    }

    public  Date(){
        System.out.println("ingresa el dia:");
        this.day = sc.nextInt();
        System.out.println("ingresa el mes:");
        this.month = sc.nextInt();
        System.out.println("ingresa el año:");
        this.year = sc.nextInt();
    }

    public String print(){
       return(day+" / " + month + "/" + year);
    }

}
