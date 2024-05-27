/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import DAO.Connexion_Base;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Model.Admin_model;
import java.sql.ResultSet;
/**
 *
 * @author ideal
 */
class Admin {
     //methode Admin_Add
    public void Admin_Add(Admin a){
        //connexion à la base
        Connexion_Base cb= new Connexion_Base();
        cb.connect();
        //requete sql
        String rep="insert into admin (nom, prenom,login ,password)values('"+a.getNom"','"+a.getPrenom()+"','"+a.getLogin()+"','"+a.getPassword()+"')";
    
        try {
            //execution
            cb.st.executeUpdate(rep);
            JOptionPane.showMessageDialog(null, "L'admin est ajouté avec succès");
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    //methode Admin_Update
    public void Admin_Update(Admin a){
       //connexion
        Connexion_Base cb=new Connexion_Base();
        cb.connect();
        
        //requete
        String rep="update admin set nom='"+a.getNom()+"',prenom='"+a.getPrenom()+"',age='"+a.getLogin()+"',sexe='"+a.getSexe()+"' where id='"+a.getId()+"'";
        
        try {
            //execution
            cb.st.executeUpdate(rep);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //methode Patient_Del
    public void Patient_Del(int codeP){
        Connexion_Base cb=new Connexion_Base();
        cb.connect();
        
        String rep="Delete from admin where id='"+id+"'";
        try {
            cb.st.executeUpdate(rep);
            JOptionPane.showMessageDialog(null, "Patient supprimé avec succès");
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //methode Patient_Find
    public Admin Admin_Find(int id){
        Admin a=null;
        Connexion_Base cb=new Connexion_Base();
        cb.connect();
        
        String rep="Select * from admin where id='"+id+"'";
        
        ResultSet rs;
        try {
            rs=cb.st.executeQuery(rep);
            if (rs.next()){
            a.setId(rs.getInt("id"));
            a.setNom(rs.getString("nom"));
            a.setPrenom(rs.getString("prenom"));
            a.setLogin(rs.getString("login"));
            a.setPassword(rs.getString("password"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    return a; 
    }
    
    
    //methode Patient_Liste
    public ResultSet Admin(){
        ResultSet rs=null;
        Admin a=new Admin();
        Connexion_Base cb=new Connexion_Base();
        cb.connect();
        
        String rep="Select * from admin ";

        try {
            rs=cb.st.executeQuery(rep);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
    }
}

