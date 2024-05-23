/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author yanaf
 */
public class Admin_model {
    
    
private int id;
private String prenom;
private String nom;
private String login;
private String password;


    public Admin_model() {}

    public Admin_model(int id, String prenom, String nom, String login, String spassword) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.login = login;
        this.password = password;
       
    }

    public Admin_model(String prenom, String nom, String login, String password) {
        this.prenom = prenom;
        this.nom = nom;
        this.login = login;
        this.password = password;
        
    }

    public int getId() {
        return id;
    }

    public String getprom() {
        return prenom;
    }

    public String getnom() {
        return nom;
    }

    public String getlogin() {
        return login;
    }

    public String getpassword() {
        return password;
    }

    

    public void setId(int id) {
        this.id = id;
    }

    public void setprenom(String prenom) {
        this.prenom = prenom;
    }

    public void setPrenom(String prenom) {
        this.nom = nom;
    }

    public void setlogin(String login) {
        this.login = login;
    }

    public void setpassword(String password) {
        this.password = password;
    }   

}


