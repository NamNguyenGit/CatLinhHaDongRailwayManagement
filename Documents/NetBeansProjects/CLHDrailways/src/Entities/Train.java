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
    private int Train_id;
    private int Status;
 
    public Train() {
    }

    public Train(int Id, int Train_id, int Status) {
        this.Id = Id;
        this.Train_id = Train_id;
        this.Status = Status;
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

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    @Override
    public String toString() {
        return "Train{" + "Id=" + Id + ", Train_id=" + Train_id + ", Status=" + Status + '}';
    }
    
    

    
}