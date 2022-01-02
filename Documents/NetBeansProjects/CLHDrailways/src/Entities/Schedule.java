/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author acer
 */
public class Schedule {
    private int Id ;
    private int Train_id;
    private String Departure;
    private String Destination;
    private String Departure_time;
    private String Departure_date;

    public Schedule() {
    }

    public Schedule(int Id, int Train_id, String Departure, String Destination, String Departure_time, String Departure_date) {
        this.Id = Id;
        this.Train_id = Train_id;
        this.Departure = Departure;
        this.Destination = Destination;
        this.Departure_time = Departure_time;
        this.Departure_date = Departure_date;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getTrain_id() {
        return Train_id;
    }

    public void setTrain_id(int Train_id) {
        this.Train_id = Train_id;
    }

    public String getDeparture() {
        return Departure;
    }

    public void setDeparture(String Departure) {
        this.Departure = Departure;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public String getDeparture_time() {
        return Departure_time;
    }

    public void setDeparture_time(String Departure_time) {
        this.Departure_time = Departure_time;
    }

    public String getDeparture_date() {
        return Departure_date;
    }

    public void setDeparture_date(String Departure_date) {
        this.Departure_date = Departure_date;
    }
    
    

}
