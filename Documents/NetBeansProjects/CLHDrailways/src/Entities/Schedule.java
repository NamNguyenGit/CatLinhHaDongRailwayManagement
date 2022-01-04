/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;

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
    private Date Departure_date;
    private int Train_status;

    public Schedule() {
    }

    public Schedule(int Id, int Train_id, String Departure, String Destination, String Departure_time, Date Departure_date, int Train_status) {
        this.Id = Id;
        this.Train_id = Train_id;
        this.Departure = Departure;
        this.Destination = Destination;
        this.Departure_time = Departure_time;
        this.Departure_date = Departure_date;
        this.Train_status = Train_status;
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

    public Date getDeparture_date() {
        return Departure_date;
    }

    public void setDeparture_date(Date Departure_date) {
        this.Departure_date = Departure_date;
    }

    public int getTrain_status() {
        return Train_status;
    }

    public void setTrain_status(int Train_status) {
        this.Train_status = Train_status;
    }

    
    

    
}
