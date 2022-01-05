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
public class User {
    private int Id ;
    private String Name;
    private String Dob;
    private String Gender;
    private String Phone;
    private int Role;
    private String Username;
    private String Password;
    private String Question;
    private String Answer;

    public User() {
    }

    public User(int Id, String Name, String Dob, String Gender, String Phone, int Role, String Username, String Password, String Question, String Answer) {
        this.Id = Id;
        this.Name = Name;
        this.Dob = Dob;
        this.Gender = Gender;
        this.Phone = Phone;
        this.Role = Role;
        this.Username = Username;
        this.Password = Password;
        this.Question = Question;
        this.Answer = Answer;
    }

    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public int getRole() {
        return Role;
    }

    public void setRole(int Role) {
        this.Role = Role;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    @Override
    public String toString() {
        return "User{" + "Id=" + Id + ", Name=" + Name + ", Dob=" + Dob + ", Gender=" + Gender + ", Phone=" + Phone + ", Role=" + Role + ", Username=" + Username + ", Password=" + Password + ", Question=" + Question + ", Answer=" + Answer + '}';
    }
    
    

   
    
    
}
