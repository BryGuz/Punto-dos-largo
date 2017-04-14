/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancomain;

import java.util.Scanner;

/**
 *
 * @author Bryan M
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
       return(day+" / " + month + " / " + year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}