/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.Date;

/**
 *
 * @author acer
 */
public class Ticket {
    private int Id ;
    private int User_id;
    private String User_name;
    private Date Date_buy;
    private Date Renew_date;
    private Date Expire_date;

    public Ticket() {
    }

    public Ticket(int Id, int User_id, String User_name, Date Date_buy, Date Renew_date, Date Expire_date) {
        this.Id = Id;
        this.User_id = User_id;
        this.User_name = User_name;
        this.Date_buy = Date_buy;
        this.Renew_date = Renew_date;
        this.Expire_date = Expire_date;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getUser_id() {
        return User_id;
    }

    public void setUser_id(int User_id) {
        this.User_id = User_id;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String User_name) {
        this.User_name = User_name;
    }

    public Date getDate_buy() {
        return Date_buy;
    }

    public void setDate_buy(Date Date_buy) {
        this.Date_buy = Date_buy;
    }

    public Date getRenew_date() {
        return Renew_date;
    }

    public void setRenew_date(Date Renew_date) {
        this.Renew_date = Renew_date;
    }

    public Date getExpire_date() {
        return Expire_date;
    }

    public void setExpire_date(Date Expire_date) {
        this.Expire_date = Expire_date;
    }
    
    
}
