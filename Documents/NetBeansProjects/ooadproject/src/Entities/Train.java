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
public class Train {
    private int Id ;
    private String Train_id;
    private String Status;
    private int Shedule_id;

    public Train() {
    }

    public Train(int Id, String Train_id, String Status, int Shedule_id) {
        this.Id = Id;
        this.Train_id = Train_id;
        this.Status = Status;
        this.Shedule_id = Shedule_id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTrain_id() {
        return Train_id;
    }

    public void setTrain_id(String Train_id) {
        this.Train_id = Train_id;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getShedule_id() {
        return Shedule_id;
    }

    public void setShedule_id(int Shedule_id) {
        this.Shedule_id = Shedule_id;
    }

    
    
}
