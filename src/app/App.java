/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class App extends javax.swing.JFrame {
    public static void main (String[] args){

        try{
            for(int i=0; i<=100; i++){
                Thread.sleep(50);
                SignIn signUp = new SignIn();                        
                if(i==100){              
                    signUp.show();
                }
            }
        }
        catch(Exception e){
            
        }

    }
}
